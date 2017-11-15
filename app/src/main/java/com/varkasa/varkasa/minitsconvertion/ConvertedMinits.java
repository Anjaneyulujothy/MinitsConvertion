   package com.varkasa.varkasa.minitsconvertion;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

   public class ConvertedMinits extends AppCompatActivity {

    TextView T;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converted_minits);

        String min=getIntent().getStringExtra("re");


        T=(TextView)findViewById(R.id.text);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarc);

        toolbar.setTitleTextColor(0xFFFFFFFF);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.left);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("Min Converter");

        float a = Float.parseFloat(min);

       int  minutes=(int)a;



        int weeks = minutes / 10080;
        int aboveWeeks = minutes % 10080;
        int days = aboveWeeks / 1440;
        int aboveDays = aboveWeeks % 1440;
        int hours = aboveDays / 60;
        int aboveHours = aboveDays % 60;
        int minute = aboveHours / 60;

        if(weeks > 0 && days > 0) {
            if(weeks > 1 && days > 1){


                T.setText(weeks + " weeks " + days + " days ");


            } else {


                T.setText(weeks + " weeks " + days + " day ");
            }
        } else if (weeks > 0){
            if (weeks > 1){


                T.setText(weeks + " weeks ");
            } else {
                T.setText(weeks + " weeks ");            }
        } else if(days > 0 && hours > 0){
            if(days > 1 && hours > 1){
                ;

                T.setText( days + " days " + hours + " hours ");
            } else {
                T.setText( days + " days " + hours + " hours ");
            }
        } else if(days > 0){
            if (days > 1){


                T.setText( days + " days ");
            } else {
                T.setText( days + " days ");            }
        } else if(hours > 0 && minute > 0){
            if(hours > 1 && minute > 1){
                ;

                T.setText(   hours + " hours " + minute + " minutes ");
            } else {
                T.setText(   hours + " hours " + minute + " minutes ");
            }
        } else if(hours > 0){
            if (hours > 1){


                T.setText( hours + " hours");
            } else {
                T.setText( hours + " hours");
            }
        } else {
            if (minutes > 1){


                T.setText(minutes + " minutes ");
            } else {
                T.setText(minutes + " minutes ");
            }
        }



    }
}

