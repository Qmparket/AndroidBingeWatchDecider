package com.example.dgenkov.bingewatchdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val displaySeriesTitleField = findViewById<TextView>(R.id.seriesTitleTextView)
        val addNewSeriesButton = findViewById<Button>(R.id.addNewButton)
        val addNewSeriesEditText = findViewById<EditText>(R.id.addNewEditText)
        var decideButton = findViewById<Button>(R.id.decideButton)
        val random = Random()

        var titlesList = mutableListOf<String>("Dexter", "Chuck", "Shadow Hunters", "Game Of Thrones")

        displaySeriesTitleField.text = titlesList[0]

        addNewSeriesButton.setOnClickListener {
            if(addNewSeriesEditText.text.toString() != "") {
                titlesList.add(addNewSeriesEditText.text.toString())
                addNewSeriesEditText.text.clear()
            }
        }

        decideButton.setOnClickListener {
            val randomNumber = titlesList.size
            displaySeriesTitleField.text = titlesList[random.nextInt(randomNumber)]

        }



    }
}
