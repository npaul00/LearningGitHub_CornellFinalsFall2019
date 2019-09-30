package com.example.cornellfinalsfall2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void newView (View view)
    {
        TextView text = (TextView) findViewById(R.id.textView2);
        text.setVisibility(View.VISIBLE);
        text.setText("You're awesome!");
    }
}
