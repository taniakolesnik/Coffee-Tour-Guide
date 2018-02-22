package com.example.android.tourguide;

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
public class EastFragment extends Fragment {

    public EastFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_layout, container, false);

        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.east_coffeeShopOne_name),
                getString(R.string.east_coffeeShopOne_address),
                getString(R.string.east_coffeeShopOne_openHours), R.drawable.if_wine));
        places.add(new Place(getString(R.string.east_coffeeShopTwo_name),
                getString(R.string.east_coffeeShopTwo_address),
                getString(R.string.east_coffeeShopTwo_openHours), R.drawable.if_synthesizer));
        places.add(new Place(getString(R.string.east_coffeeShopThree_name),
                getString(R.string.east_coffeeShopThree_address),
                getString(R.string.east_coffeeShopThree_openHours), R.drawable.if_workplace));
        places.add(new Place(getString(R.string.east_coffeeShopFour_name),
                getString(R.string.east_coffeeShopFour_address),
                getString(R.string.east_coffeeShopFour_openHours), R.drawable.if_helmet));
        places.add(new Place(getString(R.string.east_coffeeShopFive_name),
                getString(R.string.east_coffeeShopFive_address),
                getString(R.string.east_coffeeShopFive_openHours), R.drawable.if_almaz));
        places.add(new Place(getString(R.string.east_coffeeShopSix_name),
                getString(R.string.east_coffeeShopSix_address),
                getString(R.string.east_coffeeShopSix_openHours), R.drawable.if_paper_plane));

        ListView listView = (ListView) rootView.findViewById(R.id.list_view);
        PlaceListAdapter listAdapter = new PlaceListAdapter(getActivity(), places);
        listView.setAdapter(listAdapter);

        return rootView;
    }
}