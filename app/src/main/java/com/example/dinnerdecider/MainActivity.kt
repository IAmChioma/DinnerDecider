package com.example.dinnerdecider

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var array = arrayListOf<String>(
        "Hamburger", "Pizza",
        "Mexican", "American", "Chinese"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun click(view:View){
        decide.setOnClickListener{
            array.shuffle()
            textView.text = array[0]
        }

        button.setOnClickListener{
            array.add(name.text.toString())
            name.getText().clear()
        }
    }
}