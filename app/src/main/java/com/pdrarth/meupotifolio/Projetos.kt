package com.pdrarth.meupotifolio

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.pdrarth.meupotifolio.databinding.ActivityProjetosBinding
import java.net.URL


private lateinit var binding: ActivityProjetosBinding

class Projetos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProjetosBinding.inflate(layoutInflater)
        setContentView(binding.root)
        window.statusBarColor = ContextCompat.getColor(this, R.color.blue)

        var projetodeliviry = binding.btnVerProjeto1
        var projetosistematcc = binding.btnVerProjeto2
        var projetoclimatempo = binding.btnVerProjeto3


        projetodeliviry.setOnClickListener {
            urlProjetos("https://github.com/PdrArth/App-Delivery-")

        }
        projetosistematcc.setOnClickListener {
            urlProjetos("https://github.com/PdrArth/Agendamento-TCC")

        }
        projetoclimatempo.setOnClickListener {
            urlProjetos("https://github.com/luizmiguelrosa/ClimaTempo-ADS100")

        }
    }

    private fun urlProjetos(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)

    }
}