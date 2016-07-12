package com.duxnort.baseballscorebook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RecordGameSetupActivity extends AppCompatActivity {

    private Button btnBack, btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record_game_setup);
        initializeButtons();
    }

    private void initializeButtons(){
        btnNext = (Button) this.findViewById(R.id.btnNext);
        btnBack = (Button) this.findViewById((R.id.btnBack));

        btnNext.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        btnNextClicked(v);
                    }
                }
        );

        btnBack.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        btnBackClicked(v);
                    }
                }
        );
    }

    private void btnNextClicked(View v){
        // These lines allow for the button to start a new activity
        Intent intent = new Intent(this, LineupSetupActivity.class);
        startActivity(intent);
    }

    private void btnBackClicked(View v){
        // These lines allow for the button to start a new activity
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
