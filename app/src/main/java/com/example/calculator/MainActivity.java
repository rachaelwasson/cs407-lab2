package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void add(View view) {
        EditText firstTextField = (EditText) findViewById(R.id.integer1);
        EditText secondTextField = (EditText) findViewById(R.id.integer2);

        Integer integer1 = Integer.parseInt(firstTextField.getText().toString());
        Integer integer2 = Integer.parseInt(secondTextField.getText().toString());

        String result = String.valueOf(integer1 + integer2);
        goToActivity2(result);

    }

    public void sub(View view) {
        EditText firstTextField = (EditText) findViewById(R.id.integer1);
        EditText secondTextField = (EditText) findViewById(R.id.integer2);

        Integer integer1 = Integer.parseInt(firstTextField.getText().toString());
        Integer integer2 = Integer.parseInt(secondTextField.getText().toString());

        String result = String.valueOf(integer1 - integer2);
        goToActivity2(result);
    }

    public void mult(View view) {
        EditText firstTextField = (EditText) findViewById(R.id.integer1);
        EditText secondTextField = (EditText) findViewById(R.id.integer2);

        Integer integer1 = Integer.parseInt(firstTextField.getText().toString());
        Integer integer2 = Integer.parseInt(secondTextField.getText().toString());

        String result = String.valueOf(integer1 * integer2);
        goToActivity2(result);
    }

    public void div(View view) {
        EditText firstTextField = (EditText) findViewById(R.id.integer1);
        EditText secondTextField = (EditText) findViewById(R.id.integer2);

        Integer integer1 = Integer.parseInt(firstTextField.getText().toString());
        Integer integer2 = Integer.parseInt(secondTextField.getText().toString());

        String result = String.valueOf(integer1 / integer2);
        goToActivity2(result);
    }

    public void goToActivity2(String s) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("result", s);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}