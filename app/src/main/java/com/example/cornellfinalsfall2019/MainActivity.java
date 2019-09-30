package com.example.cornellfinalsfall2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button_press (View view)
    {
        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i);
        //Fade animation
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
    }
}
