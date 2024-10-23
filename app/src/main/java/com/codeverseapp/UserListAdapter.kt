package com.codeverseapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UserListAdapter(private var data : List<UserListData>)  : RecyclerView.Adapter<UserListAdapter.MainViewHolder>(){
    private var fullDataList = data.toList()

    class MainViewHolder(val view : View): RecyclerView.ViewHolder(view) {
        fun bind(data: UserListData){
            view.findViewById<TextView>(R.id.etUserName).text = data.username
            view.findViewById<TextView>(R.id.etName).text = data.name
            view.findViewById<TextView>(R.id.etEmail).text = data.email


        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserListAdapter.MainViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return MainViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserListAdapter.MainViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int = data.size

    fun addData(newdata : List<UserListData>){
        data =  newdata
        notifyDataSetChanged()
    }


}