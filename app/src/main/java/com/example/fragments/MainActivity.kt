package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAnalog = findViewById<Button>(R.id.button3)
        val btnImage = findViewById<Button>(R.id.button4)

        btnAnalog.setOnClickListener {
            replaceContent(AnalogClockFragment())
        }
        btnImage.setOnClickListener {
            replaceContent(ImageFragment())
        }
    }

    private fun replaceContent(frag : Fragment) {
        val fragManager = supportFragmentManager
        val fragTransaction = fragManager.beginTransaction()
        fragTransaction.replace(R.id.fragView,frag)
        fragTransaction.commit()
    }
}