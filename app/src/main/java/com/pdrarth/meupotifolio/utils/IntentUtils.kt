package com.pdrarth.meupotifolio.utils

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.widget.Toast

object IntentUtils {
    
    fun openUrl(context: Context, url: String) {
        try {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            if (intent.resolveActivity(context.packageManager) != null) {
                context.startActivity(intent)
            } else {
                Toast.makeText(context, "Nenhum aplicativo encontrado para abrir este link", Toast.LENGTH_SHORT).show()
            }
        } catch (e: Exception) {
            Toast.makeText(context, "Erro ao abrir link: ${e.message}", Toast.LENGTH_SHORT).show()
        }
    }
    
    fun sendEmail(context: Context, email: String, subject: String) {
        try {
            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:")
                putExtra(Intent.EXTRA_EMAIL, arrayOf(email))
                putExtra(Intent.EXTRA_SUBJECT, subject)
            }
            
            if (intent.resolveActivity(context.packageManager) != null) {
                context.startActivity(intent)
            } else {
                Toast.makeText(context, "Nenhum aplicativo de email encontrado", Toast.LENGTH_SHORT).show()
            }
        } catch (e: Exception) {
            Toast.makeText(context, "Erro ao abrir email: ${e.message}", Toast.LENGTH_SHORT).show()
        }
    }
} 