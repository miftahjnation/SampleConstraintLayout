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
    }
}