package com.example.birat.major_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class splash extends AppCompatActivity {
    private ImageView imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        imageView2 = (ImageView) findViewById(R.id.imageView2);

        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.mytransition);
        imageView2.startAnimation(myanim);
        final Intent i = new Intent(this,Login.class);
        Thread timer = new Thread(){
            public void run () {
                try {
                    sleep(5000)  ;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    startActivity(i);
                    finish();

                }
            }
        };
                timer.start();
    }
}
