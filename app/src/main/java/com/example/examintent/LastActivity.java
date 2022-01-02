package com.example.examintent;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class LastActivity extends Activity {

    public static final String EXTRA_NAME = "EXTRA_NAMEgit";

    private TextView txtLastName;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.last_layout);


        txtLastName =(TextView) findViewById(R.id.txtLastName);

        String txtName=getIntent().getStringExtra(EXTRA_NAME);

        txtLastName.setText((txtLastName.getText().toString()+""+txtName));


            }
            public void back(View v){
                if ((v.getId()) == R.id.back_button) {
                    Intent intent = new Intent(this, MainActivity.class);
                    startActivity(intent);
                }
            }


        }




