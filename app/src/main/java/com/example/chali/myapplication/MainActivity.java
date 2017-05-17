package com.example.chali.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //this method handle the
    private void handleClick(){
        //display a toast message
       Toast.makeText(this, "you fucked off your first app", Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // leave the above method calls alone, they are needed by the framework!

        //in order to set behaviouir for a button in our UI:
        //step 1: get a reference to the BUtton

        Button myButton = (Button) findViewById(R.id.myButton);
        //step 2: define a click handling method for the button
        myButton.setOnClickListener(
                // create anonymous class and override its method
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        handleClick();

                    }
                }
        );

    }
}
