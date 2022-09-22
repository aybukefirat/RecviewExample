package com.example.recviewexample

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class BookAdapter(private val mContext: Context, private val booksList : List<Books> )
    : RecyclerView.Adapter<BookAdapter.BooksCardHolder>() {

    inner class BooksCardHolder(view : View) : RecyclerView.ViewHolder(view){

        var imageViewBook : ImageView
        var textViewBookTitle : TextView
        var textViewBookPrice : TextView
        var buttonAdd : Button

        init {
            imageViewBook = view.findViewById(R.id.imageViewBook)
            textViewBookTitle = view.findViewById(R.id.textViewBookTitle)
            textViewBookPrice = view.findViewById(R.id.textViewBookPrice)
            buttonAdd = view.findViewById(R.id.buttonAdd)
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BooksCardHolder {

        val design = LayoutInflater.from(mContext).inflate(R.layout.card_design, parent, false)
        return BooksCardHolder(design)

    }

    override fun onBindViewHolder(holder: BooksCardHolder, position: Int) {

        val book = booksList[position]
        holder.textViewBookTitle.text = book.bookname
        holder.textViewBookPrice.text = "${book.book_price} TL"
        holder.imageViewBook
            .setImageResource(mContext.resources.getIdentifier(book.book_image_name, "drawable", mContext.packageName))
        holder.buttonAdd.setOnClickListener{
            Toast.makeText(mContext , "${book.bookname} added to cart", Toast.LENGTH_SHORT).show()
        }


    }

    override fun getItemCount(): Int {

        return booksList.size

    }
}