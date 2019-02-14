package com.archie.cocktails.databinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.archie.cocktails.R
import com.archie.cocktails.databinding.model.User

class DataBindingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityDatabindingBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_databinding)
        val user = User("Archie", 29, "LanZhou")
        binding.user = user
    }

}