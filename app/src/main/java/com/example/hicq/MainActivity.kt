package com.example.hicq

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

//instance name: Type
//intCount: Integer
class MainActivity : AppCompatActivity() {

    //onCrate = main() function
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Load UI to memory
        //R = resources class
        setContentView(R.layout.activity_main)

        //Declare variable, val = value (no change), var = variable (will change like input)
        val textViewName: TextView = findViewById(R.id.textViewName)
        val imageViewQR: ImageView = findViewById(R.id.imageViewQR)
        val buttonShow: Button = findViewById(R.id.buttonShow)
        val buttonHide: Button = findViewById(R.id.buttonHide)

        buttonShow.setOnClickListener {
            textViewName.visibility = View.VISIBLE
            imageViewQR.visibility = View.VISIBLE
        }
        buttonHide.setOnClickListener {
            textViewName.visibility = View.INVISIBLE
            imageViewQR.visibility = View.INVISIBLE
        }
    }
}