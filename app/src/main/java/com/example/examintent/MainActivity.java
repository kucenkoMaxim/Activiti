package com.example.examintent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {



    private EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.name);

    }

public void goNewView(View v){
    if (v.getId() == R.id.button) {
        Intent intent = new Intent(this, LastActivity.class);
        intent.putExtra(LastActivity.EXTRA_NAME, name.getText().toString());
        startActivity(intent);
    }
}

    }










