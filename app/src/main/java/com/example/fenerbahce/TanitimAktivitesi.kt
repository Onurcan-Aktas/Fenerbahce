package com.example.fenerbahce

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.fenerbahce.databinding.ActivityMainBinding
import com.example.fenerbahce.databinding.ActivityTanitimAktivitesiBinding

class TanitimAktivitesi : AppCompatActivity() {

    private lateinit var binding: ActivityTanitimAktivitesiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityTanitimAktivitesiBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val adapterdengelenIntent= intent
        //val   secilenOyuncu=adapterdengelenIntent.getSerializableExtra("seçilenOyuncu",Oyuncular::class.java)  bu hali şuan kullanılırsa androidin eski
        // sürümlerinde çalışmaz o yüzden eski sürümünü kullanıyoruz.
        val   secilenOyuncu=adapterdengelenIntent.getSerializableExtra("seçilenOyuncu") as Oyuncular

        binding.imageView3.setImageResource(secilenOyuncu.resim)
        binding.isimtextView.text=secilenOyuncu.isim
        binding.mevkitextView.text=secilenOyuncu.mevki



    }
}