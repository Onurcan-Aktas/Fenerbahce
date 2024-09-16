package com.example.fenerbahce

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fenerbahce.databinding.ActivityMainBinding
/*
activity main e recycler view koyuyoruz bu bizim ekranı kaydırdığımız ilk kısım.uygulamaya girince ilk burayı görüyoruz.
sonra başka bir layout daha açıp ismini rycler_row koyduk bu da sadece recycler view deki her bir karakteri oluşturan eleman.recycler view daki itemler yani.
 */
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var kadro:ArrayList<Oyuncular>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val kaleci=Oyuncular("Livakovic","Kaleci",R.drawable.liva)
        val defans1=Oyuncular("Djiku","Defans",R.drawable.djiku)
        val defans2=Oyuncular("Çağlar","Defans",R.drawable.caglar)
        val sag_bek=Oyuncular("Osayi","Sağ bek",R.drawable.osayi)
        val sol_bek=Oyuncular("Oosterwolde","Sol bek",R.drawable.oosterwolde)
        val merkez1=Oyuncular("Fred Çakmaktaş","orta saha",R.drawable.firet)
        val merkez2=Oyuncular("İsmail yüksek","orta saha",R.drawable.ismail)
        val oos=Oyuncular("Dusan Tadic","ofansif orta saha",R.drawable.tadic)
        val sol_açık=Oyuncular("Saint-Maximin","Sağ açık",R.drawable.maxi)
        val sag_açık=Oyuncular("İrfancan Kahveci","Sol bek",R.drawable.irfan)
        val hucum=Oyuncular("Yusuf En-Nessiri","Santrafor",R.drawable.yusuf)

        kadro= arrayListOf(kaleci,defans1,defans2,sag_bek,sol_bek,merkez1,merkez2,oos,sol_açık,sag_açık,hucum,kaleci,defans1,defans2,sag_bek,sol_bek,merkez1,merkez2,oos,sol_açık,sag_açık,hucum)

        val adapter=OyuncularAdapter(kadro)

        binding.OyuncularRecylerView.layoutManager=LinearLayoutManager(this)

        binding.OyuncularRecylerView.adapter  =adapter



    }
}