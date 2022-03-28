package com.example.sampleconstraintlayout;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityLihatData extends AppCompatActivity {
    //Deklarasi variable dengan jenis data TextView
    TextView tvnama, tvnomer;



    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);

        tvnama = findViewById(R.id.tvNamaKontak);
        tvnomer = findViewById(R.id.tvNomerTelepon);

        //Membuat variable dengan jenis data bundle dan assign value dari variable tersebut dengan getIntent().getExtras()
        Bundle bundle = getIntent().getExtras();

        //Membuat variable nama dan assign value dari pesan
        //yang dikirimkan dari activity sebelumnya
        String nama =bundle.getString("a");


        //Membuat fungsi untuk mengatur textView nama dan nomer telepon
        //berdasarkan pesan yang dikirimkan dari activity sebelumnya
        switch(nama)
        {
            case "Miftah":
                tvnama.setText("Miftah J Nasution");
                tvnomer.setText("081336688785");
                break;
            case "Mizan":
                tvnama.setText("M Mizan Nasution");
                tvnomer.setText("0813366688785");
                break;
            case "Maulana":
                tvnama.setText("Maulana M Nasution");
                tvnomer.setText("086216548792");
            case "Zahra":
                tvnama.setText("Zahra A Nasution");
                tvnomer.setText("081337788785");
                break;

        }

    }
}
