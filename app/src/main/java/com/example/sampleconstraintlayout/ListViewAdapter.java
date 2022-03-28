package com.example.sampleconstraintlayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {

    //Deklarasi variable dengan jenis data context
    Context mContext;

    //Deklarasi variable dengan jenis data Layout inflater
    LayoutInflater inflater;

    //Deklarasi variable dengan jenis data arraylist
    private ArrayList<ClassNama> arrayList;

    //Membuat konstruktur Listviewadapter
    public ListViewAdapter(Context context)
    {
        //memberikan nilai mContext dengan context
        mContext = context;

        //mengatur Layoutinflater dari context yang diberikan
        inflater = LayoutInflater.from(mContext);

        //Memberikan nilai arraylist dari class ClassNama
        this.arrayList = new ArrayList<ClassNama>();

        //Menambahkan semua elemen ke array list
        this.arrayList.addAll(Home_Activity.classNamaArrayList);
    }

    //Membuat class untuk mendeklarasikan tempat untuk meletakkan isi ke dalam ListView
    public class ViewHolder{
        //Mendeklarasikan variable dengan jenis textview
        TextView name;
    }

    //Fungsi getCount() mengembalikan jumlah item yang akan ditampilkan dalam list
    @Override
    public int getCount() {
        //Mengembalikan nilai berupa jumlah data dari array data
        return Home_Activity.classNamaArrayList.size();
    }


    //Fungsi ini digunakan untuk mendapatkan data item yang terkait dengan posisi tertentu
    //dalam kumpulan data untuk mendapatkan data yang sesuai dari lokasi tertentu dalam pengumpulan data item
    @Override
    public Object getItem(int i) {
        //mengembalikan nilai berupa objek dari array data
        return Home_Activity.classNamaArrayList.get(i);
    }

    //Fungsi mengembalikan "nilai" dari posisi item ke adaptor.
    @Override
    public long getItemId(int i) {
        return i;
    }


    //FUngsi ini secara otomatis dipanggil ketika tampilan item list siap untuk
    //ditampilkan atau akan ditampilkan
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //deklarasi variable dengan jenis data ViewHolder
        final ViewHolder holder;

        //Membuat kondisi apakah view null atau tidak
        if(view == null)
        {
            //Membuat objek view holder
            holder = new ViewHolder();

            //Mengatur Layout untuk menampilkan item
            view = inflater.inflate(R.layout.item_listview, null);

            //set id untuk textview
            holder.name = (TextView) view.findViewById(R.id.tvnama_item);

            //menyimpan data dalam tampilan tanpa menggunakan struktur data lain.
            view.setTag(holder);
        }else
        {
            //Mengatur holder untuk mengembalikan nilai dari view tag.
            holder = (ViewHolder) view.getTag();
        }
        //Set item ke TextView
        holder.name.setText(Home_Activity.classNamaArrayList.get(i).getName());

        //mengembalikan nilai ke variable view
        return view;
    }
}
