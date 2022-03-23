package com.databindinglearn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.databindinglearn.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //DataBinding Oluşturma
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)

      binding.resultButton.setOnClickListener {
          val firstNumber=binding.firstNumberEditText.text.toString().toInt()
          val secondNumber=binding.secondNumberEditText.text.toString().toInt()
          val avarage=(firstNumber+secondNumber)/2
          binding.resultTextView.text=avarage.toString()
      }

    }
}