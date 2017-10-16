package com.example.liuhb.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by liu.hb on 2017/9/14.
 */

public class Aty1 extends Activity {
    private Button btnClose;
    private TextView tvOut;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty1);
        btnClose= (Button) findViewById(R.id.btnClose);
        btnClose.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i=new Intent();
                i.putExtra("result","HELLO MainActivity");
                setResult(0,i);
                finish();
            }
        });
        tvOut= (TextView) findViewById(R.id.tvOut);
        /*tvOut.setText(getIntent().getStringExtra("text"));*/
        Bundle b=getIntent().getExtras();
        String text=b.getString("text");
        tvOut.setText(text);

    }
}
