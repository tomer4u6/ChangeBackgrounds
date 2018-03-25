package com.example.tomer.changebackgrounds;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    LinearLayout mainL;
    RadioButton rb1,rb2,rb3;
    RadioGroup rg;
    Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainL = (LinearLayout)findViewById(R.id.mainL);
        rb1 = (RadioButton)findViewById(R.id.rb1);
        rb2 = (RadioButton)findViewById(R.id.rb2);
        rb3 = (RadioButton)findViewById(R.id.rb3);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        rg = (RadioGroup)findViewById(R.id.rg);
    }

    public void cng_clr(View view) {
        if(rb1.isChecked())
            mainL.setBackgroundColor(Color.RED);
        else if(rb2.isChecked())
            mainL.setBackgroundColor(Color.GREEN);
        else if(rb3.isChecked())
            mainL.setBackgroundColor(Color.BLUE);
        else
            Toast.makeText(this, "Please select a color", Toast.LENGTH_SHORT).show();
    }

    public void rst_bckg(View view) {
        mainL.setBackgroundColor(Color.WHITE);
        rg.clearCheck();

    }
}
