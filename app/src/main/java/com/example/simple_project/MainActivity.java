package com.example.simple_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText cdmail, cdpass;
    String semail, spassword, demail, dpasswords;
    Button btnsingin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        demail ="akun@mail.com";
        dpasswords = "1@3";

        cdmail=findViewById(R.id.editEmail);
        cdpass=findViewById(R.id.editEmail);
        btnsingin=findViewById(R.id.butsingin);

        btnsingin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                semail = cdmail.getText().toString();
                spassword = cdpass.getText().toString();

                if (semail.length()==0 || spassword.length()==0){
                    cdmail.setText(null);
                    cdpass.setText(null);
                    Toast.makeText(MainActivity.this, "Tolong isi terlebih dahulu dengan benar!",Toast.LENGTH_LONG).show();
                }else {
                    if (semail.equals(demail)){
                        if (spassword.equals(dpasswords)){
                            Toast.makeText(MainActivity.this, "Login berhasil!",Toast.LENGTH_LONG).show();
                        }else {
                            cdpass.setText(null);
                            Toast.makeText(MainActivity.this, "Passwords anda salah",Toast.LENGTH_LONG).show();
                        }
                    }else {
                        cdpass.setText(null);
                        cdmail.setText(null);

                        Toast.makeText(MainActivity.this, "e-mail anda salah!",Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}