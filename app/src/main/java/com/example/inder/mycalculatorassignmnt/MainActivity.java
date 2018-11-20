package com.example.inder.mycalculatorassignmnt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

    public class MainActivity extends AppCompatActivity {

    public double addition(double i, double j){
        return (i+j);
    }
    public double subtraction(double i, double j){
        return (i-j);
    }
    public double multiplication(double i, double j){
        return (i*j);
    }
    public double division(double i, double j){
        return (i*j);
    }




    TextView Result;
    EditText number1, number2;
    Button division, subtraction,addition,multiplication;

    float result_num;
    int num1, num2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Result = (TextView) findViewById(R.id.Result);


        number1 = (EditText)findViewById(R.id.number1);
        number2 = (EditText)findViewById(R.id.number2);


        division = (Button) findViewById(R.id.division);
        subtraction = (Button)findViewById(R.id.substraction);
        addition = (Button)findViewById(R.id.addition);
        multiplication = (Button) findViewById(R.id.multiplication);

        addition.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                num1 = Integer.parseInt(number1.getText().toString());
                num2 = Integer.parseInt(number2.getText().toString());
                result_num = num1 + num2;
                Result.setText(String.valueOf(result_num));

            }

        });
        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                num1 = Integer.parseInt(number1.getText().toString());
                num2 = Integer.parseInt(number2.getText().toString());
                result_num = num1 - num2;
                Result.setText(String.valueOf(result_num));

            }

        });
        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                num1 = Integer.parseInt(number1.getText().toString());
                num2 = Integer.parseInt(number2.getText().toString());
                result_num = num1 * num2;
                Result.setText(String.valueOf(result_num));

            }

        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1 = Integer.parseInt(number1.getText().toString());
                num2 = Integer.parseInt(number2.getText().toString());
                result_num = num1 / num2;
                Result.setText(String.valueOf(result_num));

            }

        });

    }

}