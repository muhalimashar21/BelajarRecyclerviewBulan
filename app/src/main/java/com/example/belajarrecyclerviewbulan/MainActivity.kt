package com.example.belajarrecyclerviewbulan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    // inisialisasi Arraylist kosong yang nantinya akan diisi data nama bulan hijriyah
    val bulanMasehi: ArrayList<String> = ArrayList()

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listBulanMasehi()

        viewManager = LinearLayoutManager(this)
        viewAdapter = BulanMasehiAdapter(bulanMasehi, this)

        recyclerView = findViewById(R.id.rv_bulan_masehi)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = viewManager
        recyclerView.adapter = viewAdapter
    }

    fun listBulanMasehi(){

        bulanMasehi.add("Januari")
        bulanMasehi.add("Februari")
        bulanMasehi.add("Maret")
        bulanMasehi.add("April")
        bulanMasehi.add("Mei")
        bulanMasehi.add("Juni")
        bulanMasehi.add("Juli")
        bulanMasehi.add("Agustus")
        bulanMasehi.add("September")
        bulanMasehi.add("Oktober")
        bulanMasehi.add("November")
        bulanMasehi.add("Desember")
    }
}
