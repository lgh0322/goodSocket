package com.vaca.goodsocket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.socket.client.IO

class MainActivity : AppCompatActivity() {

    val mSocket= IO.socket("http://192.168.5.100:3000")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mSocket.connect()
    }
}