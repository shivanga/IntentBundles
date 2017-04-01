package com.shivang.intentbundles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText)findViewById(R.id.editText);
    }

    public void onclick(View view)
    {

        Intent intent=new Intent(this,Main2Activity.class);
        intent.putExtra("a",editText.getText().toString());


        startActivity(intent);


    }
}
