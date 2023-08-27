package com.example.myapplication

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import androidx.core.content.ContextCompat.startActivity
import android.view.View
import androidx.core.content.ContextCompat

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
        }
    }
}

class SubscribeActivity {

}








