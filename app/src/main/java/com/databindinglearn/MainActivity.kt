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
        //data ile oluşturulan variable
        binding.mainActivityObject=this //burası mainActivityObject

        binding.avarageResult="0" //null harası almamak için default değer verdik.

    }
    fun avarageCalculation(firstNumber:String,secondNumber:String){
        val firstNumber=firstNumber.toInt()
        val secondNumber=secondNumber.toInt()
        val avarage=(firstNumber+secondNumber)/2
        binding.avarageResult=avarage.toString()
    }
}