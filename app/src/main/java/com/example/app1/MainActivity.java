package com.example.app1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private RadioButton radioButton2;
    private RadioButton radioButton3;
    private RadioButton radioButton4;
    private RadioButton radioButton5;
    private Button btn_main_start1;
    private RadioGroup radioGroup1;
    private RadioGroup radioGroup2;
    private TextView textView6;
    private TextView textView7;
    private EditText editText_mi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化视图对象；
        btn_main_start1 =  findViewById(R.id.btn_main_start1);
        radioButton2 =findViewById(R.id.radioButton2);
        radioButton3 =findViewById(R.id.radioButton3);
        radioButton4 =findViewById(R.id.radioButton4);
        radioButton5 =findViewById(R.id.radioButton5);

        radioGroup1 = findViewById(R.id.radioGroup1);
        radioGroup2 = findViewById(R.id.radioGroup2);
        textView6 = findViewById(R.id.textView6);
        textView7 = findViewById(R.id.textView7);
        editText_mi = findViewById(R.id.editText_mi);
        //设置点击监听--radiogroup

//        radioButton2.setOnClickListener(this);
//        radioButton3.setOnClickListener(this);
//        radioButton4.setOnClickListener(this);
//       radioButton5.setOnClickListener(this);
        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
               if((RadioButton) findViewById(checkedId) == radioButton3){
                   Toast.makeText(MainActivity.this,"不能选，哈哈",Toast.LENGTH_SHORT).show();
               }
            }
        });
        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(findViewById(checkedId) == radioButton5){
                    Toast.makeText(MainActivity.this,"就知道你要选这个~",Toast.LENGTH_SHORT).show();
                }
            }
        });

        //
        btn_main_start1.setOnClickListener(this);
        textView6.setOnClickListener(this);
       textView7.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {
        //System.out.println("ok?");
     /*   if (v == btn_main_start1) {
            // Toast.makeText(this,"一般启动",0).show();
            //1.创建intent对象（显示）
            Intent intent = new Intent(this, SecondActivity.class);
//            //2.通过intent携带额外数据
//            String str = editText.getText().toString();
//            intent.putExtra("message",str);
            //3.启动activity
            startActivity(intent);
        }*/
     if(v == textView6){
         Toast.makeText(this,"忘就忘了吧",Toast.LENGTH_SHORT).show();
     }
     if(v == textView7){
         Toast.makeText(this,"恕无能无力",Toast.LENGTH_SHORT).show();
     }
        String str = editText_mi.getText().toString();
     if(radioButton2.isChecked()&&radioButton4.isChecked()&& v == btn_main_start1&&str.equals("282X")){

         Intent intent = new Intent(this,SecondActivity.class);
         startActivity(intent);


     }

    }
}