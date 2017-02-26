package com.android.manroid.hocintent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final int REQUEST_CODE = 1;
    Button btnActivity;
    TextView txtSuccesfull;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnActivity = (Button) findViewById(R.id.btn_jump);
        txtSuccesfull = (TextView) findViewById(R.id.textView);
        btnActivity.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this,Main2Activity.class);
        startActivityForResult(intent,REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_CODE &&resultCode == Activity.RESULT_OK){
                btnActivity.setVisibility(View.INVISIBLE);
                txtSuccesfull.setText("OK");
            }else {
                txtSuccesfull.setText("Fail");

            }

        }
    }

