package com.example.joe.tourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TourAdapter extends ArrayAdapter<Tour> {

    public TourAdapter(Activity context, ArrayList<Tour> tours) {
        super(context, 0, tours);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Tour currentExhibit = getItem(position);

        TextView exhibitTextView = listItemView.findViewById(R.id.exhibit_information);
        exhibitTextView.setText(currentExhibit.getExhibitInfo());

        ImageView imageResourceView = listItemView.findViewById(R.id.exhibit_photo);
        imageResourceView.setImageResource(currentExhibit.getImageResourceId());

        return listItemView;
    }
}
