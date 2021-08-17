package com.example.zoominout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ImageView imageView;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        imageView=(ImageView) findViewById(R.id.imageView);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_in);
                imageView.startAnimation(animation);
            }
        });
         b2.setOnClickListener(new View.OnClickListener() {
        @Override
    public void onClick(View v) {
            Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
            imageView.startAnimation(animation);
    }
});

    }
}