package com.example.parul.clickcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ClickCount extends AppCompatActivity {
       int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_count);
    }
    private void display(int number){
        TextView quaintityTextView = (TextView) findViewById(R.id.textView);
        quaintityTextView.setText(""+number);
    }
    public void submitCount(View view){
        count = count+1;
        display(count);
    }
}