package com.example.android.tourguide;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by tetianakolesnik on 11/01/2018.
 */

public class PlaceListAdapter extends ArrayAdapter<Place> {

    public PlaceListAdapter(Activity context, ArrayList<Place> organisations) {
        super(context, 0, organisations);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Place currentPlace = getItem(position);
        final String postCode = currentPlace.getPlaceAddress().replaceAll(" ", "+");

        TextView name = (TextView) listItemView.findViewById(R.id.name_text_view);
        name.setText(currentPlace.getPlaceName());
        name.setTextIsSelectable(true);

        TextView address = (TextView) listItemView.findViewById(R.id.address_text_view);
        address.setText(currentPlace.getPlaceAddress());
        address.setTextIsSelectable(true);

        TextView openHours = (TextView) listItemView.findViewById(R.id.phone_text_view);
        openHours.setText(currentPlace.getPlaceOpenHours());
        openHours.setTextIsSelectable(true);

        ImageView mapImage = (ImageView) listItemView.findViewById(R.id.map_image_view);
        mapImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://google.com/maps?q=" + postCode));
                getContext().startActivity(myIntent);
            }
        });

        ImageView image = (ImageView) listItemView.findViewById(R.id.picture_image_view);
        image.setImageResource(currentPlace.getPlaceImage());

        return listItemView;
    }
}