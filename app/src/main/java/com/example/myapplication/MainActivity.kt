package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun radioButtonClick(view: View){
        val id = when (view){
            falcon_id -> R.drawable.falcon
            raptor_id -> R.drawable.raptor
            flanker_id -> R.drawable.flanker
            else -> R.drawable.sukhoi57
        }

        val name = when (view) {
            falcon_id -> falcon_id.text
            raptor_id -> raptor_id.text
            flanker_id -> flanker_id.text
            else -> sukhoi57_id.text
        }
        image.setImageResource(id)
        label.setText(name)
    }

}
