package com.alambagaskara.uasppbtproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class RumahDapur : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rumah_dapur)

        supportActionBar?.title = "Rumah dan Dapur"
    }
}