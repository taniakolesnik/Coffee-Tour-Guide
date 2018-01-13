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
public class WestFragment extends Fragment {


    public WestFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_view, container, false);


        ArrayList<Organisation> organisations = new ArrayList<Organisation>();
        organisations.add(new Organisation("The CoffeeWorks Project",
                "96-98 Islington High St, Islington, London N1 8EG", "020 7424 5020"));
        organisations.add(new Organisation("Coffee Junction", " 42 Provost St, London N1 7SU",
                "Mon - Sun 8am–6:30pm"));
        organisations.add(new Organisation("Westland Coffee & Wine", "1 Westland Pl, London N1 7LP",
                "Mon - Sun 8am–6:30pm"));
        organisations.add(new Organisation("Pret A Manger", "Eagle House, 161 City Rd, London EC1V 1NR",
                "Mon - Sun 8am–6:30pm"));
        organisations.add(new Organisation("Shepherdess Cafe", "221 City Rd, London EC1V 1JN",
                "Mon - Sun 8am–6:30pm"));
        organisations.add(new Organisation("Benugo", "8-9 Angel Gate, London EC1V 2PT",
                "Mon - Sun 8am–6:30pm"));

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        OrganisationListAdapter listAdapter = new OrganisationListAdapter(getActivity(), organisations);
        listView.setAdapter(listAdapter);

        return rootView;

    }

}
