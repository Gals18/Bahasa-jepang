package com.galuhsaputri.belajarbahasajepang

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.galuhsaputri.belajarbahasajepang.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //deklarasi varable binding
    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //deklarasi activity main binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //kasih klik untuk masing-masing tombol
        binding.letsPlay.setOnClickListener {
            //do something in here
            val letsPlay = Intent(this@MainActivity, LetsPlayActivity::class.java)
            startActivity(letsPlay)
        }
        //agar tombol tentang dapat diklik
        binding.tentang.setOnClickListener {


            //ini dipakai untuk membuat sebuah object dari intent yang mana
            // akan digunakan untuk berpindah dari halaman MainActivity ke Tentang Aplikasi
            val intentTentang = Intent(this@MainActivity, TentangAplikasi::class.java)

            //mulai/proses menampilkan halaman tentang aplikasi
            startActivity(intentTentang)
        }
    //agar tombol keluar dapat diklik
        binding.keluar.setOnClickListener {
            finish()
        }
    }
}