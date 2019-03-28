package com.example.app1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EighthActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button_next8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eighth);

        button_next8 = findViewById(R.id.button_next8);
        button_next8.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == button_next8){


        Intent intent = new Intent(this,NinethActivity.class);
        startActivity(intent);
    }
    }
}

