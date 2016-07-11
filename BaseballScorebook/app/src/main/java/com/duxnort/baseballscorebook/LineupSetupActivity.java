package com.duxnort.baseballscorebook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class LineupSetupActivity extends AppCompatActivity implements LineupFragment.OnFragmentInteractionListener{

    private TabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lineup_setup);

        tabHost = (TabHost) this.findViewById(R.id.tabHostLineupSetup); // Get the TabHost

        tabHost.setup();

        TabHost.TabSpec tabSpec = tabHost.newTabSpec("Home");
        tabSpec.setContent(R.id.homeLineup);
        tabSpec.setIndicator("Home Lineup");
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("Away");
        tabSpec.setContent(R.id.homeLineup);
        tabSpec.setIndicator("Away Lineup");
        tabHost.addTab(tabSpec);
    }
}
