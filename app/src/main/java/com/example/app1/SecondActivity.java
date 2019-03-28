package com.example.app1;
/*

界面二
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;

public class SecondActivity extends AppCompatActivity{

    private ImageButton imageButton5;
    private ImageButton imageButton16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //imageButton5.setAlpha((float) 0.1);
        //editText2 = (EditText)findViewById(R.id.editText2);
        //4.得到intent
        //Intent intent = getIntent();
        //5.通过intent读取额外数据
        //String str = intent.getStringExtra("message");
        //6.显示到EditText
        //editText2.setText(str);


//        //初始化
//        imageButton5 = (ImageButton)findViewById(R.id.imageButton5);
//        //点击监听
//        imageButton5.setOnClickListener(this);
//    }

//    @Override
//    public void onClick(View v) {
//        Intent intent = new Intent(this, thirdActivity.class);
//        startActivity(intent);
//
//    }

//    public void back1(View v){
//        //关闭当前界面
//        finish();
   }
}
