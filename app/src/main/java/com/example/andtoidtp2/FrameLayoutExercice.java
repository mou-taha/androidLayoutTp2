package com.example.andtoidtp2;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FrameLayoutExercice extends AppCompatActivity {

    private int currenttextView = 0;
    private TextView[] textViews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout);

        FrameLayout frameLayout = findViewById(R.id.frameLayout);
        textViews = new TextView[]{
                findViewById(R.id.textView1),
                findViewById(R.id.textView2),
                findViewById(R.id.textView3)
        };

        Button buttonNext = findViewById(R.id.btnNext);

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //hide current
                textViews[currenttextView].setVisibility(View.INVISIBLE);
                // current
                currenttextView = (currenttextView + 1) % textViews.length;
                // show
                textViews[currenttextView].setVisibility(View.VISIBLE);
            }
        });
    }
}