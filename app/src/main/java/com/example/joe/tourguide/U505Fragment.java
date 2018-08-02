package com.example.joe.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class U505Fragment extends Fragment {


    public U505Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        final ArrayList<Tour> tours = new ArrayList<>();
        tours.add(new Tour(getString(R.string.the_u505_exhibit_info), R.drawable.csm_u505_theexhibit));
        tours.add(new Tour(getString(R.string.restoration_info), R.drawable.csm_u505_restoration));
        tours.add(new Tour(getString(R.string.interactives_info), R.drawable.csm_u505_interactives));

        TourAdapter adapter = new TourAdapter(getActivity(), tours, R.color.u505_submarine_color);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
