package com.main.telapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.main.telapp.databinding.ActivityMainBinding
import com.main.telapp.databinding.ActivityRegistrarVentasBinding
import java.util.*


class Registrar_Ventas_Activity : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    private lateinit var mBinding: ActivityRegistrarVentasBinding
    private lateinit var aaTipos : ArrayAdapter<String>
    private lateinit var aaTelas : ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrar_ventas)

        mBinding = ActivityRegistrarVentasBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        val aaTipos = ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item);
        aaTipos.addAll(Arrays.asList("Sheer Elegance", "Panel Japones", "BlackOut"))

        val aaTelas = ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item);
        aaTelas.addAll(Arrays.asList("Lafayette", "Poliéster", "Algodón", "Lino"))

       mBinding.mSpinnerTipo.onItemSelectedListener = this
        mBinding.mSpinnerTipo.adapter=aaTipos
        mBinding.mSpinnerTela.adapter=aaTelas

    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        val TipoSelect = aaTipos.getItem(position)
        val TelaSelect = aaTelas.getItem(position)

    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        
    }
}