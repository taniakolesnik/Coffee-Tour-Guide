package com.example.android.tourguide;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        ArrayList<Organisation> organisations = new ArrayList<Organisation>();
        organisations.add(new Organisation("Tania", "London", "111111"));
        organisations.add(new Organisation("Olia", "Essen", "00000"));

        ListView listView = (ListView) findViewById(R.id.list);
        OrganisationListAdapter listAdapter = new OrganisationListAdapter(this, organisations);
        listView.setAdapter(listAdapter);

    }

}


