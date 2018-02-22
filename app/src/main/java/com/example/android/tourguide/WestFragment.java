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
public class WestFragment extends Fragment {

    public WestFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_layout, container, false);

        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.west_coffeeShopOne_name),
                getString(R.string.west_coffeeShopOne_address),
                getString(R.string.west_coffeeShopOne_openHours), R.drawable.if_almaz));
        places.add(new Place(getString(R.string.west_coffeeShopTwo_name),
                getString(R.string.west_coffeeShopTwo_address),
                getString(R.string.west_coffeeShopTwo_openHours), R.drawable.if_helmet));
        places.add(new Place(getString(R.string.west_coffeeShopThree_name),
                getString(R.string.west_coffeeShopThree_address),
                getString(R.string.west_coffeeShopThree_openHours), R.drawable.if_paper_plane));
        places.add(new Place(getString(R.string.west_coffeeShopFour_name),
                getString(R.string.west_coffeeShopFour_address),
                getString(R.string.west_coffeeShopFour_openHours), R.drawable.if_synthesizer));
        places.add(new Place(getString(R.string.west_coffeeShopFive_name),
                getString(R.string.west_coffeeShopFive_address),
                getString(R.string.west_coffeeShopFive_openHours), R.drawable.if_wine));
        places.add(new Place(getString(R.string.west_coffeeShopSix_name),
                getString(R.string.west_coffeeShopSix_address),
                getString(R.string.west_coffeeShopSix_openHours), R.drawable.if_workplace));

        ListView listView = (ListView) rootView.findViewById(R.id.list_view);
        PlaceListAdapter listAdapter = new PlaceListAdapter(getActivity(), places);
        listView.setAdapter(listAdapter);

        return rootView;
    }
}
