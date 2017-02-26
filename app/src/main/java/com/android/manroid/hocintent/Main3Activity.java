package com.android.manroid.hocintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener {

    private View btnSendData;
    private EditText edtName, edtEmail;
    public static final int REQUEST_CODE= 38;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btnSendData = findViewById(R.id.btnSendData);
        btnSendData.setOnClickListener(this);
        edtName = (EditText) findViewById(R.id.edtName);
        edtEmail = (EditText) findViewById(R.id.edtEmail);
        //R của ứng dung
        edtName.setTextColor(getResources().getColor(R.color.colorPrimary));

        //R của hệ thống
        edtEmail.setTextColor(getResources().getColor(android.R.color.holo_blue_light));


    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(), Main4Activity.class);
        intent.putExtra("email", edtEmail.getText().toString());
        intent.putExtra("ten", edtName.getText().toString());


        Student student = new Student("Nguyen Van B", "0901391203");
        intent.putExtra("student", student);
        //startActivity(intent);
        startActivityForResult(intent, REQUEST_CODE);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_CODE && resultCode == 50 ){
            String name = data.getStringExtra("name");
            String email = data.getStringExtra("email");
            edtName.setText(name);
            edtEmail.setText(email);

        }
    }
}
