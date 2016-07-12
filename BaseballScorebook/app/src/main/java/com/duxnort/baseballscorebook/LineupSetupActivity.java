package com.duxnort.baseballscorebook;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TabHost;

import java.util.ArrayList;

public class LineupSetupActivity extends AppCompatActivity implements LineupFragment.OnFragmentInteractionListener{

    private TabHost tabHost;
    private Spinner name1, name2, name3, name4, name5, name6, name7, name8, name9, namePitcher;
    private Spinner pos1, pos2, pos3, pos4, pos5, pos6, pos7, pos8, pos9;
    private Button btnStartGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lineup_setup);
        initializeButtons();
        tabHost = (TabHost) this.findViewById(R.id.tabHostLineupSetup); // Get the TabHost

        tabHost.setup();

        TabHost.TabSpec tabSpec = tabHost.newTabSpec("Home");
        tabSpec.setContent(R.id.homeContainer);
        tabSpec.setIndicator("Home Lineup");
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("Away");
        tabSpec.setContent(R.id.awayContainer);
        tabSpec.setIndicator("Away Lineup");
        tabHost.addTab(tabSpec);

        initializeLineupSpinners();

        }

    private void initializeLineupSpinners(){
        ArrayList<String> fakeNameData = new ArrayList<>();
        fakeNameData.add("J. Thompson");
        fakeNameData.add("C. McGee");
        fakeNameData.add("M. Rogers");
        fakeNameData.add("R. Hayward");
        fakeNameData.add("G. Smith");
        fakeNameData.add("K. Wilson");
        fakeNameData.add("B. Archer");
        fakeNameData.add("N. Jackson");

        ArrayList<String> positions = new ArrayList<>();
        positions.add("P");
        positions.add("C");
        positions.add("1B");
        positions.add("2B");
        positions.add("3B");
        positions.add("SS");
        positions.add("LF");
        positions.add("CF");
        positions.add("RF");
        positions.add("DH");

        // Create adapter for the list view
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, // The activity
                R.layout.lineup_item, // ID of the layout for the list items to be displayed
                fakeNameData); // The data
        // The list view to be populated

        LinearLayout home = (LinearLayout)this.findViewById(R.id.homeContainer);
        LinearLayout away = (LinearLayout)this.findViewById(R.id.awayContainer);

        name1 = (Spinner) home.findViewById(R.id.name1);
        name1.setAdapter(adapter);
        name1 = (Spinner) away.findViewById(R.id.name1);
        name1.setAdapter(adapter);
        name2 = (Spinner) home.findViewById(R.id.name2);
        name2.setAdapter(adapter);
        name2 = (Spinner) away.findViewById(R.id.name2);
        name2.setAdapter(adapter);
        name3 = (Spinner) home.findViewById(R.id.name3);
        name3.setAdapter(adapter);
        name3 = (Spinner) away.findViewById(R.id.name3);
        name3.setAdapter(adapter);
        name4 = (Spinner) home.findViewById(R.id.name4);
        name4.setAdapter(adapter);
        name4 = (Spinner) away.findViewById(R.id.name4);
        name4.setAdapter(adapter);
        name5 = (Spinner) home.findViewById(R.id.name5);
        name5.setAdapter(adapter);
        name5 = (Spinner) away.findViewById(R.id.name5);
        name5.setAdapter(adapter);
        name6 = (Spinner) home.findViewById(R.id.name6);
        name6.setAdapter(adapter);
        name6 = (Spinner) away.findViewById(R.id.name6);
        name6.setAdapter(adapter);
        name7 = (Spinner) home.findViewById(R.id.name7);
        name7.setAdapter(adapter);
        name7 = (Spinner) away.findViewById(R.id.name7);
        name7.setAdapter(adapter);
        name8 = (Spinner) home.findViewById(R.id.name8);
        name8.setAdapter(adapter);
        name8 = (Spinner) away.findViewById(R.id.name8);
        name8.setAdapter(adapter);
        name9 = (Spinner) home.findViewById(R.id.name9);
        name9.setAdapter(adapter);
        name9 = (Spinner) away.findViewById(R.id.name9);
        name9.setAdapter(adapter);
        namePitcher = (Spinner) home.findViewById(R.id.pitcherName);
        namePitcher.setAdapter(adapter);
        namePitcher = (Spinner) away.findViewById(R.id.pitcherName);
        namePitcher.setAdapter(adapter);

        adapter = new ArrayAdapter<String>(
                this, // The activity
                R.layout.lineup_item, // ID of the layout for the list items to be displayed
                positions); // The data

        pos1 = (Spinner) home.findViewById(R.id.position1);
        pos1.setAdapter(adapter);
        pos1 = (Spinner) away.findViewById(R.id.position1);
        pos1.setAdapter(adapter);
        pos2 = (Spinner) home.findViewById(R.id.position2);
        pos2.setAdapter(adapter);
        pos2 = (Spinner) away.findViewById(R.id.position2);
        pos2.setAdapter(adapter);
        pos3 = (Spinner) home.findViewById(R.id.position3);
        pos3.setAdapter(adapter);
        pos3 = (Spinner) away.findViewById(R.id.position3);
        pos3.setAdapter(adapter);
        pos4 = (Spinner) home.findViewById(R.id.position4);
        pos4.setAdapter(adapter);
        pos4 = (Spinner) away.findViewById(R.id.position4);
        pos4.setAdapter(adapter);
        pos5 = (Spinner) home.findViewById(R.id.position5);
        pos5.setAdapter(adapter);
        pos5 = (Spinner) away.findViewById(R.id.position5);
        pos5.setAdapter(adapter);
        pos6 = (Spinner) home.findViewById(R.id.position6);
        pos6.setAdapter(adapter);
        pos6 = (Spinner) away.findViewById(R.id.position6);
        pos6.setAdapter(adapter);
        pos7 = (Spinner) home.findViewById(R.id.position7);
        pos7.setAdapter(adapter);
        pos7 = (Spinner) away.findViewById(R.id.position7);
        pos7.setAdapter(adapter);
        pos8 = (Spinner) home.findViewById(R.id.position8);
        pos8.setAdapter(adapter);
        pos8 = (Spinner) away.findViewById(R.id.position8);
        pos8.setAdapter(adapter);
        pos9 = (Spinner) home.findViewById(R.id.position9);
        pos9.setAdapter(adapter);
        pos9 = (Spinner) away.findViewById(R.id.position9);
        pos9.setAdapter(adapter);

    }

    private void initializeButtons(){
        btnStartGame = (Button) this.findViewById(R.id.btnStartGame);

        btnStartGame.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        btnStartGame.setBackgroundColor(Color.BLACK);
                        btnStartGameClicked(v);
                    }
                }
        );
    }

    private void btnStartGameClicked(View v){
        Intent intent = new Intent(this, RecordGameActivity.class);
        startActivity(intent);
    }
}
