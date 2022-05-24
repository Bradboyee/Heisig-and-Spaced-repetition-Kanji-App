package com.example.heisigandspacedrepetition

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.heisigandspacedrepetition.Data.Category
import com.example.heisigandspacedrepetition.Data.Kanji
import com.example.heisigandspacedrepetition.Data.KanjiCategory

class KanjiListAdapter(
    private val kanji: List<Kanji>,
    private val kanjiCategory: List<KanjiCategory>,
    chosevalue: Int
) :
    RecyclerView.Adapter<KanjiViewHolder>() {
    val filterkanjicate = kanjiCategory.filter { it.JLPT == chosevalue } // filter kanji that learner chose
    val filterkanjicateonlykanji = filterkanjicate.map { it.Kanji } // filter take only list of kanji

    val filterkanji = kanji.filter { it.Kanji in filterkanjicateonlykanji } // filter kanji that same in filterkanjicateonlykanji list
    override fun getItemCount(): Int = filterkanji.size
    override fun onCreateViewHolder(group: ViewGroup, vt: Int): KanjiViewHolder {
        val view = LayoutInflater.from(group.context).inflate(R.layout.kanji_view,
            group, false)
        return KanjiViewHolder(view)
    }
    override fun onBindViewHolder(viewHolder: KanjiViewHolder, position: Int) {
        viewHolder.bind(filterkanji[position])
    }
}