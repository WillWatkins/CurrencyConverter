package com.williamwatkins.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void currencyConverter(View view){

        EditText amount = findViewById(R.id.moneyValue);

        Double convertedAmount = Double.parseDouble(amount.getText().toString()) * 1.37;

        Toast.makeText(MainActivity.this, String.format("$%.2f", convertedAmount), Toast.LENGTH_SHORT).show();


    }
}