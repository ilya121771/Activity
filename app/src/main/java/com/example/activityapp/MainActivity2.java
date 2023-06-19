package com.example.activityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle args =  getIntent().getExtras();
        String qText = args.get("q").toString();
        TextView qTextView = (TextView) findViewById(R.id.qTextView);
        qTextView.setText(qText);
    }

    public void AnswerButton_Click(View view) {
        EditText aEditText = (EditText) findViewById(R.id.aEditText);
        String aText = aEditText.getText().toString();
        Intent intent = new Intent();
        intent.putExtra("a", aText);
        setResult(Activity.RESULT_OK, intent);
        finish();
    }
}