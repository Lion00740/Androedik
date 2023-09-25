package com.example.androedik;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

import java.util.Random;

public class HelloActivity extends Activity
{
    int left = 0;
    int right = 0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helloact);

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);

        Button mem1 = findViewById(R.id.mem1);
        Button mem2 = findViewById(R.id.mem2);
        Button mem3 = findViewById(R.id.mem3);

        mem1.setVisibility(View.INVISIBLE);
        mem2.setVisibility(View.INVISIBLE);
        mem3.setVisibility(View.INVISIBLE);

        TextView text1 = findViewById(R.id.text1);
        TextView text2 = findViewById(R.id.text2);

        Random random = new Random();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mem1.setVisibility(View.INVISIBLE);
                mem2.setVisibility(View.INVISIBLE);
                mem3.setVisibility(View.INVISIBLE);
                mem1.setBackgroundColor(Color.LTGRAY);
                mem2.setBackgroundColor(Color.LTGRAY);
                mem3.setBackgroundColor(Color.LTGRAY);
                right += 1;
                if (right % 10 == 0)
                {
                    mem1.setVisibility(View.VISIBLE);
                    mem2.setVisibility(View.VISIBLE);
                    mem3.setVisibility(View.VISIBLE);
                    button1.setVisibility(View.INVISIBLE);
                    button2.setVisibility(View.INVISIBLE);
                }
                String s = "Button1 " + right;
                text1.setText(s);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mem1.setVisibility(View.INVISIBLE);
                mem2.setVisibility(View.INVISIBLE);
                mem3.setVisibility(View.INVISIBLE);

                mem1.setBackgroundColor(Color.LTGRAY);
                mem2.setBackgroundColor(Color.LTGRAY);
                mem3.setBackgroundColor(Color.LTGRAY);
                left += 1;
                if (left % 10 == 0)
                {
                    mem1.setVisibility(View.VISIBLE);
                    mem2.setVisibility(View.VISIBLE);
                    mem3.setVisibility(View.VISIBLE);
                    button1.setVisibility(View.INVISIBLE);
                    button2.setVisibility(View.INVISIBLE);
                }
                String s = "Button2 " + left;
                text2.setText(s);
            }
        });
        mem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (random.nextInt(2) == 0) {
                    mem1.setBackgroundColor(Color.GREEN);
                }
                else {
                    mem1.setBackgroundColor(Color.RED);
                    right = 0;
                    left = 0;
                    text1.setText("Button1 " + right);
                    text2.setText("Button2 " + left);
                }

                button1.setVisibility(View.VISIBLE);
                button2.setVisibility(View.VISIBLE);
            }
        });
        mem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (random.nextInt(2) == 0) {
                    mem2.setBackgroundColor(Color.GREEN);
                }
                else {
                    mem2.setBackgroundColor(Color.RED);
                    right = 0;
                    left = 0;
                    text1.setText("Button1 " + right);
                    text2.setText("Button2 " + left);
                }

                button1.setVisibility(View.VISIBLE);
                button2.setVisibility(View.VISIBLE);
            }
        });
        mem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (random.nextInt(2) == 0) {
                    mem3.setBackgroundColor(Color.GREEN);
                }
                else {
                    mem3.setBackgroundColor(Color.RED);
                    right = 0;
                    left = 0;
                    text1.setText("Button1 " + right);
                    text2.setText("Button2 " + left);
                }

                button1.setVisibility(View.VISIBLE);
                button2.setVisibility(View.VISIBLE);
            }
        });
    }
}
