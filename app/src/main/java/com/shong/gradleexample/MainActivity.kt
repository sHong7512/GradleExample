package com.shong.gradleexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.buildConfigTextView).text = "${BuildConfig.Example_buildConfigField}"
        findViewById<TextView>(R.id.resValueTextView).text = "${getText(R.string.Example_resValue)}"

    }
}