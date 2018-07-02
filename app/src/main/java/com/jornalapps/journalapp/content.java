package com.jornalapps.journalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class content extends AppCompatActivity {
    // Declare Variables
    String post_id;
    String p_title;
    String p_content;
    String position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        Intent i = getIntent();

        post_id = i.getStringExtra("cat_id");

        p_title = i.getStringExtra("p_title");

        p_content = i.getStringExtra("p_content");



        // Locate the TextViews in contentactivty.xml
        TextView IdTextView = (TextView) findViewById(R.id.post_id);
        TextView TitleTextView = (TextView) findViewById(R.id.title);


        // Locate the ImageView in contentactivity.xml
        TextView contentTextView = (TextView) findViewById(R.id.post_id);

        // Set results to the TextViews
        IdTextView.setText(post_id);
        TitleTextView.setText(p_title);
        contentTextView.setText(p_content);
    }
}
