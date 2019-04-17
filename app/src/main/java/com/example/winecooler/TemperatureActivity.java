package com.example.winecooler;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class TemperatureActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    Switch switch1;
    TextView tempTextView;
    int temp=13;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tempTextView =  findViewById(R.id.humTextView);
        tempTextView.setBackgroundColor(Color.rgb(224,224,224));
        tempTextView.setTextColor(Color.rgb(64,64,64));
        switch1 = findViewById(R.id.switch2);
        switch1.setOnCheckedChangeListener(this);
    }
    @Override
    public void onCheckedChanged(CompoundButton compoundButton , boolean b){

        if (switch1.isChecked()){

            tempTextView.setText(temp+" degree");
        }
        else {
            tempTextView.setText("");
        }

    }
}


