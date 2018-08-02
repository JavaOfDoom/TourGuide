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
public class FastForwardFragment extends Fragment {


    public FastForwardFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        final ArrayList<Tour> tours = new ArrayList<>();
        tours.add(new Tour(getString(R.string.cantu_info), R.drawable.csm_cantu));
        tours.add(new Tour(getString(R.string.de_grey_info), R.drawable.csm_de_grey));
        tours.add(new Tour(getString(R.string.despommier_info), R.drawable.csm_despommier));
        tours.add(new Tour(getString(R.string.diamandis_info), R.drawable.csm_diamandis));
        tours.add(new Tour(getString(R.string.howard_info), R.drawable.csm_howard));
        tours.add(new Tour(getString(R.string.johnson_info), R.drawable.csm_johnson));
        tours.add(new Tour(getString(R.string.jorda_info), R.drawable.csm_jorda));
        tours.add(new Tour(getString(R.string.kamkwamba_info), R.drawable.csm_william));
        tours.add(new Tour(getString(R.string.maisonnier_info), R.drawable.csm_bruno));
        tours.add(new Tour(getString(R.string.simpson_info), R.drawable.csm_simpson));

        TourAdapter adapter = new TourAdapter(getActivity(), tours, R.color.fast_forward_color);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
