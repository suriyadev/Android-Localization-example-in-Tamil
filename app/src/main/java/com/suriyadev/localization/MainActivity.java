package com.suriyadev.localization;

import android.content.res.Configuration;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((ListView)findViewById(R.id.list)).setAdapter(new ArrayAdapter<String>(getApplicationContext(),
                R.layout.kural_list,
                Arrays.asList(getResources().getStringArray(R.array.kural_list))));



    }


}






