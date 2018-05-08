package com.example.yatri.shriompowderproducts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivitySecond extends AppCompatActivity {

    public Button b3;
    public Button b4;

    public void init()
    {
        b3 = (Button) findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pet_jar = new Intent(ActivitySecond.this,Activity_Fourth.class);
                startActivity(pet_jar);
            }
        });

        b4 = (Button) findViewById(R.id.b4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pet_bottle = new Intent(ActivitySecond.this,Activity_fifth.class);
                startActivity(pet_bottle);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        init();
    }
}
