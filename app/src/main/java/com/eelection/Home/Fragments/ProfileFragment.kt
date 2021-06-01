package com.eelection.Home.Fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import com.eelection.Home.ContactUsActivity
import com.eelection.Home.Location.GetUsersLocationActivity
import com.eelection.MyAccount.MyActivityActivity
import com.eelection.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.database.*

class ProfileFragment : Fragment() {

    lateinit var activity : LinearLayout
    lateinit var savedadd : LinearLayout
    lateinit var contact : LinearLayout
    lateinit var aadhaar : TextView
    lateinit var name : TextView
    lateinit var dob : TextView
    lateinit var address : TextView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view= inflater!!.inflate(R.layout.frag_profile, container, false)

        activity = view.findViewById(R.id.activity)
        contact = view.findViewById(R.id.contact)
        savedadd = view.findViewById(R.id.savedadd)
        aadhaar=view.findViewById(R.id.aadhaarnumber)
        name=view.findViewById(R.id.name)
        dob=view.findViewById(R.id.dob)
        address=view.findViewById(R.id.address)


        activity.setOnClickListener(View.OnClickListener {
            val intent = Intent(context, MyActivityActivity::class.java)
            startActivity(intent)
        })

        contact.setOnClickListener(View.OnClickListener {
            val intent = Intent(context, ContactUsActivity::class.java)
            startActivity(intent)
        })

        savedadd.setOnClickListener(View.OnClickListener {
            val intent = Intent(context, GetUsersLocationActivity::class.java)
            startActivity(intent)
        })


        return view
    }





}