package com.example.examintent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class lastActivity extends Activity {
    private Button back;
    private TextView nametxt1;
    private TextView lastname;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.last_layout);

        back=(Button) findViewById(R.id.back_button);
        nametxt1 =(TextView) findViewById(R.id.nametxt1);

        String txtName=getIntent().getStringExtra("name");

        nametxt1.setText((nametxt1.getText().toString()+""+txtName));


            }
            public void back(View v){
        switch ((v.getId())){
            case R.id.back_button:
                Intent intent=new Intent(this,MainActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
            }


        }




