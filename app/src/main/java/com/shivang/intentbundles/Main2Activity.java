package com.shivang.intentbundles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView=(TextView)findViewById(R.id.textView2);

        textView.setText(getIntent().getExtras().getString("a"));
    }

    public void onclick(View view)
    {

      //  Intent intent=new Intent(this,MainActivity.class);
       // startActivity(intent);



        finish();


    }
}
