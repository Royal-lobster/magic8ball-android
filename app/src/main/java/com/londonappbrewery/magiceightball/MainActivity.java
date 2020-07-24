package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    //declaration
        Button askButton = (Button) findViewById(R.id.askButton);
        final ImageView ball = (ImageView) findViewById(R.id.ball);
    //init array
        final int[] ballArray = new int[]{
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,
        };
    //button click
    askButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //generate random number
            Random randomNumber = new Random();
            //stores random number to number
            int number = randomNumber.nextInt(5);
            //replaces the image of ball by ball img of generated number
            ball.setImageResource(ballArray[number]);

        }
    });
    }
}
