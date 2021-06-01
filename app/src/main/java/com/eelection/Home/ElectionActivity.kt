package com.eelection.Home

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import com.eelection.R
import com.eelection.Test
import com.eelection.Test.Companion.flag
import com.eelection.Test.Companion.init


class ElectionActivity : AppCompatActivity(){

    lateinit var back: LinearLayout

    lateinit var vote1: Button
    lateinit var vote2: Button
    lateinit var vote3: Button
    lateinit var vote4: Button
    lateinit var voted: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elect)

        vote1 = findViewById(R.id.vote_1)
        vote2 = findViewById(R.id.vote_2)
        vote3 = findViewById(R.id.vote_3)
        vote4 = findViewById(R.id.vote_4)
        voted = findViewById(R.id.voted)

        when (init) {
            1 -> {
                vote1.text = "voted"
                vote1.background=(getDrawable(R.drawable.voted_background))
                voted.text = "You have voted for BJP"
            }
            2 -> {
                vote2.text = "voted"
                vote2.background=(getDrawable(R.drawable.voted_background))
                voted.text = "You have voted for INC"
            }
            3 -> {
                vote3.text = "voted"
                vote3.background=(getDrawable(R.drawable.voted_background))
                voted.text = "You have voted for BSP"
            }
            4 -> {
                vote4.text = "voted"
                vote4.background=(getDrawable(R.drawable.voted_background))
                voted.text = "You have voted for CPI"
            }
        }

        vote1.setOnClickListener(View.OnClickListener {
            if(!flag){
                vote1.text = "voted"
                vote1.background=(getDrawable(R.drawable.voted_background))
                voted.text = "You have voted for BJP"
                init=1
                flag=true
            }else{
                Toast.makeText(applicationContext, "You have already voted", Toast.LENGTH_SHORT).show()
            }

        })
        vote2.setOnClickListener(View.OnClickListener {
            if(!flag){
                vote2.text = "voted"
                vote2.background=(getDrawable(R.drawable.voted_background))
                voted.text = "You have voted for INC"
                init=2
                flag=true
            }else{
                Toast.makeText(applicationContext, "You have already voted", Toast.LENGTH_SHORT).show()
            }

        })
        vote3.setOnClickListener(View.OnClickListener {
            if(!flag){
                vote3.text = "voted"
                vote3.background=(getDrawable(R.drawable.voted_background))
                voted.text = "You have voted for BSP"
                init=3
                flag=true
            }else{
                Toast.makeText(applicationContext, "You have already voted", Toast.LENGTH_SHORT).show()
            }

        })
        vote4.setOnClickListener(View.OnClickListener {
            if(!flag){
                vote4.text = "voted"
                vote4.background=(getDrawable(R.drawable.voted_background))
                voted.text = "You have voted for CPI"
                init=4
                flag=true
            }else{
                Toast.makeText(applicationContext, "You have already voted", Toast.LENGTH_SHORT).show()
            }

        })


    }

    override fun onBackPressed() {
        super.onBackPressed()
    }


}

