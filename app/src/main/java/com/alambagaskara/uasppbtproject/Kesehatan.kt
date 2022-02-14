package com.alambagaskara.uasppbtproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Kesehatan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kesehatan)

        supportActionBar?.title = "Kesehatan dan Perawatan"
    }
}