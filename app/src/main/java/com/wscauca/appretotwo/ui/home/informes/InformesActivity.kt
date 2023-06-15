package com.wscauca.appretotwo.ui.home.informes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wscauca.appretotwo.R
import com.wscauca.appretotwo.databinding.ActivityInformesBinding
import com.wscauca.appretotwo.ui.home.capacidad.CapacidadActivity
import com.wscauca.appretotwo.ui.home.registro.MainActivity

class InformesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityInformesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInformesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.irRegistro.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }

        binding.irCapacidad.setOnClickListener{
            startActivity(Intent(this, CapacidadActivity::class.java))
        }

    }
}