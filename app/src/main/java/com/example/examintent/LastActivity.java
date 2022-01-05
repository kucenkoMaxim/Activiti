package com.example.examintent;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class LastActivity extends Activity {

    public static final String EXTRA_NAME = "EXTRA_NAME";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.last_layout);


        TextView txtLastName = findViewById(R.id.txt_Last_Name);

        String txtName=getIntent().getStringExtra(EXTRA_NAME);

        String endText=(txtLastName.getText().toString()+""+txtName);

        txtLastName.setText(endText);


    }
            public void back(View v){
                onBackPressed();

            }


}




