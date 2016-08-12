/*
 * Copyright (c) 2016. This file and any source code contained in this project are soley owned by Matthew R. Draper and may not be used or copied by anyone else.
 *
 */

package com.duxnort.baseballscorebook.View.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import com.duxnort.baseballscorebook.R;

public class RecordGameSetupActivity extends AppCompatActivity {

    private Button btnBack, btnNext, btnUmpireAdd, btnAddTeamHome, btnAddTeamAway;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record_game_setup);
        initializeButtons();
    }

    private void initializeButtons() {
        btnNext = (Button) this.findViewById(R.id.btnNextPlayer);
        btnBack = (Button) this.findViewById((R.id.btnBack));
        btnAddTeamAway = (Button) this.findViewById((R.id.btnAddTeamAway));
        btnAddTeamHome = (Button) this.findViewById((R.id.btnAddTeamHome));
        btnUmpireAdd = (Button) this.findViewById((R.id.btnAddUmpire));

        btnNext.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        btnNextClicked();
                    }
                }
        );

        btnNext.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnNextOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnNext.setBackground(ContextCompat.getDrawable(v.getContext(), R.drawable.green_rounded));
                return false;
            }
        });

        btnBack.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        btnBackClicked();
                    }
                }
        );

        btnBack.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnBackOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnBack.setBackground(ContextCompat.getDrawable(v.getContext(), R.drawable.red_rounded));
                return false;
            }
        });

        btnAddTeamAway.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        btnAddTeamAwayClicked();
                    }
                }
        );

        btnAddTeamAway.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnAddTeamAwayOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnAddTeamAway.setBackground(ContextCompat.getDrawable(v.getContext(), R.drawable.green_rounded));
                return false;
            }
        });


        btnAddTeamHome.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        btnAddTeamHomeClicked();
                    }
                }
        );

        btnAddTeamHome.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnAddTeamHomeOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnAddTeamHome.setBackground(ContextCompat.getDrawable(v.getContext(), R.drawable.green_rounded));
                return false;
            }
        });

        btnUmpireAdd.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        btnUmpireAddClicked();
                    }
                }
        );

        btnUmpireAdd.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    btnUmpireAddOnTouch();
                else if (event.getAction() == MotionEvent.ACTION_UP)
                    btnUmpireAdd.setBackground(ContextCompat.getDrawable(v.getContext(), R.drawable.green_rounded));
                return false;
            }
        });
    }

    private void btnNextClicked() {
        // These lines allow for the button to start a new activity
        Intent intent = new Intent(this, LineupSetupActivity.class);
        startActivity(intent);
    }

    private void btnNextOnTouch() {
        btnNext.setBackground(ContextCompat.getDrawable(this, R.drawable.green_rounded_pressed));
    }

    private void btnBackClicked() {
        // These lines allow for the button to start a new activity
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void btnBackOnTouch() {
        btnBack.setBackground(ContextCompat.getDrawable(this, R.drawable.red_rounded_pressed));
    }

    private void btnUmpireAddClicked() {

    }

    private void btnUmpireAddOnTouch() {
        btnUmpireAdd.setBackground(ContextCompat.getDrawable(this, R.drawable.green_rounded_pressed));
    }

    private void btnAddTeamHomeClicked() {

    }

    private void btnAddTeamHomeOnTouch() {
        btnAddTeamHome.setBackground(ContextCompat.getDrawable(this, R.drawable.green_rounded_pressed));
    }

    private void btnAddTeamAwayClicked() {

    }

    private void btnAddTeamAwayOnTouch() {
        btnAddTeamAway.setBackground(ContextCompat.getDrawable(this, R.drawable.green_rounded_pressed));
    }
}
