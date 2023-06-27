package com.example.blindapp.Splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import com.example.blindapp.MainActivity;
import com.example.blindapp.R;

public class SplashAudio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.audio_splashscreen);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        Handler timer = new Handler();
        timer.postDelayed(() -> {
            Intent pindah = new Intent(SplashAudio.this, MainActivity.class);
            startActivity(pindah);
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
            finish();
        },5000);
    }
}