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
        organisations.add(new Organisation("SOUTH", "London", "111111"));
        organisations.add(new Organisation("Olia", "Essen", "00000"));
        organisations.add(new Organisation("Tania", "London", "111111"));
        organisations.add(new Organisation("Olia", "Essen", "00000"));
        organisations.add(new Organisation("Tania", "London", "111111"));
        organisations.add(new Organisation("Olia", "Essen", "00000"));

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        OrganisationListAdapter listAdapter = new OrganisationListAdapter(getActivity(), organisations);
        listView.setAdapter(listAdapter);

        return rootView;

    }

}
