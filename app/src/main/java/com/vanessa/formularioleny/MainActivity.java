package com.vanessa.formularioleny;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    private TextView et1,et2,et3,et4,et5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (TextView) findViewById(R.id.tex1);
        et2 = (TextView) findViewById(R.id.text2);
        et3 = (TextView) findViewById(R.id.text3);
        et4 = (TextView) findViewById(R.id.text4);
        et5 = (TextView) findViewById(R.id.text5);

    }

    public void formu

}