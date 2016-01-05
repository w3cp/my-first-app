package com.anwar.myfirstapp;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;
import android.widget.RelativeLayout;

public class DisplayMessageActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = new TextView(this);
        textView.setTextSize(30);
        textView.setText(message);
        RelativeLayout layout = ( RelativeLayout ) findViewById(R.id.content);
        layout.addView(textView);
    }
}
