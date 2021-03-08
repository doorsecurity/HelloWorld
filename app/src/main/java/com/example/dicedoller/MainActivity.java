package com.example.dicedoller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button mRoll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRoll =findViewById(R.id.roll_button);

        mRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                roll();
            }
        });
    }
    private  void roll(){
        int rollNumber =(int)(Math.random() * 6+1);
        TextView mResultText=findViewById(R.id.result_text);
        ImageView diceImage =findViewById(R.id.dice_image);

        switch(rollNumber){
            case 1:
                mResultText.setText("One");
                Toast.makeText(this,"One",Toast.LENGTH_SHORT).show();
                diceImage.setImageResource(R.drawable.dice1);
                break;
            case 2:
                mResultText.setText("Two");
                Toast.makeText(this,"Two",Toast.LENGTH_SHORT).show();
                diceImage.setImageResource(R.drawable.dice2);
                break;
            case 3:
                mResultText.setText("Three");
                Toast.makeText(this,"Three",Toast.LENGTH_SHORT).show();
                diceImage.setImageResource(R.drawable.dice3);
                break;
            case 4:
                mResultText.setText("Four");
                Toast.makeText(this,"Four",Toast.LENGTH_SHORT).show();
                diceImage.setImageResource(R.drawable.dice4);
                break;
            case 5:
                mResultText.setText("Five");
                Toast.makeText(this,"Five",Toast.LENGTH_SHORT).show();
                diceImage.setImageResource(R.drawable.dice5);
                break;
            case 6:
                mResultText.setText("Six");
                Toast.makeText(this,"Six",Toast.LENGTH_SHORT).show();
                diceImage.setImageResource(R.drawable.dice6);
                break;
                default:
                mResultText.setText("Empty Dice");
                Toast.makeText(this,"EmptyDice",Toast.LENGTH_SHORT).show();
        }
    }
}