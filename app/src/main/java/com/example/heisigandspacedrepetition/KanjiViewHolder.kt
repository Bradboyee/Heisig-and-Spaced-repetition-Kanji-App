package com.example.heisigandspacedrepetition

import android.content.Intent
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.heisigandspacedrepetition.Data.Kanji
import kotlinx.android.synthetic.main.kanji_view.view.*

class KanjiViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val kanji = itemView.Kanjitext


    fun bind(kan: Kanji) {
        kanji.text = kan.Kanji
        itemView.setOnClickListener {
            val intent = Intent(
                itemView.context,
                HeisigActivity::class.java)
            intent.putExtra(Select_KanjiActivity.chosekanjiheisig, kan)
            itemView.context.startActivity(intent)
        }
    }
}