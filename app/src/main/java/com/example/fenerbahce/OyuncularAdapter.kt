package com.example.fenerbahce

import android.content.Intent
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fenerbahce.databinding.RecyclerRowBinding

class OyuncularAdapter(val kadro:ArrayList<Oyuncular>) : RecyclerView.Adapter<OyuncularAdapter.OyuncularViewHolder>() {

    class OyuncularViewHolder(val binding: RecyclerRowBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OyuncularViewHolder {

        val binding=RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)

        return OyuncularViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return kadro.size
    }

    override fun onBindViewHolder(holder: OyuncularViewHolder, position: Int) {
        holder.binding.textViewRcyclerRow.text=kadro[position].isim

        holder.itemView.setOnClickListener{
            val intent=Intent(holder.itemView.context,TanitimAktivitesi::class.java)
            intent.putExtra("seçilenOyuncu",kadro[position])
            holder.itemView.context.startActivity(intent)
        }



    }

}