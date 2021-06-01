package com.eelection.Home.Fragments

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.CardView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridLayout
import com.eelection.R
import com.google.firebase.database.*
import kotlinx.android.synthetic.*

class CandidatesFragment : Fragment() {


    lateinit var grid:GridLayout

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val view = inflater!!.inflate(R.layout.frag_candidates, container, false)

        grid = view.findViewById(R.id.grid)
        setActionBar(grid)
        return view

    }

    private fun setActionBar(gridLayout: GridLayout) {
        for (i in 0 until gridLayout.childCount) {
            val cardView: CardView = gridLayout.getChildAt(i) as CardView
            cardView.setOnClickListener(View.OnClickListener {
                when (i) {
                    0 -> {
                        val intent = Intent(activity, modiActivity::class.java)
                        startActivity(intent)
                    }
                    1 -> {
                        val intent = Intent(activity, rahulActivity::class.java)
                        startActivity(intent)
                    }
                    2 -> {
                        val intent = Intent(activity, mayawatiActivity::class.java)
                        startActivity(intent)
                    }
                    3 -> {
                        val intent = Intent(activity, rajaActivity::class.java)
                        startActivity(intent)
                    }
                }
            })
        }
    }



}