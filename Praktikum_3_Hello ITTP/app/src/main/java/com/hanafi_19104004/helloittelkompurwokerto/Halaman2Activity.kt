package com.hanafi_19104004.helloittelkompurwokerto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class Halaman2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman2)
    }


    fun printState(msg : String){
        Log.d("ActivityState", msg) //muncul di Logcat Android Studio
        Toast.makeText(applicationContext, msg, Toast.LENGTH_SHORT).show() //Muncul di UI APP
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