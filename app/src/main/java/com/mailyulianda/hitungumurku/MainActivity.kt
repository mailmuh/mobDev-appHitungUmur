package com.mailyulianda.hitungumurku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnHitung.setOnClickListener {

            var tahunLahir = etInputUmur.text.toString()
            var tahun: Int = Calendar.getInstance().get(Calendar.YEAR)

            var umur = 0
            if (tahunLahir.toIntOrNull() !=null) {
                umur = tahun - tahunLahir.toInt()
                txtUmur.text = "Umur = $umur tahun"
            } else {
                txtUmur.text = "tahun tidak valid"
            }
        }
    }
}
