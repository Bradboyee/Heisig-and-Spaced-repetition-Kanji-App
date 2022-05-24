package com.example.heisigandspacedrepetition

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.heisigandspacedrepetition.Data.Category

class MainListAdapter(private val cate: List<Category>) :
    RecyclerView.Adapter<MainViewHolder>() {
    override fun getItemCount(): Int = cate.size
    override fun onCreateViewHolder(group: ViewGroup, vt: Int): MainViewHolder {
        val view = LayoutInflater.from(group.context).inflate(R.layout.kanji_view,
            group, false)
        return MainViewHolder(view)
    }
    override fun onBindViewHolder(viewHolder: MainViewHolder, position: Int) {
        viewHolder.bind(cate[position])
    }
}