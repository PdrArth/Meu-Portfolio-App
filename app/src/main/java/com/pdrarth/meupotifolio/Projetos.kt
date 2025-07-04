package com.pdrarth.meupotifolio

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pdrarth.meupotifolio.databinding.ActivityProjetosBinding
import com.pdrarth.meupotifolio.utils.IntentUtils

class Projetos : AppCompatActivity() {
    
    private lateinit var binding: ActivityProjetosBinding
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProjetosBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        setupToolbar()
        setupClickListeners()
    }
    
    private fun setupToolbar() {
        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
    }
    
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
    
    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.fade_in, R.anim.slide_in_right)
    }
    
    private fun setupClickListeners() {
        binding.btnVerProjetomoves.setOnClickListener {
            openProjectUrl(Constants.PROJECT_ARTH_MOVIES)
        }
        
        binding.btnVerProjeteocep.setOnClickListener {
            openProjectUrl(Constants.PROJECT_CEP)
        }
        
        binding.btnVerProjeto1.setOnClickListener {
            openProjectUrl(Constants.PROJECT_DELIVERY)
        }
        
        binding.btnVerProjeto2.setOnClickListener {
            openProjectUrl(Constants.PROJECT_TCC)
        }
        
        binding.btnVerProjeto3.setOnClickListener {
            openProjectUrl(Constants.PROJECT_CLIMA_TEMPO)
        }
    }
    
    private fun openProjectUrl(url: String) {
        IntentUtils.openUrl(this, url)
    }
}