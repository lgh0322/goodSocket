package com.vaca.goodsocket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import io.socket.client.IO
import io.socket.emitter.Emitter

class MainActivity : AppCompatActivity() {

    val mSocket= IO.socket("http://192.168.5.100:3000")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mSocket.connect()
        mSocket.on("loginSuccess"
        ) { ga->
            Log.e("fuck",ga[0] as String)
        }
    }
}