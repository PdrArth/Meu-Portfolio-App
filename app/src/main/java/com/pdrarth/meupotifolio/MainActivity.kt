package com.pdrarth.meupotifolio

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.pdrarth.meupotifolio.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var projetc = binding.projetos
        var contact = binding.contatos




        projetc.setOnClickListener {
            var intent =  Intent(this, Projetos::class.java)
            startActivity(intent)


        }
        contact.setOnClickListener {
            var intent =  Intent(this, Contato::class.java)
            startActivity(intent)
        }
    }
}