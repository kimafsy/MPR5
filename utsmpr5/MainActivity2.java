package com.example.utsmpr5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
    ImageView imageView;
    Drawable drawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imageView=findViewById(R.id.imageview1);
        drawable=getResources().getDrawable(R.drawable.image);
        imageView.setImageDrawable(drawable);
    }

    public void pindah(View view) {
    }
}