/*
 * Copyright (c) 2016. This file and any source code contained in this project are soley owned by Matthew R. Draper and may not be used or copied by anyone else.
 *
 */

package com.duxnort.baseballscorebook.View.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.duxnort.baseballscorebook.R;
import com.duxnort.baseballscorebook.View.Fragment.AddPlayerFragment;

import java.util.ArrayList;

public class CreateTeamActivity extends AppCompatActivity implements AddPlayerFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_team);
        populateListView();
    }

    private void populateListView() {
        // Create fake data to be displayed.
        ArrayList<String> fakeData = new ArrayList<>();
        fakeData.add("Jim Thompson - #21");
        fakeData.add("Charles McGee - #17");
        fakeData.add("Matt Rogers - #45");
        fakeData.add("Reggie Hayward - #77");
        fakeData.add("Garrett Smith - #1");
        fakeData.add("Kyle Wilson - #9");
        fakeData.add("Bobby Archer - #22");
        fakeData.add("Niles Jackson - #11");
        // Create adapter for the list view
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, // The activity
                R.layout.roster_item, // ID of the layout for the list items to be displayed
                fakeData); // The data
        // The list view to be populated
        ListView list = (ListView) this.findViewById(R.id.listViewRoster);
        assert list != null;
        list.setAdapter(adapter);
    }
}
