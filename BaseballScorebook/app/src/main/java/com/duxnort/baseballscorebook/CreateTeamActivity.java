package com.duxnort.baseballscorebook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CreateTeamActivity extends AppCompatActivity implements AddPlayerFragment.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_team);
    }
}
