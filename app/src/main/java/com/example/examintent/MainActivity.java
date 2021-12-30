package com.example.examintent;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends Activity {
    private Button forward;
    private EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        forward = (Button) findViewById(R.id.button);
        name = (EditText) findViewById(R.id.name);


        }

public void goNewView(View v){
    switch (v.getId()){
        case R.id.button:
            Intent intent=new Intent(this,lastActivity.class);
            intent.putExtra("name",name.getText().toString());
            startActivity(intent);
            break;
        default:
            break;

    }
}

    }










