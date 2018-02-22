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
public class SouthFragment extends Fragment {

    public SouthFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_layout, container, false);

        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.south_coffeeShopOne_name),
                getString(R.string.south_coffeeShopOne_address),
                getString(R.string.south_coffeeShopOne_openHours)));
        places.add(new Place(getString(R.string.south_coffeeShopTwo_name),
                getString(R.string.south_coffeeShopTwo_address),
                getString(R.string.south_coffeeShopTwo_openHours)));
        places.add(new Place(getString(R.string.south_coffeeShopThree_name),
                getString(R.string.south_coffeeShopThree_address),
                getString(R.string.south_coffeeShopThree_openHours)));
        places.add(new Place(getString(R.string.south_coffeeShopFour_name),
                getString(R.string.south_coffeeShopFour_address),
                getString(R.string.south_coffeeShopFour_openHours)));
        places.add(new Place(getString(R.string.south_coffeeShopFive_name),
                getString(R.string.south_coffeeShopFive_address),
                getString(R.string.south_coffeeShopFive_openHours)));
        places.add(new Place(getString(R.string.south_coffeeShopSix_name),
                getString(R.string.south_coffeeShopSix_address),
                getString(R.string.south_coffeeShopSix_openHours)));

        ListView listView = (ListView) rootView.findViewById(R.id.list_view);
        PlaceListAdapter listAdapter = new PlaceListAdapter(getActivity(), places);
        listView.setAdapter(listAdapter);

        return rootView;
    }
}
