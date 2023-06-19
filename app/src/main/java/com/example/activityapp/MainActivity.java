package com.example.activityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final int SECOND_ACTIVITY_REQUEST_CODE = 12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void QuestionButton_Click(View view) {
        EditText textFil = (EditText)findViewById(R.id.qEditText);
        String text = new String();
        text = textFil.getText().toString();
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("q", text);
        startActivityForResult(intent, SECOND_ACTIVITY_REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == SECOND_ACTIVITY_REQUEST_CODE)
        {
            if (resultCode == RESULT_OK)
            {
                Bundle args = data.getExtras();
                String aText = args.get("a").toString();
                TextView aTextView = (TextView) findViewById(R.id.aTextView);
                aTextView.setText(aText);
            }
        }
    }
}