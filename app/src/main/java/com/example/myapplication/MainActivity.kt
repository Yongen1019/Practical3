package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //int i;
    //i=10

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        var student :Student = Student("Ali", "RSD")

        super.onCreate(savedInstanceState)

        binding.btnSetData.setOnClickListener(){

            //var student = Student("Ali", "RSD")

            binding.myStudent = student

            //binding.tvName.text = "Ali"
            //binding.tvProgramme.text = "RSD"
        }

        binding.btnChangeValue.setOnClickListener(){
            student.programme = "RIT"
            binding.invalidateAll()
        }
    }
}


