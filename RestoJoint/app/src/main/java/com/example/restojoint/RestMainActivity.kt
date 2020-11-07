package com.example.restojoint

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.restojoint.View.RestAdapter
import com.example.restojoint.View.ViewModel.RestViewModel

class RestMainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: RecyclerView.Adapter<*>
    private lateinit var viewModel: RestViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        recyclerView =findViewById(R.id.R_L_View)
        viewModel = ViewModelProvider(this).get(RestViewModel::class.java)
        viewModel.RestoLiveData.observe(this){
            it?.let{ newRestoList->
                adapter = RestAdapter(newRestoList)
                recyclerView.adapter = adapter
                recyclerView.layoutManager = LinearLayoutManager(this)
                val itemDecor = DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
                itemDecor.setDrawable(getDrawable(R.drawable.divider)!!)
                recyclerView.addItemDecoration(itemDecor)
            }
        }
        viewModel.populatedata()
    }
}