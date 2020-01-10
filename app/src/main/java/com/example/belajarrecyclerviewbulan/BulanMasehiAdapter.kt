package com.example.belajarrecyclerviewbulan

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.bulan_masehi_list_item.view.*

class BulanMasehiAdapter(val items: ArrayList<String>, val context: Context) : RecyclerView.Adapter<ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder?.tvNamaBulanMasehi?.text = items.get(position)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.bulan_masehi_list_item, parent, false))

    }

    override fun getItemCount(): Int {
        return items.size
    }
}

class ViewHolder (view: View) : RecyclerView.ViewHolder(view){
    val tvNamaBulanMasehi = view.tv_nama_blnmasehi
}