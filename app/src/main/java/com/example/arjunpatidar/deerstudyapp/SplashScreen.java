package com.example.arjunpatidar.deerstudyapp;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {

    ImageView imageView;
    AnimationDrawable anim;
    private  static  int SPLASH_TIME_OUT =2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


 // hii arjun patidar


        imageView = (ImageView)findViewById(R.id.imageView);
        if(imageView == null) throw new AssertionError();
        imageView.setBackgroundResource(R.drawable.deer_animation);

        anim = (AnimationDrawable)imageView.getBackground();

        anim.start();

    }
}
