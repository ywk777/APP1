package com.example.app1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sixthActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button_next6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);
        button_next6 = findViewById(R.id.button_next6);
        button_next6.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if(v == button_next6){
        Intent intent = new Intent(this,seventhActivity.class);
        startActivity(intent);
    }
    }
}
