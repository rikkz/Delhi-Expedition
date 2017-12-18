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


public class Hospital extends Fragment {

    public Hospital() {
        // Required empty public constructor
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(getString(R.string.hospital_1_name),getString(R.string.hospital_1_desc),R.drawable.hospital));
        locations.add(new Location(getString(R.string.hospital_2_name),getString(R.string.hospital_2_desc),R.drawable.hospital));
        locations.add(new Location(getString(R.string.hospital_3_name),getString(R.string.hospital_3_desc),R.drawable.hospital));
        locations.add(new Location(getString(R.string.hospital_4_name),getString(R.string.hospital_4_desc),R.drawable.hospital));
        locations.add(new Location(getString(R.string.hospital_5_name),getString(R.string.hospital_5_desc),R.drawable.hospital));


        LocationAdapter adapter = new LocationAdapter(getActivity(),locations);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);


        return rootView;
    }
}
