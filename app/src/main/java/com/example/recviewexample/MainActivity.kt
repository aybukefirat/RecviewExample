package com.example.recviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MainActivity : AppCompatActivity() {

    private lateinit var booksArrayList : ArrayList<Books>
    private lateinit var adapter: BookAdapter
    private lateinit var layoutManager : RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv : RecyclerView = findViewById(R.id.rv)

        rv.setHasFixedSize(true)
        rv.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)

        val b1 = Books(1,"Anatomy Of The Blockbuster Novel", "book1", 25.00)
        val b2 = Books(2,"The Couple Next Door", "book2", 28.00)
        val b3 = Books(3, "The Comfort Book", "book3", 17.00)
        val b4 = Books(4, "Beneath A Scarlet Sky", "book4", 19.75)
        val b5 = Books(5,"Verity", "book5", 16.50)
        val b6 = Books(6, "Wish You Were Here", "book6", 24.25)

        booksArrayList = ArrayList<Books>()
        booksArrayList.add(b1)
        booksArrayList.add(b2)
        booksArrayList.add(b3)
        booksArrayList.add(b4)
        booksArrayList.add(b5)
        booksArrayList.add(b6)

        adapter = BookAdapter(this,booksArrayList)

        rv.adapter = adapter










    }
}