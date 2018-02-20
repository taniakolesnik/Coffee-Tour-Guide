package com.example.android.tourguide;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class EastFragment extends Fragment {


    public EastFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_view, container, false);


        ArrayList<Organisation> organisations = new ArrayList<Organisation>();
        organisations.add(new Organisation("Curious Yellow Kafe", "77 Pitfield St, London N1 6BT",
                "Mon - Sun 8am–6:30pm", R.drawable.if_paper_plane));
        organisations.add(new Organisation("Friends of Ours", " 61 Pitfield St, London N1 6BU",
                "Mon - Sun 8am–6:30pm", R.drawable.if_workplace));
        organisations.add(new Organisation("The Bach Hoxton", "98 Hoxton St, London N1 6SG",
                "Mon - Sun 8am–6:30pm", R.drawable.if_helmet));
        organisations.add(new Organisation("Hoxton Cabin", "132 Kingsland Rd, London E2 8DY",
                "Mon - Sun 8am–6:30pm", R.drawable.if_synthesizer));
        organisations.add(new Organisation("Fabrique Bakery", " Arch 385, Geffrye St, London E2 8HZ",
                "Mon - Sun 8am–6:30pm", R.drawable.if_almaz));
        organisations.add(new Organisation("Auguste Handmade", "187 Hoxton St, London N1 6RA",
                "Mon - Sun 8am–6:30pm", R.drawable.if_wine));

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        OrganisationListAdapter listAdapter = new OrganisationListAdapter(getActivity(), organisations);
        listView.setAdapter(listAdapter);


        return rootView;

    }

}