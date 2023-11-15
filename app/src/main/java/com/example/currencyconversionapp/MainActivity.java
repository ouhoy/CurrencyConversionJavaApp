package com.example.currencyconversionapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText editTextEuro;
    private TextView textViewResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextEuro = findViewById(R.id.editTextEuro);
        textViewResult = findViewById(R.id.textViewResult);
    }

    public void convertCurrency(View view) {
        // Get the EURO amount from the EditText
        String euroString = editTextEuro.getText().toString();

        if (!euroString.isEmpty()) {
            // Convert the EURO amount to MAD
            double euroAmount = Double.parseDouble(euroString);
            double madAmount = euroAmount * 11.1; // Replace 11.1 with the current conversion rate

            // Display the result in the TextView
            DecimalFormat df = new DecimalFormat("#.##");
            textViewResult.setText("Converted: " + df.format(madAmount) + " MAD");
        } else {
            textViewResult.setText("Please enter a EURO amount.");
        }
    }
}