package com.gagan.secondassignmentrecyclerview.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.gagan.secondassignmentrecyclerview.R;

public class ClassDashboard extends AppCompatActivity implements View.OnClickListener {

     Button btn1, btn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        btn1=findViewById(R.id.button1);
        btn2=findViewById(R.id.button2);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.button1)
        {
            Intent intent= new Intent(this,MainActivity.class);
            startActivity(intent);
        }
        else
        {
            Intent intent= new Intent(this, ClassFormSpinner.class);
            startActivity(intent);
        }
    }
}

