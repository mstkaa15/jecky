package com.example.tgsrecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class GridActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MakananAdapter adapter;
    private ArrayList<Makanan> makananArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);
        addData();
        recyclerView =
                (RecyclerView) findViewById(R.id.recyclerview);
        adapter = new MakananAdapter(makananArrayList, this, 2);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 3);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        makananArrayList = new ArrayList<>();
        makananArrayList.add(new Makanan("Klepon", "Klepon atau kelepon adalah sejenis makanan tradisional atau kue tradisional Indonesia yang termasuk ke dalam kelompok jajanan pasar.", R.drawable.klepon));
        makananArrayList.add(new Makanan("Mie", "Mi adalah adonan tipis dan panjang yang telah digulung, dikeringkan, dan dimasak dalam air mendidih.", R.drawable.mie));
        makananArrayList.add(new Makanan("Nogosari", "Kue Nagasari atau Kue Nogosari merupakan jenis kue basah tradisional yang sangat populer dan diwariskan dari generasi ke generasi dalam masyarakat Jawa.", R.drawable.nogosari));
        makananArrayList.add(new Makanan("Rawon", "Rawon adalah masakan Indonesia berupa sup daging berkuah hitam dengan campuran bumbu khas yang menggunakan kluwek.", R.drawable.rawon));
        makananArrayList.add(new Makanan("Rendang", "Rendang atau randang dalam bahasa Minangkabau adalah Masakan Minangkabau yang berbahan dasar daging yang berasal dari Sumatera Barat, Indonesia. Masakan ini dihasilkan dari proses memasak suhu rendah dalam waktu lama dengan menggunakan aneka rempah-rempah dan santan.", R.drawable.rendang));
        makananArrayList.add(new Makanan("Sate", "Sate atau satai adalah makanan yang terbuat dari daging yang dipotong kecil-kecil dan ditusuk sedemikian rupa dengan tusukan lidi tulang daun kelapa atau bambu, kemudian dipanggang menggunakan bara arang kayu.", R.drawable.sate));
    }
}