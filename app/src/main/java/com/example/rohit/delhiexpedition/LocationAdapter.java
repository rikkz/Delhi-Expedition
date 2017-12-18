package com.example.rohit.delhiexpedition;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by Rohit on 19-12-2017.
 */

public class LocationAdapter extends ArrayAdapter<Location> {

    public LocationAdapter(Activity context, ArrayList<Location> locations) {
        super(context,0,locations);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        Location location = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        TextView descTextView = (TextView) listItemView.findViewById(R.id.desc_text_view);
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);


        nameTextView.setText(location.getLocationName());
        descTextView.setText(location.getLocationDescription());
        imageView.setImageResource(location.getLocationImageResourceId());


        return listItemView;
    }
}
