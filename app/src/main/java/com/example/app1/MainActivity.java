package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickbtnChange(View view){
        TextView txt_hello = findViewById(R.id.txt_hello);
        txt_hello.setText("Work Hard in Silence, Let your Success be your Noise!!!");
    }
}