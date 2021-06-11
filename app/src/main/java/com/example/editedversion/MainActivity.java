package com.example.editedversion;


import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bun = (Button) findViewById(R.id.button1);
        Button bun2 = (Button) findViewById(R.id.button2);
        Button bun3 = (Button) findViewById(R.id.button3);

        bun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, details_1.class);
                intent.putExtra("Title1", "FRONT-END WEB DEVELOPMENT\n\nHTML:\n\n This module is a Major module in FRONT_END WEB DEVELOPMENT for it prepares students to be enable to develop web pages\n\nCSS: \n\n This Module is  a major too in this course. The significance of having CSS is to enable Students to align their designs which where initially coded in HTML\n\nJavaScript: \n\n This Module is  a minor  in this course for it is an optional programming language. It's significance  is to enable students to build responsive websites.\n\n This module deals With The following:\n \n1.Responsive design\n2.Javascript Framework");
                intent.putExtra("body1", "3C grades including Maths for Honours Degree\n 2C grades Including Maths for Associate degree\n\nNUMBER OF STUDENTS ADMITTED\n30");
                startActivity(intent);
            }
        });
        bun2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, details_1.class);
                intent.putExtra("Title1", "MOBILE APP DEVELOPMENT\n\nFUNDAMENTALS OF ANDROID DEVELOPMENT:\n\n This module is a Major module in this course for it prepares students to develop mobile apps.It includes the use Of Android Studio which is one of the number one priorities in Mobile app development world. \nThis is a creative module which inlude\n\n Designing adaptive Application\n Cross Platform with Flutter.\n\n This course helps equip students with the following:\n1.Creative thinking\n2.Better app designs\n3.Development of responsive mobile applications");
                intent.putExtra("body1", "4C grades including Maths for Honours Degree\n 3C grades Including Maths for Associate degree\n\nNUMBER OF STUDENTS ADMITTED 20\n\nDuration 4 YEARS");
                startActivity(intent);

            }
        });
        bun3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, details_1.class);
                intent.putExtra("Title1", "DATA SCIENCE\n\nEXPLORATORY DATA ANALYSIS:\n This module is a Major module in Data Analysis for it prepares students to be able to analyse the data of a software.This course includes the following:\n\nProgramming Languages:\n This Module is  a major too in this course. The significance of having programming languages  is to enable enable students to e able to be familiar with most Programming Languages which are complimentary in this Course. These languages help  students to be able to produce high level  software. \n\nStatistics Interference: \n This Module is  a major module as well in this course for it helps students to be able to analyse statistical data with no problems.\n\nIntroduction to machine Learning:\n Machine Learning deals with the machine Architecture that is its build up. It prepares students to be able to view all machine components and know they significant functions.");
                intent.putExtra("body1", "5b grades including Maths for Honours Degree\n 3b grades Including Maths for Associate degree\n\nNUMBER OF STUDENTS ADMITTED\n30");

                startActivity(intent);

            }
        });

    }}
