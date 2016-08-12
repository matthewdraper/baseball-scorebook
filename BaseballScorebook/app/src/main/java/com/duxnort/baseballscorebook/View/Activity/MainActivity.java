/*
 * Copyright (c) 2016. This file and any source code contained in this project are soley owned by Matthew R. Draper and may not be used or copied by anyone else.
 *
 */

package com.duxnort.baseballscorebook.View.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.duxnort.baseballscorebook.R;
import com.duxnort.baseballscorebook.View.Fragment.MainMenuFragment;

public class MainActivity extends AppCompatActivity implements MainMenuFragment.OnFragmentInteractionListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}
