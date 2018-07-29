package com.example.deepak.vegasdice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollDice = (Button) findViewById(R.id.button);

        final ImageView leftDice = (ImageView) findViewById(R.id.dice_left);
        final ImageView rightDice = (ImageView) findViewById(R.id.dice_right);

        final int[] diceArray = new int[]{
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};

        rollDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("VegasDice", "Button Pressed");
                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(6);
                Log.d("VegasDice", "The number generated is: " + number);

                leftDice.setImageResource(diceArray[number]);

                number = randomNumberGenerator.nextInt(6);
                Log.d("VegasDice", "The number generated is: " + number);

                rightDice.setImageResource(diceArray[number]);

            }
        });

    }
}
