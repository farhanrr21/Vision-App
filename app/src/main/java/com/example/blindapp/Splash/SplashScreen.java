package com.example.blindapp.Splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.blindapp.R;


public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        Handler timer = new Handler();
        timer.postDelayed(() -> {
            Intent pindah = new Intent(SplashScreen.this, SplashAudio.class);
            startActivity(pindah);
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
            finish();
        },2000);

    }
}