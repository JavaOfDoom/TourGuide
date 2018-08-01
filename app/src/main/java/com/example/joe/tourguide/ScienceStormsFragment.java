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
public class ScienceStormsFragment extends Fragment {


    public ScienceStormsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        final ArrayList<Tour> tours = new ArrayList<>();
        tours.add(new Tour(getString(R.string.avalanche_info), R.drawable.csm_sciencestorms_avalanche));
        tours.add(new Tour(getString(R.string.atoms_info), R.drawable.csm_sciencestorms_ferrofluid));
        tours.add(new Tour(getString(R.string.lightning_info), R.drawable.csm_sciencestorms_tesla));
        tours.add(new Tour(getString(R.string.fire_info), R.drawable.csm_sciencestorms_fire));
        tours.add(new Tour(getString(R.string.sunlight_info), R.drawable.csm_sciencestorms_sunlight));
        tours.add(new Tour(getString(R.string.tornado_info), R.drawable.csm_sciencestorms_tornado));
        tours.add(new Tour(getString(R.string.tsunami_info), R.drawable.csm_sciencestorms_tsunami));

        TourAdapter adapter = new TourAdapter(getActivity(), tours);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
