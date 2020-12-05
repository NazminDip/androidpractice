package com.exaple.androidthird2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    int count=0;
 private Button loginbutton,logoutbutton, loginbutton3;
 private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginbutton=(Button)findViewById(R.id.loginbuttonid);
        loginbutton3=(Button)findViewById(R.id.loginbuttonid3);
        textView=(TextView) findViewById(R.id.textViewid);
        logoutbutton=(Button) findViewById(R.id.logoutbuttonid);

        Handler handler=new Handler();
        loginbutton.setOnClickListener(handler);
        logoutbutton.setOnClickListener(handler);


//      logoutbutton.setOnClickListener(this);
//      loginbutton.setOnClickListener(this);

    }
    class Handler implements View.OnClickListener {
        //one listener so many button then neen handler class
        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.loginbuttonid) {
                textView.setText("Login is sucess");


            } else if (v.getId() == R.id.logoutbuttonid) {
                textView.setText("Logout is sucess");

            }
        }

        }

        public  void show(View vv){

        if(vv.getId()==R.id.logoutbuttonid){
            textView.setText("Login is sucess");


        }else if (vv.getId()==R.id.loginbuttonid3){
            textView.setText("Welcome");

        }
        }


//
//    @Override
//    public void onClick(View v) {
//        if(v.getId()==R.id.loginbuttonid) {
//            textView.setText("Login is clicked");
//        }
//        if(v.getId()==R.id.logoutbuttonid) {
//            textView.setText("Logout is clicked");
//        }


    }




