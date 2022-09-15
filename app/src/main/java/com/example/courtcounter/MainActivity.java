package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreePointsForA(View view) {
        displayForTeamA(scoreTeamA+=3);
    }

    public void addTwoPointsForA(View view) {
        displayForTeamA(scoreTeamA+=2);
    }

    public void freeThrowForA(View view) {
        displayForTeamA(scoreTeamA+=1);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreePointsForB(View view) {
        displayForTeamB(scoreTeamB+=3);
    }

    public void addTwoPointsForB(View view) {
        displayForTeamB(scoreTeamB+=2);
    }

    public void freeThrowForB(View view) {
        displayForTeamB(scoreTeamB += 1);
    }

    public void reset(View view) {
        displayForTeamA(scoreTeamA=0);
        displayForTeamB(scoreTeamB=0);
    }
}