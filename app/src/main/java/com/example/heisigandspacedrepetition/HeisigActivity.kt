package com.example.heisigandspacedrepetition

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.heisigandspacedrepetition.Data.Kanji
import kotlinx.android.synthetic.main.heisig.*

class HeisigActivity  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.heisig)
        val Heisig = intent.getParcelableExtra<Kanji>("chosekanjiheisig")
        if (Heisig != null) {
            kanjilogo.text = Heisig.Kanji
            kanjimeaning.text = Heisig.Kmeaning
            kanjijlpt.text = Heisig.Kname
            kanjipronoucing.text = Heisig.onyomi
        }
    }

}