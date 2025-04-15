package com.pdrarth.meupotifolio

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import com.pdrarth.meupotifolio.databinding.ActivityContatoBinding



private lateinit var binding: ActivityContatoBinding

class Contato : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityContatoBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        // Muda a cor da Status Bar para a mesma cor da Toolbar
        var linkgit = binding.cardgithub
        var linklinkdin = binding.cardLinkedin
        var email = binding.cardEmail

        linkgit.setOnClickListener {
            abrirLink("https://github.com/PdrArth")
        }
        linklinkdin.setOnClickListener {
            abrirLink("https://www.linkedin.com/in/pdrarth/")
        }

        email.setOnClickListener {
            enviarEmail()
        }
    }

    private fun enviarEmail() {
        val intent = Intent(Intent.ACTION_SENDTO).apply {
            data = Uri.parse("mailto:") // Garante que só apps de e-mail abram
            putExtra(Intent.EXTRA_EMAIL, arrayOf("pedroarthurpdrarth@gmail.com")) // Seu e-mail
            putExtra(Intent.EXTRA_SUBJECT, "Contato via Portfólio") // Assunto padrão
        }

        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        }
    }

    private fun abrirLink(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)

    }
}
