package com.example.speenercustomadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private String[] countryName;
    private String[] population;
    private int[] flgs={R.drawable.australia,R.drawable.bel,R.drawable.greece,R.drawable.ind,
            R.drawable.mayanmar, R.drawable.potugal,R.drawable.rose};
    private boolean isFirst=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countryName=getResources().getStringArray(R.array.country_name);
        population=getResources().getStringArray(R.array.population);
        spinner=findViewById(R.id.spinnerId);
        CustomAdapter customAdapter=new CustomAdapter(this,flgs,countryName,population);
        spinner.setAdapter(customAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (isFirst==true)
                {
                    isFirst=false;

                }


             else   {
                Toast.makeText(MainActivity.this,countryName[position], Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}