package com.example.sampleconstraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Deklarasi Variabel untuk button
    Button btnLogin;

    //Deklarasi variable untuk EditText
    EditText edemail, edpassword;

    //Deklarasi variable untuk menyimpan email dan password
    String nama, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Menghubungkan variable btnLogin dengan component button pada layout
        btnLogin=findViewById(R.id.btSignIn);

        //Menghubungkan variable edemail dengan component edittext email pada layout
        edemail=findViewById(R.id.edEmail);

        //Menghubungkan variable edpassword dengan component edittext password pada layout
        edpassword=findViewById(R.id.edPassword);

        //membuat fungsi onclick pada button btnLogin
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                //Menyimpan imput user di edittext email kedalam variable nama
                nama = edemail.getText().toString();

                //Menyimpan input user di edittext password kedalam variable password
                password = edpassword.getText().toString();

//                //Membuat variable toast dan membuat toast dengan menambahkan variable nama dan password
//                Toast t = Toast.makeText(getApplicationContext(),
//                        "email anda: "+nama+" dan Password anda: "+password+"", Toast.LENGTH_LONG);
//
//                //menampilkan toast
//                t.show();
                if(nama.equals("admin@mail.com") && password.equals("123")){
                    Toast.makeText(getApplicationContext(), "Login berhasil!!", Toast.LENGTH_LONG).show();
                }else if(nama.equals("admin@mail.com") && !password.matches("123")){
                    Toast.makeText(getApplicationContext(), "Password Salah", Toast.LENGTH_LONG).show();
                }else if(!nama.matches("admin@mail.com") && password.equals("123")) {
                    Toast.makeText(getApplicationContext(), "Email Salah", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(), "Email dan Password salah", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}