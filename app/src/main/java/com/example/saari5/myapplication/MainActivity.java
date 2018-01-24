package com.example.saari5.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void OnClickSummaa(View view){
        EditText editText=(EditText)findViewById(R.id.editText);



        TextView textView3= (TextView)findViewById(R.id.textView3);


    }
}
