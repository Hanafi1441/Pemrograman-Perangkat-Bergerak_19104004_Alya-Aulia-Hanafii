package com.hanafi_19104004.helloittelkompurwokerto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnPage = findViewById<Button>(R.id.btn_page)
        btnPage.setOnClickListener {
            val intent = Intent(this, Halaman2Activity::class.java)
            startActivity(intent)
        }
    }


    fun printState(msg : String){
        Log.d("ActivityState", msg)
        Toast.makeText(applicationContext, msg, Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        printState("Halaman Satu OnResume")
    }

    override fun onPause() {
        super.onPause()
        printState("Halaman Satu OnPause")
    }

    override fun onStop() {
        super.onStop()
        printState("Halaman Satu OnStop")
    }

    override fun onRestart() {
        super.onRestart()
        printState("Halaman Satu OnRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        printState("Halaman Satu OnDestroy")
    }
}