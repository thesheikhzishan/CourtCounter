package com.example.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int score_team_A = 0;
    int score_team_B = 0;

    public void pointer3A(View view) {
        score_team_A = score_team_A + 3;
        display_team_A(score_team_A);
    }

    public void pointer2A(View view) {
        score_team_A = score_team_A + 2;
        display_team_A(score_team_A);
    }

    public void freeThrowA(View view) {
        score_team_A = score_team_A + 1;
        display_team_A(score_team_A);
    }
    public void pointer3B(View view) {
        score_team_B = score_team_B + 3;
        display_team_B(score_team_B);
    }

    public void pointer2B(View view) {
        score_team_B = score_team_B + 2;
        display_team_B(score_team_B);
    }

    public void freeThrowB(View view) {
        score_team_B = score_team_B + 1;
        display_team_B(score_team_B);
    }
    public void reset_score(View view){
        score_team_A = 0;
        score_team_B = 0;
        display_team_A(0);
        display_team_B(0);
    }
    private void display_team_A(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    private void display_team_B(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
