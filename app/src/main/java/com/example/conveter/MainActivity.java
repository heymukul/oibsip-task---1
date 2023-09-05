package com.example.conveter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
Spinner spFrom,spTo;
EditText txt_number;
Button convert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spFrom = findViewById(R.id.spFrom);
        spTo = findViewById(R.id.spTo);
        txt_number = findViewById(R.id.txt_number);
        convert =  findViewById(R.id.convert);

        String[] From = {"meter" , "kilometer","gram", "kilo-gram","mile-gram","mile-meter"};
        ArrayAdapter<String> ad = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,From);
        spFrom.setAdapter(ad);

        String[] To = {"meter" , "kilo-meter","gram", "kilo-gram","mile-gram","mile-meter"};
        ArrayAdapter<String> ad1 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,To);
        spTo.setAdapter(ad1);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double result;
                double num1 = Double.parseDouble(txt_number.getText().toString());

                if(spFrom.getSelectedItem().toString().equals("meter") && spTo.getSelectedItem().toString().equals("kilo-meter")) {
                    result = num1 * 1000.0;
                    Toast.makeText(getApplicationContext(), Double.toString(result), Toast.LENGTH_LONG).show();
                }
                else if(spFrom.getSelectedItem().toString().equals("gram") && spTo.getSelectedItem().toString().equals("kilo-gram")) {
                    result = num1 * 1000.0;
                    Toast.makeText(getApplicationContext(), Double.toString(result), Toast.LENGTH_LONG).show();
                }
               else if(spFrom.getSelectedItem().toString().equals("kilo-meter") && spTo.getSelectedItem().toString().equals("meter")) {
                    result = num1 / 1000.0;
                    Toast.makeText(getApplicationContext(), Double.toString(result), Toast.LENGTH_LONG).show();
                }
                else if(spFrom.getSelectedItem().toString().equals("kilo-gram") && spTo.getSelectedItem().toString().equals("gram")) {
                    result = num1 / 1000.0;
                    Toast.makeText(getApplicationContext(), Double.toString(result), Toast.LENGTH_LONG).show();
                }
                else if(spFrom.getSelectedItem().toString().equals("gram") && spTo.getSelectedItem().toString().equals("mile-gram")) {
                    result = num1 / 1000.0;
                    Toast.makeText(getApplicationContext(), Double.toString(result), Toast.LENGTH_LONG).show();
                }
                else if(spFrom.getSelectedItem().toString().equals("meter") && spTo.getSelectedItem().toString().equals("mile-meter")) {
                    result = num1 / 1000.0;
                    Toast.makeText(getApplicationContext(), Double.toString(result), Toast.LENGTH_LONG).show();
                }
                else if(spFrom.getSelectedItem().toString().equals("mile-gram") && spTo.getSelectedItem().toString().equals("gram")) {
                    result = num1 * 1000.0;
                    Toast.makeText(getApplicationContext(), Double.toString(result), Toast.LENGTH_LONG).show();
                }
                else if(spFrom.getSelectedItem().toString().equals("mile-meter") && spTo.getSelectedItem().toString().equals("meter")) {
                    result = num1 * 1000.0;
                    Toast.makeText(getApplicationContext(), Double.toString(result), Toast.LENGTH_LONG).show();
                }
                else if(spFrom.getSelectedItem().toString().equals("mile-gram") && spTo.getSelectedItem().toString().equals("kilo-gram")) {
                    result = num1 * 1000000.0;
                    Toast.makeText(getApplicationContext(), Double.toString(result), Toast.LENGTH_LONG).show();
                }
                else if(spFrom.getSelectedItem().toString().equals("mile-meter") && spTo.getSelectedItem().toString().equals("kilo-meter")) {
                    result = num1 * 1000000.0;
                    Toast.makeText(getApplicationContext(), Double.toString(result), Toast.LENGTH_LONG).show();
                }
                else {
                    String[] st;
                    st = new String[]{"wrong combination"};
                    Toast.makeText(getApplicationContext(), Arrays.toString(st),Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}