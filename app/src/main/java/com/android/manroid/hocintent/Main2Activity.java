package com.android.manroid.hocintent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    EditText edtAcc,edtPass;
    Button btnLogin;
    TextView txtShow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtShow = (TextView) findViewById(R.id.txt_show);
        edtPass = (EditText) findViewById(R.id.edt_matkhau);
        edtAcc = (EditText) findViewById(R.id.edt_taikhoan);
        btnLogin = (Button) findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        String name = edtAcc.getText().toString();
        String pass = edtPass.getText().toString();

        if (name.equals("pham van doan") && pass.equals("123456")){
            Intent intent = new Intent();
            setResult(Activity.RESULT_OK,intent);
            finish();
        }else{
            Intent intent = new Intent();
            setResult(Activity.RESULT_CANCELED,intent);
            finish();
        }
    }
}
