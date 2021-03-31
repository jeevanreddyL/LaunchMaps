package com.globomed.launchmaps

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LaunchMaps : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button =findViewById(R.id.button)
        button.setOnClickListener {
            val mapIntent: Intent = Uri.parse(
                "geo:0,0?q=1600+Amphitheatre+Parkway,+Mountain+View,+California"
            ).let { location ->
                // Or map point based on latitude/longitude
                // val location: Uri = Uri.parse("geo:37.422219,-122.08364?z=14") // z param is zoom level
                Intent(Intent.ACTION_VIEW, location)
            }
            startActivity(mapIntent)
        }
    }
}