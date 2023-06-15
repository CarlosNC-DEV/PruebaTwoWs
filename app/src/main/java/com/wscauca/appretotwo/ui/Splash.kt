package com.wscauca.appretotwo.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.wscauca.appretotwo.R
import com.wscauca.appretotwo.ui.home.registro.MainActivity

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        object : CountDownTimer(1200, 1000){
            override fun onTick(millisUntilFinished: Long) {

            }

            override fun onFinish() {
                startActivity(Intent(this@Splash, MainActivity::class.java))
                finish()
            }

        }.start()
    }
}