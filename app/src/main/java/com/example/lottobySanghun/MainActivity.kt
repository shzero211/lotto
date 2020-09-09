package com.example.lottobySanghun

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        randomCard.setOnClickListener{
            val intent=Intent(this@MainActivity,ResultActivity::class.java)

            intent.putIntegerArrayListExtra("result", ArrayList(getRandomLottoNumbers()))

            startActivity(intent)


        }
        constellationCard.setOnClickListener{
            startActivity(Intent(this@MainActivity,ConstellationActivity::class.java))

        }
        nameCard.setOnClickListener {
            startActivity(Intent(this,NameActivity::class.java))
        }
    }
    fun getRandomLottoNumber():Int{
        return Random().nextInt(45)+1
    }
    fun getRandomLottoNumbers():MutableList<Int>{
        val lottoNumbers= mutableListOf<Int>()

        for(i in 1..6){
            lottoNumbers.add(getRandomLottoNumber())
        }
        return lottoNumbers

    }
}