package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    boolean isNewop = true;
    String old_number="";
    String new_number = "";
    String op = "%";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText2);

    }
    public void numberEvent(View view){
        if(isNewop){
            editText.setText("");
        }
        isNewop = false;
        String number = editText.getText().toString();
        switch (view.getId())
        {
            case R.id.num7:
                number += "7";
                break;
            case R.id.num8:
                number += "8";
                break;
            case R.id.num9:
                number += "9";
                break;
            case R.id.num4:
                number += "4";
                break;
            case R.id.num5:
                number += "5";
                break;
            case R.id.num6:
                number += "6";
                break;
            case R.id.num1:
                number += "1";
                break;
            case R.id.num2:
                number += "2";
                break;
            case R.id.num3:
                number += "3";
                break;
            case R.id.num0:
                number += "0";
                break;
            case R.id.budot:
                number += ".";
                break;
        }
        editText.setText(number);
    }
    public void numberOperator(View view){
        isNewop = true;
        old_number = editText.getText().toString();
        switch(view.getId()){
            case R.id.buadd:
                op = "+";
                break;
            case R.id.buminus:
                op = "-";
                break;
            case R.id.budivide:
                op = "/";
                break;
            case R.id.bumultiply:
                op = "X";
                break;
        }
    }
    public void equalEvent(View view){
        new_number = editText.getText().toString();
        double result = 0.0;
        switch (op){
            case "+":
                result = Double.parseDouble(old_number) + Double.parseDouble(new_number);
                break;
            case "-":
                result = Double.parseDouble(old_number) - Double.parseDouble(new_number);
                break;
            case "/":
                result = Double.parseDouble(old_number) / Double.parseDouble(new_number);
                break;
            case "X":
                result = Double.parseDouble(old_number) * Double.parseDouble(new_number);
                break;
            case "%":
                result = Double.parseDouble(old_number) % Double.parseDouble(new_number);
                break;

        }
        editText.setText(result + "");
    }
    public void acEvent(View view){
        editText.setText("0");
        isNewop = true;
    }
}