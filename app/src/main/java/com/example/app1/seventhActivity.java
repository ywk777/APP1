package com.example.app1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class seventhActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button_next7;

//    public seventhActivity(Button button_next7) {
//        this.button_next7 = button_next7;
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);

        button_next7 = findViewById(R.id.button_next7);
        button_next7.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == button_next7){
            Intent intent = new Intent(this,EighthActivity.class);
            startActivity(intent);
        }
    }
}
