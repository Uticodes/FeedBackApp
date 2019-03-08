package com.example.yutee.feedbackapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class ThankYouMainActivity : AppCompatActivity() {
    /*
   *   Created by Utibe Etim
   *   7/March/2019
    */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.thankyou_main)
        supportActionBar!!.hide()
    }
}
