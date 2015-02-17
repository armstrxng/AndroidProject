package com.example.br161.feb16example;


import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {

    TextView tvResponse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvResponse = (TextView) findViewById(R.id.tv_result);
        tvResponse.setText(getIntent().getStringExtra("key"));
    }
}
