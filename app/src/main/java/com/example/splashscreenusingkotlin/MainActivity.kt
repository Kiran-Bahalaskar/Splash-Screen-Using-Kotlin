package com.example.splashscreenusingkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //full screen activity code
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        //handle to splash screen
        Handler().postDelayed(Runnable {

            //jump to welcome activity
            startActivity(Intent(this, WelcomeActivity::class.java))

            //when user back press then application is closed
            finish()

            // 3 second work splash screen application
        }, 3000)

    }
}
