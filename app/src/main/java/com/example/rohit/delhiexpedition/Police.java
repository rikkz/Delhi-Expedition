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

public class Police extends Fragment {
    public Police() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(getString(R.string.police_1_name),getString(R.string.police_1_desc),R.drawable.police));
        locations.add(new Location(getString(R.string.police_2_name),getString(R.string.police_2_desc),R.drawable.police));
        locations.add(new Location(getString(R.string.police_3_name),getString(R.string.police_3_desc),R.drawable.police));
        locations.add(new Location(getString(R.string.police_4_name),getString(R.string.police_4_desc),R.drawable.police));
        locations.add(new Location(getString(R.string.police_5_name),getString(R.string.police_5_desc),R.drawable.police));

        LocationAdapter adapter = new LocationAdapter(getActivity(),locations);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);


        return rootView;
    }

}
