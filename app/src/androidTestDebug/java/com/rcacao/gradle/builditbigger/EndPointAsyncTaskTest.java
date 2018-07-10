package com.rcacao.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

import static junit.framework.Assert.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class EndPointAsyncTaskTest {

    String res = null;

    @Test
    public void asyncTask_ReturnNotEmptyJoke() throws InterruptedException, TimeoutException, ExecutionException {


        EndPointAsyncTask asyncTask = new EndPointAsyncTask(android.support.test.InstrumentationRegistry.getTargetContext());
        res = asyncTask.execute().get();

        assertNotNull(res);
    }
}
