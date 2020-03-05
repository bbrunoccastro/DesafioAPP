package com.example.salesfind

import android.app.ListActivity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.widget.ImageButton
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import java.net.URL

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        ebay.setOnClickListener {
            var intent = Intent(this,ViewWeb::class.java)
            intent.putExtra("url", "https://www.ebay.com/")
            startActivity(intent)


        }


        americanas.setOnClickListener {
            var intent = Intent(this, ViewWeb::class.java)
            intent.putExtra("url", "https://www.americanas.com.br/")
            startActivity(intent)
        }

        buscape.setOnClickListener {
            var intent = Intent(this, ViewWeb::class.java)
            intent.putExtra("url", "https://www.buscape.com.br/")
            startActivity(intent)
        }

        mercadolivre.setOnClickListener {
            var intent = Intent(this, ViewWeb::class.java)
            intent.putExtra("url", "https://www.mercadolivre.com.br/")
            startActivity(intent)
        }

        magazineluiza.setOnClickListener {
            var intent = Intent(this, ViewWeb::class.java)
            intent.putExtra("url", "https://www.magazineluiza.com.br/")
            startActivity(intent)
        }

        netshoes.setOnClickListener {
            var intent = Intent(this, WebView::class.java)
            intent.putExtra("url", "https://www.netshoes.com.br/")
            startActivity(intent)
        }

        submarino.setOnClickListener {
            var intent = Intent(this, WebView::class.java)
            intent.putExtra("url", "https://www.submarino.com.br/")
            startActivity(intent)

        }

        webmotors.setOnClickListener {
            var intent = Intent(this, WebView::class.java)
            intent.putExtra("url", "https://www.webmotors.com.br/")
            startActivity(intent)

        }

        estatistica.setOnClickListener {
            var intent = Intent(this, dadosActivity::class.java)
            startActivity(intent)
        }

    }
}
