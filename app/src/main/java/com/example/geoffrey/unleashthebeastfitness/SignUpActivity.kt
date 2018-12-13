/**
 * A kotlin class for the sign up activity
 */
package com.example.geoffrey.unleashthebeastfitness

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.about_activity.*
import kotlinx.android.synthetic.main.sign_up_activity.*

class SignUpActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_up_activity)
        home_buton.setOnClickListener(this)
        about_buton.setOnClickListener(this)

    } // end of oncreate function

    override fun onClick(v: View) {
        when (v.id) {
            R.id.home_buton -> jumpBackToHomeActivity()
            R.id.about_buton -> jumpBackToAboutActivity()
        }
    } // end of onclick fun

    private fun jumpBackToHomeActivity() {

        val homeActivityIntent = Intent(this, HomeActivity::class.java).apply {

        } // end of intent

        startActivity(homeActivityIntent)

    } // end of jumpToAboutActivity function

    private fun jumpBackToAboutActivity() {

        val aboutActivityIntent = Intent(this, AboutActivity::class.java).apply {

        } // end of intent

        startActivity(aboutActivityIntent)

    } // end of jumpToAboutActivity function


} // end of sign up class