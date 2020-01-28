package com.example.mykotlin01

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var t1:TextView = findViewById(R.id.textView) as TextView
        var t2:TextView = findViewById(R.id.textView2) as TextView
        var t3:TextView = findViewById(R.id.textView3) as TextView

        t1.setText("Test Android version = " + Build.VERSION.RELEASE)
        t2.setText("API niveau = " + Build.VERSION.SDK_INT)
        t3.setText("Apparaat = " + Build.MANUFACTURER)
    }
}
