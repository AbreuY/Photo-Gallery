package com.example.mygallery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    GridView items;

    public static ArrayList<CustomArray> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = (GridView) findViewById(R.id.gridView);
        //gridView.setAdapter(new ImageAdapter(this));

        list =new ArrayList<>();
        list.add(new CustomArray(R.drawable.img1));
        list.add(new CustomArray(R.drawable.img2));
        list.add(new CustomArray(R.drawable.img3));
        list.add(new CustomArray(R.drawable.img4));
        list.add(new CustomArray(R.drawable.img5));
        list.add(new CustomArray(R.drawable.img6));
        list.add(new CustomArray(R.drawable.img7));
        list.add(new CustomArray(R.drawable.img8));
        list.add(new CustomArray(R.drawable.img9));
        list.add(new CustomArray(R.drawable.img10));
        list.add(new CustomArray(R.drawable.img11));
        list.add(new CustomArray(R.drawable.img12));
        list.add(new CustomArray(R.drawable.img13));
        list.add(new CustomArray(R.drawable.img14));
        list.add(new CustomArray(R.drawable.img15));
        list.add(new CustomArray(R.drawable.img16));
        list.add(new CustomArray(R.drawable.img17));
        list.add(new CustomArray(R.drawable.img18));
        list.add(new CustomArray(R.drawable.img19));
        list.add(new CustomArray(R.drawable.img20));
        ImageAdapter adapter=new ImageAdapter(list,getApplicationContext());
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getApplicationContext(),FullimageActivity.class);
                i.putExtra("id",position);
                startActivity(i);
            }
        });
    }

    @Override
    public void onClick(View v) {
        Intent anyname = new Intent(getApplicationContext(),FullimageActivity.class);
        //anyname.putExtra("id",);


        startActivity(anyname);

    }
}
