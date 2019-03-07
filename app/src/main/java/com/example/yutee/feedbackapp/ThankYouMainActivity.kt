package com.example.yutee.feedbackapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class ThankYouMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.thankyou_main)
        supportActionBar!!.hide()
    }
}
