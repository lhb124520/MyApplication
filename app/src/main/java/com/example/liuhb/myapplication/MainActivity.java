package com.example.liuhb.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnStartAty1;
    private  TextView tvOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*TextView tv=null;
        tv.setText("刘海波");*/
        tvOut= (TextView) findViewById(R.id.tvOut);
        btnStartAty1= (Button) findViewById(R.id.BtnStartAty1);
        btnStartAty1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent i=new Intent("Aty1");*/
                Intent i=new Intent(MainActivity.this,Aty1.class);
               /* i.putExtra("text","欢迎 Aty1");*/
               Bundle b=new Bundle();
                b.putString("text","你好！Aty1");
                i.putExtras(b);
                /*startActivity(i);*/

                startActivityForResult(i,0);
            }
        });
        System.out.print("你好-----------------------------onCreate------------------------------");

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        String result =data.getStringExtra("result");
        tvOut.setText(result);
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("onStart-----------------------------------------------");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("onPause");
    }



    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("onDestroy");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("onRestart");
    }
}
