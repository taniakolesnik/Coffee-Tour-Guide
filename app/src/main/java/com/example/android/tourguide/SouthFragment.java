package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SouthFragment extends Fragment {

    public SouthFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_view, container, false);

        ArrayList<Organisation> organisations = new ArrayList<Organisation>();
        organisations.add(new Organisation("Look mum no hands!", "49 Old St, London EC1V 9HX",
                "Mon - Sun 8am–6:30pm"));
        organisations.add(new Organisation("Ozone Coffee Roasters", "11 Leonard St, London EC2A 4AQ",
                "Mon - Sun 8am–6:30pm"));
        organisations.add(new Organisation("Starbucks Coffee", "74/78 Finsbury Pavement, London EC2A 1AT",
                "Mon - Sun 8am–6:30pm"));
        organisations.add(new Organisation("Wild & Wood Coffee", "47 London Wall, London EC2M 5TE",
                "Mon - Sun 8am–6:30pm"));
        organisations.add(new Organisation("Caffè Nero", "Unit 5, Moorgate Station, Moorgate, London EC2Y 9AG",
                "Mon - Sun 8am–6:30pm"));
        organisations.add(new Organisation("Fix Coffee", "161 Whitecross St, London EC1Y 8JL",
                "Mon - Sun 8am–6:30pm"));

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        OrganisationListAdapter listAdapter = new OrganisationListAdapter(getActivity(), organisations);
        listView.setAdapter(listAdapter);

        return rootView;

    }

}
