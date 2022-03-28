package com.example.sampleconstraintlayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Home_Activity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    //Deklarasi variable dengan jenis data listview
    private ListView list;

    //Memanggil class ListViewAdapter dan inisiasi menjadi variable adapater
    private ListViewAdapter adapter;

    //Deklarasi array untuk menyimpan nama
    String[] listNama;

    //Memanggil class ClassNama
    public static ArrayList<ClassNama> classNamaArrayList = new ArrayList<ClassNama>();

    //Membuat objek Bundle
    Bundle bundle = new Bundle();

    //Membuat objek intent
    Intent intent;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //Menyimpan nama didalam array ListNama
        listNama = new String[]{"Miftah","Zahra","Mizan","Maulana"};

        list = findViewById(R.id.listKontak);

        //membuat objek dari class ClassNama menjadi array list
        classNamaArrayList = new ArrayList<>();

        //Membaca seluruh data pada array ListNama
        for(int i = 0; i<listNama.length; i++)
        {
            //Membuat objek class nama
            ClassNama classNama = new ClassNama(listNama[i]);
            //Binds strings ke array
            classNamaArrayList.add(classNama);
        }

        // Membuat objek dari ListViewAdapter
        adapter = new ListViewAdapter(this);

        //Binds Adapter ke ListView
        list.setAdapter(adapter);

        //Membuat event dari list onClick
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //Deklarasi variable nama yang berisi item yang diklik
                String nama = classNamaArrayList.get(position).getName();

                //memasukkan value dari variable nama dengan kunci "a"
                //dan dimasukkan ke dalam bundle
                bundle.putString("a", nama.trim());

                //Membuat objek popup menu
                PopupMenu pm = new PopupMenu(getApplicationContext(),view);

                //Membuat event untuk popup menu ketika dipilih
                pm.setOnMenuItemClickListener(Home_Activity.this);

                //Menampilkan popup menu dari layout menu
                pm.inflate(R.menu.popup_menu);

                //menampilkan popup menu
                pm.show();

            }
        });
    }

    //event yang terjadi ketika menu dipilih
    @Override
    public boolean onMenuItemClick(MenuItem menuItem)
    {
        switch (menuItem.getItemId())
        {
            case R.id.mnview:
                intent = new Intent(getApplicationContext(), ActivityLihatData.class);
                intent.putExtras(bundle);
                startActivity(intent);
                break;
            case R.id.mnedit:
                Toast.makeText(getApplicationContext(), "Ini untuk edit kontak", Toast.LENGTH_LONG).show();
                break;
        }
        return false;
    }
}
