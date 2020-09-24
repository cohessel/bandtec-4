package com.example.VidaeImagem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var cliques = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun contar(component:View) {
        cliques++

        text_view.text = "Cliques: $cliques"

        if(cliques == 5) {
            foto.setImageDrawable(getDrawable(R.mipmap.titi_emoji))
        }
    }
}