package com.android.manroid.hocintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {
    private View btnSendData;
    private EditText edtName, edtEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        btnSendData = findViewById(R.id.btnSendData);
        btnSendData.setOnClickListener(onSendData);
        edtName = (EditText) findViewById(R.id.edtName);
        edtEmail = (EditText) findViewById(R.id.edtEmail);

        Bundle bundle = getIntent().getExtras();
        String email = bundle.getString("email","Manroid38@gmail.com");
        String name = bundle.getString("ten","Manroid38");

        Student st = (Student) bundle.getSerializable("student");

        Toast.makeText(this, st.getName() + "-" + st.getMobile(), Toast.LENGTH_SHORT).show();
        edtName.setText(name);
        edtEmail.setText(email);
    }

    private View.OnClickListener onSendData = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.putExtra("name",edtName.getText().toString());
            intent.putExtra("email",edtEmail.getText().toString());
            setResult(50,intent);
            finish();
        }
    };

}
