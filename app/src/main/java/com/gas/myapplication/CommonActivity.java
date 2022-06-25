package com.gas.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class CommonActivity extends AppCompatActivity implements View.OnClickListener{
    ArrayAdapter adapter;
    private static final String[] table_type = new String[] {"Русский", "Американский пул"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common);

        AutoCompleteTextView actvTable = (AutoCompleteTextView) findViewById(R.id.actvTable);
        adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                table_type);
        actvTable.setThreshold(1);
        actvTable.setAdapter(adapter);
    }

    @Override
    public void onClick(View view) {

    }
}