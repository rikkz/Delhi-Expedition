package com.example.rohit.delhiexpedition;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class Tourist extends Fragment {
    public Tourist() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(getString(R.string.toursit_1_name),getString(R.string.toursit_1_desc),R.drawable.tourist1));
        locations.add(new Location(getString(R.string.toursit_2_name),getString(R.string.toursit_2_desc),R.drawable.tourist2));
        locations.add(new Location(getString(R.string.toursit_3_name),getString(R.string.toursit_3_desc),R.drawable.tourist3));
        locations.add(new Location(getString(R.string.toursit_4_name),getString(R.string.toursit_4_desc),R.drawable.tourist4));
        locations.add(new Location(getString(R.string.toursit_5_name),getString(R.string.toursit_5_desc),R.drawable.tourist5));


        LocationAdapter adapter = new LocationAdapter(getActivity(),locations);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);


        return rootView;
    }
}
