package com.example.android.tourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by tetianakolesnik on 11/01/2018.
 */


public class OrganisationListAdapter extends ArrayAdapter<Organisation> {

    public OrganisationListAdapter(Activity context, ArrayList<Organisation> organisations) {
        super(context, 0, organisations);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Organisation currentOrganisation = getItem(position);

        TextView name = (TextView) listItemView.findViewById(R.id.name_list_item);
        name.setText(currentOrganisation.getOrganisationName());

        TextView address = (TextView) listItemView.findViewById(R.id.address_list_item);
        address.setText(currentOrganisation.getOrganisationAddress());

        TextView phone = (TextView) listItemView.findViewById(R.id.phone_list_item);
        phone.setText(currentOrganisation.getOrganisationPhone());

        return listItemView;
    }
}