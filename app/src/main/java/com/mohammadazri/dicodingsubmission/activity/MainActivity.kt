package com.mohammadazri.dicodingsubmission.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mohammadazri.dicodingsubmission.model.Legend
import com.mohammadazri.dicodingsubmission.adapter.LegendRecyclerViewAdapter
import com.mohammadazri.dicodingsubmission.model.LegendRepository
import com.mohammadazri.dicodingsubmission.R

class MainActivity : AppCompatActivity(),
    LegendRecyclerViewAdapter.LegendRecyclerViewAdapterInterface {
    private lateinit var recyclerView: RecyclerView
    private var legends: ArrayList<Legend> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "Halaman Utama"

        recyclerView = findViewById(R.id.rv_legends)
        legends.addAll(LegendRepository.listData)

        showRecycler()
    }

    private fun showRecycler() {
        recyclerView.layoutManager = LinearLayoutManager(this)
        val listLegendsAdapter = LegendRecyclerViewAdapter(legends, this)
        recyclerView.adapter = listLegendsAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_profile -> {
                startActivity(Intent(this@MainActivity, AboutActivity::class.java))
            }
        }
    }

    override fun onItemClicked(legend: Legend) {
        val intent = Intent(this, LegendDetailActivity::class.java)
        intent.putExtra(LegendDetailActivity.EXTRA_IMAGE, legend.imageDetail)
        intent.putExtra(LegendDetailActivity.EXTRA_NAME, legend.realName)
        intent.putExtra(LegendDetailActivity.EXTRA_GENDER, legend.gender)
        intent.putExtra(LegendDetailActivity.EXTRA_AGE, legend.age)
        intent.putExtra(LegendDetailActivity.EXTRA_HEIGHT, legend.height)
        intent.putExtra(LegendDetailActivity.EXTRA_HOME, legend.home)
        intent.putExtra(LegendDetailActivity.EXTRA_BIOGRAPHY, legend.biography)
        intent.putExtra(LegendDetailActivity.EXTRA_SKILLT_IMAGE, legend.skillTImage)
        intent.putExtra(LegendDetailActivity.EXTRA_SKILLP_IMAGE, legend.skillPImage)
        intent.putExtra(LegendDetailActivity.EXTRA_SKILLU_IMAGE, legend.skillUImage)
        intent.putExtra(LegendDetailActivity.EXTRA_SKILLT_NAME, legend.skillTName)
        intent.putExtra(LegendDetailActivity.EXTRA_SKILLP_NAME, legend.skillPName)
        intent.putExtra(LegendDetailActivity.EXTRA_SKILLU_NAME, legend.skillUName)
        startActivity(intent)
    }
}