package com.example.noteapp

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.browser.customtabs.CustomTabsIntent

class about_us : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_us)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val source=findViewById<TextView>(R.id.source_code)
        source.setOnClickListener {
            val url="https://github.com/sanjogpanda2001/Note-Application.git"
           val builder=CustomTabsIntent.Builder()
            val intent=builder.build()
            intent.launchUrl(this, Uri.parse(url))
        }
    }
}