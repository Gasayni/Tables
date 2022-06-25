package com.gas.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSetting = (Button) findViewById(R.id.btnSetting);
        btnSetting.setOnClickListener(this);

        Button btnEnter = (Button) findViewById(R.id.btnEnter);
        btnEnter.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
//        Intent intent;
        switch (view.getId()) {
            case R.id.btnSetting: {
                Intent intent = new Intent("settingActivity");
                startActivity(intent);
                break;
            }
            case R.id.btnEnter: {
                Intent intent = new Intent("commonActivity");
                startActivity(intent);
                break;
            }
        }
    }
}