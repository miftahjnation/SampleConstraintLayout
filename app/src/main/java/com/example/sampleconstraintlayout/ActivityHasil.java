package com.example.sampleconstraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityHasil extends AppCompatActivity {

    TextView Email,Password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        Email = findViewById(R.id.tf_nama);
        Password = findViewById(R.id.tf_password);

        Bundle bundle = getIntent().getExtras();

        String email = bundle.getString("a");
        String password = bundle.getString("b");

        Email.setText(email);
        Password.setText(password);
    }
}