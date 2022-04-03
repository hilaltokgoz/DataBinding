package com

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.databindinglearn.R
import com.databindinglearn.databinding.ActivityModelBinding

class ModelActivity : AppCompatActivity() {
    lateinit var binding :ActivityModelBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_model)

        binding.cat=CatModel("Boncuk","British",2) //Cat Model den kedi nesnesi oluşturduk


    }
}