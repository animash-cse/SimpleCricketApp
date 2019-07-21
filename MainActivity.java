package com.example.animash.scorecount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int Score = 0;
    int TotalBall = 0;
    int SixBolls = 0;
    int FourBolls = 0;
    int Overs = 0;
    int BallsInOver = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayTeamAScore(0);
    }

    public void Six(View v) {
        Score = Score + 6;
        SixBolls = SixBolls + 1;
        displayTeamAScore(Score);
        DisplaySixBalls(SixBolls);
    }

    public void DisplaySixBalls(int Sixs){
        TextView Sixes = (TextView)findViewById(R.id.Sixes_counter);
        Sixes.setText(String.valueOf(Sixs));
    }

    public void Four(View v) {
        Score = Score + 4;
        displayTeamAScore(Score);
        FourBolls = FourBolls + 1;
        DisplayFourBalls(FourBolls);
    }

    public void DisplayFourBalls(int Four){
        TextView FourBalls = (TextView)findViewById(R.id.Fours_counter);
        FourBalls.setText(String.valueOf(Four));
    }

    public void One(View v) {
        Score = Score + 1;
        displayTeamAScore(Score);
    }

    public void decrease(View v) {
        Score = Score - 1;
        displayTeamAScore(Score);
    }

    public void increase(View v) {
        Score = Score + 1;
        displayTeamAScore(Score);
    }

    public void displayTeamAScore(int v) {
        TextView ScoreView = (TextView) findViewById(R.id.team_a_score);
        ScoreView.setText(String.valueOf(v));
    }

    public void decrease_ball(View v) {
        TotalBall = TotalBall - 1;
        TotalBalls(TotalBall);
    }

    public void increase_ball(View v) {
        TotalBall = TotalBall + 1;
        TotalBalls(TotalBall);
        BallsInOver = BallsInOver + 1;
        DisplayBallsInOver(BallsInOver);
    }

    public void DisplayBallsInOver(int ballsIn){
        TextView BallsInOv = (TextView)findViewById(R.id.Balls_counter_in_over);
        BallsInOv.setText(String.valueOf(ballsIn));
    }

    public void TotalBalls(int ball){
        TextView Balls = (TextView)findViewById(R.id.Total_Balls);
        Balls.setText(String.valueOf(ball));
    }

    public void Over(View over){
        Overs = Overs + 1;
        DisplayOvers(Overs);
        BallsInOver = 0;
        DisplayBallsInOver(BallsInOver);
    }

    public void DisplayOvers(int over){
        TextView overS = (TextView)findViewById(R.id.Over_counter);
        overS.setText(String.valueOf(over));
    }
}
