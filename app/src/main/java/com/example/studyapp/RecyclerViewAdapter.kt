package com.example.studyapp
import android.content.Context
import androidx.appcompat.app.AlertDialog
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_row.view.*

class RecyclerViewAdapter (var title:List<String>,private val description:List<String>,var message:List<String>,var context:Context) : RecyclerView.Adapter<RecyclerViewAdapter.ItemViewHolder>() {

    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_row, parent, false)
        )
    }


    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val title1 = title[position]
        val des = description[position]

        holder.itemView.apply {
            titleTv.text = title1
            detTv.text = des

        }
        holder.itemView.setOnClickListener {
           val alert = Alert()

           alert.customAlert(title[position] , message[position],context)



        }
    }

    override fun getItemCount() = title.size


}


