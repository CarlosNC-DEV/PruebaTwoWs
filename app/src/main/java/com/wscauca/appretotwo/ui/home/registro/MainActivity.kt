package com.wscauca.appretotwo.ui.home.registro

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.core.view.isNotEmpty
import com.wscauca.appretotwo.databinding.ActivityMainBinding
import com.wscauca.appretotwo.ui.home.capacidad.CapacidadActivity
import com.wscauca.appretotwo.ui.home.informes.InformesActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.irCapacidad.setOnClickListener {
            startActivity(Intent(this, CapacidadActivity::class.java))
        }

        binding.irInformes.setOnClickListener {
            startActivity(Intent(this, InformesActivity::class.java))
        }

        val claseVehiculo = binding.claseVehiculo
        val items = listOf("Clase Vehiculo", "carro", "moto")
        val adapter =
            object : ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, items) {
                override fun isEnabled(position: Int): Boolean {
                    return position != 0
                }

            }
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        claseVehiculo?.adapter = adapter


        binding.btnRegistrar?.setOnClickListener {
            val radioEntrada = binding.radioEntrada?.isChecked
            val radioSalida = binding.radioSalida?.isChecked
            val claseVehiculoSelect = claseVehiculo?.selectedItem.toString()

            if (claseVehiculo != null) {
                if(claseVehiculo.isNotEmpty()){

                }
            }

        }


    }
}