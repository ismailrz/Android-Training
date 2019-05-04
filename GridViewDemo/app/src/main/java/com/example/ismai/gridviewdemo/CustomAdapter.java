package com.example.ismai.gridviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

   Context context;
   int[] flags;
   String[] countryName;
   private LayoutInflater inflater;

   CustomAdapter(Context context, int[] flags, String[] countryName){
       this.context = context;
       this.countryName= countryName;
       this.flags = flags;
   }

    @Override
    public int getCount() {
        return countryName.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

       if(convertView == null){
           inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

          convertView = inflater.inflate(R.layout.simple_view, parent, false);

       }

        ImageView imageView = convertView.findViewById(R.id.imageViewId);
        TextView textView = convertView.findViewById(R.id.textViewId);
        imageView.setImageResource(flags[position]);
        textView.setText(countryName[position]);

        return convertView;
    }
}
