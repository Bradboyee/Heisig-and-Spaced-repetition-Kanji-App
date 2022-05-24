package com.example.heisigandspacedrepetition

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.heisigandspacedrepetition.Data.Data
import kotlinx.android.synthetic.main.select_kanji.*

class Select_KanjiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.select_kanji)
        val chosevalue = intent.getIntExtra(JLPTlevel,-1)

        val text = when (chosevalue) {
            0 -> "this is N5 Category"
            1 -> "this is N4 Category"
            2 -> "this is N3 Category"
            3 -> "this is N2 Category"
            4 -> "this is N1 Category"
            else -> "Out of Category"
        }
        testtext.text = chosevalue.toString()
        recycle_chose_cate.layoutManager =  GridLayoutManager(this, 5, GridLayoutManager.VERTICAL, false)
        recycle_chose_cate.adapter = KanjiListAdapter(Data.kanji,Data.kanjicategory,chosevalue)
    }
    companion object {
        const val chosekanjiheisig = "chosekanjiheisig"
        const val JLPTlevel = "JLPTlevel"
    }
}