package com.hanafi_19104004.praktikum_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.hanafi_19104004.praktikum_6.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val list = ArrayList<MyData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        list.addAll(getListMyDatas())
        showRecyclerList()
    }
    fun getListMyDatas(): java.util.ArrayList<MyData> {
        val dataName = resources.getStringArray(R.array.data_name)
        val dataDescription = resources.getStringArray(R.array.data_description)
        val dataPhoto = resources.getStringArray(R.array.data_photo)
        val listMyData = java.util.ArrayList<MyData>()
        for (position in dataName.indices) {
            val myData = MyData(
                dataName[position],
                dataDescription[position],
                dataPhoto[position]
            )
            listMyData.add(myData)
        }
        return listMyData
    }

    private fun showRecyclerList() {
        binding.apply {
            rv_mydata.layoutManager = LinearLayoutManager(this@MainActivity)
            val listMyDataAdapter = MainAdapter(list)
            rv_mydata.adapter = listMyDataAdapter
        }
    }
}