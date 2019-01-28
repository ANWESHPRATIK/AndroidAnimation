package com.mindweaver.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    public void fade(View view){

        ImageView bart=(ImageView)findViewById(R.id.bart);
        bart.animate().alpha(0.0f).setDuration(2000);

        ImageView homer=(ImageView)findViewById(R.id.homer);
        homer.animate().alpha(1f).setDuration(2000); }

      public void invisible(View view){

        ImageView homer=(ImageView)findViewById(R.id.homer);
        homer.animate().alpha(0.0f).setDuration(1000);
     }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
