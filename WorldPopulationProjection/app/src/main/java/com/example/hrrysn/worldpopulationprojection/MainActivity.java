package com.example.hrrysn.worldpopulationprojection;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText in1, in2;

    private TextView output;


    int result;
    Button add;
    TextView display;
    String num1, num2;
    int test=0;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        add = (Button) findViewById(R.id.buttonAdd);

        in1 = (EditText) findViewById(R.id.buttonInput1);
        in2 = (EditText) findViewById(R.id.buttonInput2);
        display = (TextView) findViewById(R.id.tvDisplay);


        num1 = in1.getText().toString();
        num2 = in2.getText().toString();




        add.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String num1 = in1.getText().toString();
                String num2 = in2.getText().toString();

                result = Integer.parseInt(num1) + Integer.parseInt(num2);

                for (int i = 0; i < 3; i++) {

                    display.setText("Your Result is" + result);
                    result++;
                }


            }});









        /*
        in1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {


                display.setText("Enter your first number");


                in2.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {

                        display.setText("Enter your second number");

                    }


                });


                add.setOnClickListener(new View.OnClickListener() {

                    //Do calculations when button is clicked and displays result
                    public void onClick(View v) {


                        String num1 = in1.getText().toString();
                        String num2 = in2.getText().toString();

                        result = Integer.parseInt(num1) + Integer.parseInt(num2);

                       for(int i=0;i<3;i++) {

                           display.append("Your Result is" + result );
                           result++;
                       }
                    }

                });



            }


        });
        */


    }



}

