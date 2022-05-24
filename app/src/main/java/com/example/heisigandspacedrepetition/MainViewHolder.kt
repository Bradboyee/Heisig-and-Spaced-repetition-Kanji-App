package com.example.heisigandspacedrepetition

import android.content.Intent
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.heisigandspacedrepetition.Data.Category
import kotlinx.android.synthetic.main.kanji_view.view.*

class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val category_text = itemView.Kanjitext
    fun bind(category: Category) {
        category_text.text = category.CategoryName



        itemView.setOnClickListener {
            val intent = Intent(
                itemView.context,
                Select_KanjiActivity::class.java)
            intent.putExtra(Select_KanjiActivity.JLPTlevel, category.JLPT)
            itemView.context.startActivity(intent)
        }
    }
}