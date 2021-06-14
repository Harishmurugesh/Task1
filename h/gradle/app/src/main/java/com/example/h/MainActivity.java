package com.example.h;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    public TextView day ;
    public TextView month;
    public TextView year;
    public TextView score;

    public Button b1;
    public Button b2;
    public Button b3;
    public Button b4;
    public int c = 0;
    randomize obj = new randomize();
    public View.OnClickListener clicklistener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String selectedans = ((Button) findViewById(v.getId())).getText().toString();
            if (selectedans.equals(obj.e))
            {  printQuestion();

               c++;}
            else {
                  score.setVisibility(View.VISIBLE);
                  b1.setVisibility(View.INVISIBLE);
                  b2.setVisibility(View.INVISIBLE);
                  b3.setVisibility(View.INVISIBLE);
                  b4.setVisibility(View.INVISIBLE);
                  score.setText("game ended. score : " +c);
            }
        }

    };


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            day = (TextView) findViewById(R.id.textView4);
            month = (TextView) findViewById(R.id.textView5);
            year = (TextView) findViewById(R.id.textView6);
            score = (TextView) findViewById(R.id.textView7);
            b1 = (Button) findViewById(R.id.button1);
            b2 = (Button) findViewById(R.id.button2);
            b3 = (Button) findViewById(R.id.button3);
            b4 = (Button) findViewById(R.id.button4);
            b1.setOnClickListener(clicklistener);
            b2.setOnClickListener(clicklistener);
            b3.setOnClickListener(clicklistener);
            b4.setOnClickListener(clicklistener);

             printQuestion();
            }

        public void printQuestion(){
            obj.randomm();
            day.setText(""+obj.r3);
            month.setText(""+obj.r2);
            year.setText(""+obj.r1);
            ArrayList<String> array = new ArrayList<String>();
            array.add(obj.e);
            array.add(obj.f);
            array.add(obj.g);
            array.add(obj.h);
            Collections.shuffle(array);
            b1.setText(array.get(0));
            b2.setText(array.get(1));
            b3.setText(array.get(2));
            b4.setText(array.get(3));
        }

    }