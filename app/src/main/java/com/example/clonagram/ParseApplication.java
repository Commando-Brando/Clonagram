package com.example.clonagram;

import com.parse.Parse;
import com.parse.ParseObject;

import android.app.Application;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        // register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("UayWRPHd7mOBPtKv3xBJmmU6tEhFCqXiXT39sQba")
                .clientKey("Bt4nRJ61We5mOfnYmf9F4rYa6nRt7XNN5d0zJjnb")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
