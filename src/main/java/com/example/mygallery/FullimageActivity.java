package com.example.mygallery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class FullimageActivity extends AppCompatActivity {

    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullimage);
        img =(ImageView)findViewById(R.id.imageView);
        Intent i =  getIntent();
        int position = i.getExtras().getInt("id");
       //imageAdapter adapter = new ImageAdapter(this);

        //ImageView imageView= (ImageView)findViewById(R.id.imageView);
        img.setImageResource(MainActivity.list.get(position).getImage());

    }
}
