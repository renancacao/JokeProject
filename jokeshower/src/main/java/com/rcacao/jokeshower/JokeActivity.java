package com.rcacao.jokeshower;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    public static final String ARG_JOKE = "joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        Intent intent = getIntent();

        if (intent != null){
            if (intent.hasExtra(ARG_JOKE)){
                ((TextView) findViewById(R.id.textView_joke)).setText(intent.getStringExtra(ARG_JOKE));
            }
        }


    }
}
