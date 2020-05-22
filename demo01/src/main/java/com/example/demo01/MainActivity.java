package com.example.demo01;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView[] img = new ImageView[12];
    private int[] imgpath  = new int[]{
            R.mipmap.af81b0e25651508a381aab335899ddd,R.mipmap.img02, R.mipmap.img03,
            R.mipmap.img01,R.mipmap.img02, R.mipmap.img03,
            R.mipmap.img01,R.mipmap.img02, R.mipmap.img03,
            R.mipmap.img01,R.mipmap.img02, R.mipmap.img03,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridLayout layout = (GridLayout) findViewById(R.id.layout);
        for(int i =0;i<imgpath.length; i++){
            img[i] = new ImageView(MainActivity.this);
            img[i].setImageResource(imgpath[i]);
            img[i].setPadding(6,6,6,6);
            ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(116,68);
            img[i].setLayoutParams(params);
            layout.addView(img[i]);

        }
    }
}
