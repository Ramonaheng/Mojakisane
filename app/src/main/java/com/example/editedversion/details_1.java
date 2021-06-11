package com.example.editedversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class details_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_1);

        TextView webView=findViewById(R.id.Title1);
        TextView  newsViews=findViewById(R.id.body1);

        String web= getIntent().getExtras().getString("Title1");
        String news= getIntent().getExtras().getString("body1");


        webView.setText(web);
        newsViews.setText(news);

    }
}