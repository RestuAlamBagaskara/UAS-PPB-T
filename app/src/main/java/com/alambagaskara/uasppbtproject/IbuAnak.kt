package com.alambagaskara.uasppbtproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class IbuAnak : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ibu_anak)

        supportActionBar?.title = "Ibu dan Anak"
    }
}