package com.example.yatri.shriompowderproducts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityFirst extends AppCompatActivity {

        public Button b1;
        public Button b2;

        public void init()
        {
        b1 = (Button) findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent product = new Intent(ActivityFirst.this,ActivitySecond.class);
                startActivity(product);

            }
        });

        b2 = (Button) findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contact = new Intent(ActivityFirst.this,ActivityThird.class);
                startActivity(contact);
            }
        });
        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        init();

    }
}
