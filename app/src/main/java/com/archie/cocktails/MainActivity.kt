package com.archie.cocktails

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.archie.cocktails.databinding.DataBindingActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        gotoDataBindingBtn.setOnClickListener { startActivity(Intent(this@MainActivity, DataBindingActivity::class.java)) }
    }
}
