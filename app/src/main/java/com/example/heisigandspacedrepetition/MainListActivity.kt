package com.example.heisigandspacedrepetition

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.heisigandspacedrepetition.Data.Data
import kotlinx.android.synthetic.main.main_list.*

class MainListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_list)
        cattegorytopic.text = "Category"
        recyclerviewcate.layoutManager =  LinearLayoutManager(this)
        recyclerviewcate.adapter = MainListAdapter(Data.category)
    }
}
