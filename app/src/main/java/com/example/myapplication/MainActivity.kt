package com.example.myapplication

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.net.Uri
import android.widget.Button
import androidx.core.content.ContextCompat.startActivity
import android.view.View
import android.widget.ImageView
import androidx.core.content.ContextCompat

@Suppress("NAME_SHADOWING")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the Subscribe button by its ID
        val subscribeButton: Button = findViewById(R.id.subscribeButton)

        // Set an OnClickListener for the Subscribe button
        subscribeButton.setOnClickListener {
            // Create an intent to navigate to SubscribeActivity
            val intent = Intent(this, Subscribe_Activity::class.java)
            startActivity(intent)

            val imageView: ImageView = findViewById(R.id.imageView)
            imageView.setImageResource(R.drawable.logo_02)

            val openWebsiteButton: Button = findViewById(R.id.openWebsiteButton)

            openWebsiteButton.setOnClickListener {
                val websiteUrl = "https://br-galleri.no/"
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl))
                startActivity(intent)
            }
        }
    }
}








