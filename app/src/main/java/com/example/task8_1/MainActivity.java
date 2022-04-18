package com.example.task8_1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity
{
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    Switch switchBack;
    ToggleButton buttonBack;
    Button click;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        switchBack = (Switch) findViewById(R.id.Switch);
        buttonBack = (ToggleButton) findViewById(R.id.ToggleView);
        click = (Button) findViewById(R.id.click);
    }

    public void CheckCondition(View view)
    {
        if(switchBack.isChecked())
        {
            switchBack.setBackgroundColor(Color.GREEN);
        }
        else
        {
            switchBack.setBackgroundColor(Color.BLUE);
        }
        if(buttonBack.isChecked())
        {
            buttonBack.setBackgroundColor(Color.RED);
        }
        else
            buttonBack.setBackgroundColor(Color.YELLOW);
        }
    }