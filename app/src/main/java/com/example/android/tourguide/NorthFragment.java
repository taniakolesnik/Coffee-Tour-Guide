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
public class NorthFragment extends Fragment {

    public NorthFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_view, container, false);


        ArrayList<Organisation> organisations = new ArrayList<Organisation>();
        organisations.add(new Organisation("52A Coffee House", "52A Southgate Rd, London N1 3JF",
                "Mon - Sun 8am–6:30pm",R.drawable.if_wine));
        organisations.add(new Organisation("Costa Coffee", "117-119 Essex Rd, London N1 2SN",
                "Mon - Sun 8am–6:30pm",R.drawable.if_synthesizer));
        organisations.add(new Organisation("Caffè Nero", "75 Upper St, London N1 0NU",
                "Mon - Sun 8am–6:30pm",R.drawable.if_workplace));
        organisations.add(new Organisation("The Workers' Cafe", "404 Kingsland Rd, London E8 4AA",
                "Mon - Sun 8am–6:30pm",R.drawable.if_almaz));
        organisations.add(new Organisation("Subtitles Cafe", "42 Balls Pond Rd, Dalston, London N1 4AP",
                "Mon - Sun 8am–6:30pm",R.drawable.if_helmet));
        organisations.add(new Organisation("HER Coffee", "13 Downham Rd, London N1 5AA",
                "Mon - Sun 8am–6:30pm",R.drawable.if_paper_plane));

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        OrganisationListAdapter listAdapter = new OrganisationListAdapter(getActivity(), organisations);
        listView.setAdapter(listAdapter);

        return rootView;

    }

}
