package com.badge.skyler.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class  MainActivity extends AppCompatActivity {

    Button bc;
    Button br;

    TextView tc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bc = (Button)findViewById(R.id.button);
        br = (Button)findViewById(R.id.button2);

        tc=(TextView)findViewById(R.id.textcount);

        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ival= Integer.parseInt(tc.getText().toString());
                ival=ival+1;
                tc.setText(String.valueOf(ival));
            }
        });
        br.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tc.setText(String.valueOf(0));
            }
        });
    }
}
