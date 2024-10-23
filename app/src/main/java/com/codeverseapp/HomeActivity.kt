package com.codeverseapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var userListAdapter: UserListAdapter
    private val viewModel : UserListViewModel by lazy { UserListViewModel() }
    private val layoutManager by lazy { LinearLayoutManager(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        recyclerView = findViewById(R.id.rv_userList)


        userListAdapter = UserListAdapter(emptyList())
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = userListAdapter


        viewModel.data.observe(this, Observer {get ->
            userListAdapter.addData(get)

        })

    }
}


