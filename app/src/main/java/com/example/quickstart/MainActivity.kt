package com.example.quickstart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var newRecylerView : RecyclerView
    private lateinit var newArrayList: ArrayList<News>
    lateinit var imageId : Array<Int>
    lateinit var Titulo : Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        imageId = arrayOf(


                    R.drawable.a,
                    R.drawable.b,
                    R.drawable.c,
                    R.drawable.d,
                    R.drawable.e,
                    R.drawable.f,
                    R.drawable.g,
                    R.drawable.h,
                    R.drawable.i,
                    R.drawable.j


        )

        Titulo = arrayOf(
               "Biden aims to expand vaccines for adults and children",
               "just got my first shot, helping the world to be a safer place",
               "local trains to be suspended in bemgal from tomorrow",
               "MHA asks states, UTs to ensure there no fires in hospitals",
               "Australian citizen sues PM Morrison over flight ban from india",
               "Former india hockey coach kaushik hospitalised after testing posiive for COVID",
               "Delhi records 20,960 fresh covid-19 infections positivity rate at 26.37%",
               "Barcelona church offers open-air space for Ramandan",
               "Trillions of cicadas set to emerge in the US, here s why",
               "Homemaker, economist: cadidates from all walks of life in Bengal assembly"
        )

         newRecylerView = findViewById(R.id.recyclerView)
        newRecylerView.layoutManager = LinearLayoutManager(this)
        newRecylerView.setHasFixedSize(true)

        newArrayList = arrayListOf<News>()
        getUserdata()


    }

    private fun getUserdata() {

        for (i in imageId.indices){


            val news = News(imageId[i],Titulo[i])
            newArrayList.add(news)
        }

         newRecylerView.adapter = MyAdapter(newArrayList)


    }


}















