/**
 * A kotlin class for the about activity
 */
package com.example.geoffrey.unleashthebeastfitness

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.about_activity.*

class AboutActivity : AppCompatActivity(), View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.about_activity)
        home_btn.setOnClickListener(this)
        sign_up_btn.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when (v.id) {
            R.id.home_btn -> moveBackToHomeActivity()
            R.id.sign_up_btn -> jumpToSignupActivity()
        }
    }

    private fun moveBackToHomeActivity() {

        val homeActivityIntent = Intent(this, HomeActivity::class.java).apply {


        }

        startActivity(homeActivityIntent)

    } // end of function

    private fun jumpToSignupActivity() {

        val signupActivityIntent = Intent(this, SignUpActivity::class.java).apply {


        }

        startActivity(signupActivityIntent)

    } // end of function

} // end of about class