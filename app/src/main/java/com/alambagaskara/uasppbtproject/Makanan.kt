package com.alambagaskara.uasppbtproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Makanan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_makanan)

        supportActionBar?.title = "Makanan dan Minuman"
    }
}