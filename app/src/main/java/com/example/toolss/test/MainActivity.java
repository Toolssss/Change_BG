package com.example.toolss.test;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    View layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button red = (Button)findViewById(R.id.Button2);
        Button blue = (Button)findViewById(R.id.Button1);
        Button yellow = (Button)findViewById(R.id.Button3);
        Button black = (Button)findViewById(R.id.Button4);
        layout = findViewById(R.id.layout1);
        RedListener r = new RedListener();
        BlueListener b = new BlueListener();
        YellowListener y = new YellowListener();
        BlackListener bl = new BlackListener();
        red.setOnClickListener(r);
        blue.setOnClickListener(b);
        yellow.setOnClickListener(y);
        black.setOnClickListener(bl);

    }

    class RedListener implements View.OnClickListener{
        @Override
        public void onClick(View view){
            layout.setBackgroundColor(Color.RED);
        }
    }

    class BlueListener implements View.OnClickListener{
        @Override
        public void onClick(View view){
            layout.setBackgroundColor(Color.BLUE);
        }
    }

    class YellowListener implements View.OnClickListener{
        @Override
        public void onClick(View view){
            layout.setBackgroundColor(Color.YELLOW);
        }

    }

    class BlackListener implements View.OnClickListener{
        @Override
        public void onClick(View view){
            layout.setBackgroundColor(Color.BLACK);
        }
    }
}