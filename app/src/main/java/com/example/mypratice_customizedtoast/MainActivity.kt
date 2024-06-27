package com.example.mypratice_customizedtoast

import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mypratice_customizedtoast.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            val toast = Toast(this)
            with(toast){
                view = LayoutInflater.from(it.context).inflate(R.layout.toast_layout, null)
                duration = Toast.LENGTH_SHORT
                setGravity(Gravity.TOP, 100, 0)
                show()
            }
        }
    }
}