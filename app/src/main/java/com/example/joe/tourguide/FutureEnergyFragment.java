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
public class FutureEnergyFragment extends Fragment {


    public FutureEnergyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        final ArrayList<Tour> tours = new ArrayList<>();
        tours.add(new Tour(getString(R.string.future_house), R.drawable.csm_futureenergy_house));
        tours.add(new Tour(getString(R.string.future_neighborhood), R.drawable.csm_futureenergy_neighborhood));
        tours.add(new Tour(getString(R.string.future_car), R.drawable.csm_futureenergy_car));
        tours.add(new Tour(getString(R.string.future_power), R.drawable.csm_futureenergy_power));
        tours.add(new Tour(getString(R.string.future_transportation), R.drawable.csm_futureenergy_transportation));

        TourAdapter adapter = new TourAdapter(getActivity(), tours, R.color.future_energy_color);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
