package com.wscauca.appretotwo.ui.home.capacidad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wscauca.appretotwo.R
import com.wscauca.appretotwo.databinding.ActivityCapacidadBinding
import com.wscauca.appretotwo.ui.home.informes.InformesActivity
import com.wscauca.appretotwo.ui.home.registro.MainActivity

class CapacidadActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCapacidadBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCapacidadBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.irRegistro.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }

        binding.irInformes.setOnClickListener{
            startActivity(Intent(this, InformesActivity::class.java))
        }

    }
}