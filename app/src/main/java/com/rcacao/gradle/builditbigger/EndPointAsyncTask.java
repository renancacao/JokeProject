package com.rcacao.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;

import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;
import com.rcacao.gradle.builditbigger.backend.myApi.MyApi;
import com.rcacao.jokeshower.JokeActivity;

import java.io.IOException;

public class EndPointAsyncTask extends AsyncTask<Void,Void,String> {

    private static MyApi myApiService = null;
    private Context context;

    EndPointAsyncTask(Context context) {
        this.context = context;
    }


    @Override
    protected String doInBackground(Void... pars) {
        return getJoke();
    }

    private String getJoke() {

        if (myApiService == null) {
            MyApi.Builder builder = new MyApi.Builder(AndroidHttp.newCompatibleTransport(),
                    new AndroidJsonFactory(), null)
                    .setRootUrl("http://udacity-builditvigger.appspot.com/_ah/api/")
                    .setGoogleClientRequestInitializer(new GoogleClientRequestInitializer() {
                        @Override
                        public void initialize(AbstractGoogleClientRequest<?> abstractGoogleClientRequest) throws IOException {
                            abstractGoogleClientRequest.setDisableGZipContent(true);
                        }
                    });


            myApiService = builder.build();
        }


        try {
            return myApiService.getJoke().execute().getData();
        } catch (IOException e) {
            Log.e("ApiRequest", e.getMessage());
            return e.getMessage();
        }
    }

    @Override
    protected void onPostExecute(String s) {
        Intent intent = new Intent(context, JokeActivity.class);
        intent.putExtra(JokeActivity.ARG_JOKE, s);
        context.startActivity(intent);
    }
}
