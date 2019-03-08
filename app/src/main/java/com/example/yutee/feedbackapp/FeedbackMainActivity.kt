package com.example.yutee.feedbackapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Toast
import kotlinx.android.synthetic.main.feedback_main.*

class FeedbackMainActivity : AppCompatActivity() {
    /*
   *   Created by Utibe Etim
   *   7/March/2019
    */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.feedback_main)

        btn_submit.setOnClickListener {
        Toast.makeText(applicationContext, "Thanks for the feedback", Toast.LENGTH_SHORT).show()
          val intent = Intent(this, ThankYouMainActivity::class.java)
            startActivity(intent);
        }
    }

}
