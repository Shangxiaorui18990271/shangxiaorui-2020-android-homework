package com.example.homework02;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.homework02.util.DateUtil;

public class bbs extends AppCompatActivity implements View.OnClickListener,View.OnLongClickListener {
    private TextView tv_bbs;
    private TextView tv_control;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bbs);

        tv_control = findViewById(R.id.tv_control);
        tv_control.setOnClickListener(this);
        tv_control.setOnLongClickListener(this);
        tv_bbs = findViewById(R.id.tv_bbs);
        tv_bbs.setOnClickListener(this);
        //设置tv_bbs内部文本的移动方式为滚动形式
        tv_bbs.setMovementMethod(new ScrollingMovementMethod());
    }
    private String [] mChatStr={"今天天气怎么样呢？","天气晴朗，温度28度",
            "今天适合穿什么呢","今天适合穿短袖","注意防晒哦"};
    @Override
    public void onClick (View v){
        if(v.getId()==R.id.tv_control||v.getId()==R.id.tv_bbs){
            //生成一个0—4之间的随机数
            int random =(int) (Math.random()*10)%5;
            //拼接聊天的文件内容
            String newStr=String.format("%s\n%s %s",tv_bbs.getText().toString(),
                    DateUtil.getNowDateTime(),mChatStr[random]);
            //设置文本视图tv_bbs的文本内容
            tv_bbs.setText(newStr);
        }
    }
    @Override
    public boolean onLongClick(View v){
        if(v.getId()==R.id.tv_control||v.getId()==R.id.tv_bbs){
            tv_bbs.setText("");
        }
        return true;
    }
}

