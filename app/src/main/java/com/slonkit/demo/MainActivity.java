package com.slonkit.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.slonkit.mylibrary.ToastMessage;

public class MainActivity extends AppCompatActivity {

   private TextView textViewClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewClick = (TextView)findViewById(R.id.textViewClick);

        textViewClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ToastMessage.s(MainActivity.this,"This is my first Library");
            }
        });
    }
}
