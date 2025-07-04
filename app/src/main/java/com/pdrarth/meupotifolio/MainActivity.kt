package com.pdrarth.meupotifolio

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pdrarth.meupotifolio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    
    private lateinit var binding: ActivityMainBinding
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        setupClickListeners()
    }
    
    private fun setupClickListeners() {
        binding.projetos.setOnClickListener {
            navigateToActivity(Projetos::class.java)
        }
        
        binding.contatos.setOnClickListener {
            navigateToActivity(Contato::class.java)
        }
    }
    
    private fun navigateToActivity(activityClass: Class<*>) {
        val intent = Intent(this, activityClass)
        startActivity(intent)
        overridePendingTransition(R.anim.slide_in_right, R.anim.fade_in)
    }
}