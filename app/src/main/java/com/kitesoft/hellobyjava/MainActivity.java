package com.kitesoft.hellobyjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;// TextView참조변수

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main); //화면에 보여줄 View를 설정하는 메소드 -주석처리

        //Java언어만으로 화면 꾸미기

        //액티비티에 놓여질 수 있는 것은 View클래스를 상속받은 클래스들만 가능함.

        //글씨를 보여주는 TextView 객체 생성 및 설정[ 참조변수 tv는 저 위에 MainActivity클래스의 멤버변수로 만들기 ]
        tv = new TextView(this);
        tv.setText("Hello world!!!!!");

        //버튼역할을 수행하는 객체 생성 및 설정
        Button btn = new Button(this);
        btn.setText("버튼");

        //액티비티는 한번에 하나의 View만 보여줄 수 있기에 View를 여러개 가질 수 있는 ViewGroup객체 생성
        LinearLayout layout = new LinearLayout(this);

        //위에서 만들었던 TextView와 Button을 ViewGroup에 추가
        layout.addView(tv);
        layout.addView(btn);

        //ViewGroup 1개를 추가하지만 그 안에 TextView와 Button이 배치되어 있어서 결국 2개의 뷰를 보여줄 수 있게됨.
        setContentView(layout);

        //버튼 클릭에 반응하는 리스너 객체 설정
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //버튼이 클릭되었을 때(on Click) 텍스트뷰의 글씨를 변경
                tv.setText("Nice to meet you.");
            }
        });

    }//onCreate method...

}//MainActivity class...
