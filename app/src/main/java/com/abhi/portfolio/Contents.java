package com.abhi.portfolio;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Contents extends AppCompatActivity implements View.OnClickListener {

    Button b1,b2,b3,b4,b5,b6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button)findViewById(R.id.movie_button);
        b2 = (Button)findViewById(R.id.stock_button);
        b3 = (Button)findViewById(R.id.build_button);
        b4 = (Button)findViewById(R.id.material_button);
        b5 = (Button)findViewById(R.id.ubi_button);
        b6 = (Button)findViewById(R.id.capstone_button);
       
       
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch(id)
        {
            case R.id.movie_button:
                Toast.makeText(Contents.this, "This Button will launch my Popular Movies app!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.stock_button:
                Toast.makeText(Contents.this, "This Button will launch my Stock Hawk app!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.build_button:
                Toast.makeText(Contents.this, "This Button will launch my Build it Bigger app!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.material_button:
                Toast.makeText(Contents.this, "This Button will launch my Make Your App Material app!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ubi_button:
                Toast.makeText(Contents.this, "This Button will launch my Go Ubiquitous app!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.capstone_button:
                Toast.makeText(Contents.this, "This Button will launch my Capstone app!", Toast.LENGTH_SHORT).show();
                break;
        }
        
    }
}
