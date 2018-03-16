package com.willblaschko.android.avs;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/*
*  ****************************************************************************
*  * Created by : Ahmed Mohmmad Ullah (Azim) on 3/16/2018 at 10:24 AM.
*  * Email : azim@w3engineers.com
*  * 
*  * Last edited by : Ahmed Mohmmad Ullah (Azim) on 3/16/2018.
*  * 
*  * Last Reviewed by : <Reviewer Name> on <mm/dd/yy>  
*  ****************************************************************************
*/
public class SplashActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 2000;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(i);
                overridePendingTransition(R.anim.right_to_left, R.anim.left_to_right);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
