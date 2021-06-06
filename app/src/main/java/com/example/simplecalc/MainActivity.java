package com.example.simplecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private EditText editTextFirst;
    private EditText editTextSecond;
    private TextView textViewResult;
    private RadioButton radioButtonAdd;
    private RadioButton radioButtonMinus;
    private RadioButton radioButtonMulti;
    private RadioButton radioButtonDive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextFirst = findViewById(R.id.editTextFirst);
        editTextSecond = findViewById(R.id.editTextSecond);
        textViewResult = findViewById(R.id.textViewResult);
        radioButtonAdd = findViewById(R.id.radioButtonAdd);
        radioButtonMinus = findViewById(R.id.radioButtonMinus);
        radioButtonMulti = findViewById(R.id.radioButtonMulti);
        radioButtonDive = findViewById(R.id.radioButtonDive);
    }

    public void addNumbers(View view) {
        double num01 = Double.parseDouble(editTextFirst.getText().toString());
        double num02 = Double.parseDouble(editTextSecond.getText().toString());

        if(num01 == 0 || num02 == 0){
            Toast.makeText(this, "Please select a number", Toast.LENGTH_SHORT).show();
            return;
        }

        if (radioButtonAdd.isChecked()) {
            textViewResult.setText(String.valueOf(num01 + num02));
            return;
        }
        if (radioButtonMinus.isChecked()) {
            textViewResult.setText(String.valueOf(num01 - num02));
            return;
        }
        if (radioButtonDive.isChecked()) {
            textViewResult.setText(String.valueOf(num01 / num02));
            return;
        }

        if (radioButtonMulti.isChecked()) {
            textViewResult.setText(String.valueOf(num01 * num02));
        }

    }


}