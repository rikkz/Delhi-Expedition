package com.example.rohit.delhiexpedition;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Locale;


public class Restaurant extends Fragment {
    public Restaurant() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(getString(R.string.location_1_name),getString(R.string.location_1_desc),R.drawable.zaffran));
        locations.add(new Location(getString(R.string.location_1_name),getString(R.string.location_1_desc),R.drawable.baluchi));
        locations.add(new Location(getString(R.string.location_1_name),getString(R.string.location_1_desc),R.drawable.dakshin));
        locations.add(new Location(getString(R.string.location_1_name),getString(R.string.location_1_desc),R.drawable.indian_accent));
        locations.add(new Location(getString(R.string.location_1_name),getString(R.string.location_1_desc),R.drawable.shang_place));

        LocationAdapter adapter = new LocationAdapter(getActivity(),locations);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);


        return rootView;
    }
}
