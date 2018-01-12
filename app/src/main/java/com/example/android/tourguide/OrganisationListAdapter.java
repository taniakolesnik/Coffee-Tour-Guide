package com.example.android.tourguide;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by tetianakolesnik on 11/01/2018.
 */


public class OrganisationListAdapter extends ArrayAdapter<Organisation> {

    public OrganisationListAdapter(Activity context, ArrayList<Organisation> organisations) {
        super(context, 0, organisations);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        Organisation currentOrganisation = getItem(position);
        final String postCode = currentOrganisation.getOrganisationAddress().replaceAll(" ", "+");

        TextView name = (TextView) listItemView.findViewById(R.id.name_list_item);
        name.setText(currentOrganisation.getOrganisationName());
        name.setTextIsSelectable(true);

        TextView address = (TextView) listItemView.findViewById(R.id.address_list_item);
        address.setText(currentOrganisation.getOrganisationAddress());
        address.setTextIsSelectable(true);

        TextView openHours = (TextView) listItemView.findViewById(R.id.phone_list_item);
        openHours.setText(currentOrganisation.getOrganisationOpenHours());
        openHours.setTextIsSelectable(true);

        // http://google.com/maps?q=SE1+1EB

        ImageView mapImage = (ImageView) listItemView.findViewById(R.id.map_list_item);
        mapImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Toast.makeText(getContext(), "ulr : " + postCode, Toast.LENGTH_LONG).show();
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://google.com/maps?q=" + postCode));
                getContext().startActivity(myIntent);
            }
        });

        return listItemView;
    }

}