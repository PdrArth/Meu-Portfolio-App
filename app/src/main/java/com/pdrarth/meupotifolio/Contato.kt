package com.pdrarth.meupotifolio

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pdrarth.meupotifolio.databinding.ActivityContatoBinding
import com.pdrarth.meupotifolio.utils.IntentUtils

class Contato : AppCompatActivity() {
    
    private lateinit var binding: ActivityContatoBinding
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContatoBinding.inflate(layoutInflater)
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
        binding.cardgithub.setOnClickListener {
            IntentUtils.openUrl(this, Constants.GITHUB_URL)
        }
        
        binding.cardLinkedin.setOnClickListener {
            IntentUtils.openUrl(this, Constants.LINKEDIN_URL)
        }
        
        binding.cardEmail.setOnClickListener {
            IntentUtils.sendEmail(this, Constants.EMAIL_ADDRESS, Constants.EMAIL_SUBJECT)
        }
    }
}
