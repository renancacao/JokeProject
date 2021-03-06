package com.rcacao.gradle.builditbigger.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.rcacao.gradle.builditbigger.backend.MyBean;
import javax.inject.Named;
import com.rcacao.jokelib.Joker;

/** An endpoint class we are exposing */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.rcacao.com",
                ownerName = "backend.builditbigger.gradle.rcacao.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    /** A simple endpoint method that takes a name and says Hi back */
    @ApiMethod(name = "sayHi")
    public MyBean sayHi(@Named("name") String name) {
        MyBean response = new com.rcacao.gradle.builditbigger.backend.MyBean();
        response.setData("Hi, " + name);

        return response;
    }

    @ApiMethod(name = "getJoke")
    public MyBean getJoke() {
        MyBean response = new com.rcacao.gradle.builditbigger.backend.MyBean();
        Joker joker = new Joker();
        response.setData(joker.getPiada());

        return response;
    }


}
