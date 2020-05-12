package com.example.mygallery;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ImageAdapter extends BaseAdapter
{
  /*  private Context context;
    /*public Integer[] images = {
            R.id.img1,R.id.img11,
            R.id.img2,R.id.img12,
            R.id.img3,R.id.img13,
            R.id.img4,R.id.img14,
            R.id.img5,R.id.img15,
            R.id.img6,R.id.img16,
            R.id.img7,R.id.img17,
            R.id.img8,R.id.img18,
            R.id.img9,R.id.img19,
            R.id.img10,R.id.img20,
    };

    public ImageAdapter(Context c){
        context =c;
    }

    @Override
    public int getCount() {
        return im
    }

    @Override
    public Object getItem(int position) {
        return images[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(images[position]);
        return imageView;
    }
}
*/

    ArrayList<CustomArray> al_items;
    Context context;

    ViewHolder viewHolder;

    public ImageAdapter(ArrayList<CustomArray> al_items, Context context) {
        this.al_items = al_items;
        this.context = context;
    }

    @Override
    public int getCount() {
        return al_items.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;

        if (convertView == null) {

            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(context);  //pass the reference of activity
            convertView = inflater.inflate(R.layout.activity_fullimage, parent, false);
            viewHolder.imageView = (ImageView) convertView.findViewById(R.id.imageView);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.imageView.setImageResource(al_items.get(position).getImage());


        return convertView;
    }

    private static class ViewHolder {
          /* all names of the buttons and textviews are define here */
        ImageView imageView;
    }
}
