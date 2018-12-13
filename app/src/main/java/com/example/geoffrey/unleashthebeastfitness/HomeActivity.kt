/**
 * A kotlin class for the home activity
 */
package com.example.geoffrey.unleashthebeastfitness

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_home.*


class HomeActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        about_button.setOnClickListener(this)
        sign_up_button.setOnClickListener(this)
        
    } // end of oncreate

    override fun onClick(v: View) {
        when (v.id) {
            R.id.about_button -> jumpToAboutActivity()
            R.id.sign_up_button -> jumpToSignupActivity()
        }
    } // end of onclick fun

    private fun jumpToAboutActivity() {

        val aboutActivityIntent = Intent(this, AboutActivity::class.java).apply {

        } // end of intent

        startActivity(aboutActivityIntent)

    } // end of jumpToAboutActivity function

    private fun jumpToSignupActivity() {

        val signupActivityIntent = Intent(this, SignUpActivity::class.java).apply {

        } // end of intent

        startActivity(signupActivityIntent)

    } // end of jumpToAboutActivity function

} // end of class
