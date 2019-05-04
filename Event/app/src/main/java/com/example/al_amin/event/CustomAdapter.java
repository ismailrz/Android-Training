package com.example.al_amin.event;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

import static com.example.al_amin.event.R.id.imageId;

public class CustomAdapter extends BaseAdapter {
    Context context;
    int[] photo;
    String[] namelist;
    private LayoutInflater inflater;
    CustomAdapter(Context context,int[] photo,String[] namelist){
        this.context=context;
        this.photo=photo;
        this.namelist=namelist;
    }
    @Override
    public int getCount() {
        return namelist.length;
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
        if (convertView==null){
           inflater= (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
          convertView= inflater.inflate( R.layout.view_layout,parent,false );
        }
        CircleImageView imageView=(CircleImageView) convertView.findViewById( R.id.imageId );
        TextView textView=(TextView)convertView.findViewById( R.id.textId );

        imageView.setImageResource( photo[position] );
        textView.setText( namelist[position] );
        return convertView;
    }
}
