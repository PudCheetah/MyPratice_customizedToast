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
import com.example.mypratice_customizedtoast.databinding.ToastLayout2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            var toastLayoutBinding = ToastLayout2Binding.inflate(layoutInflater)
            val toast = Toast(this)
            with(toast) {
                //使用viewBinding來修改TextView的文字，來達成自訂Toast文字的效果
                toastLayoutBinding.toastText.text = "123"
                view = toastLayoutBinding.root
                duration = Toast.LENGTH_SHORT
                setGravity(Gravity.TOP, 100, 0)
                show()
            }
        }
    }
}