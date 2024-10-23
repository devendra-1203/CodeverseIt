package com.codeverseapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class SignUpActivity : AppCompatActivity() {
    // private  s List<signupReques>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        CoroutineScope(Dispatchers.IO).launch {
        //    val response = RetrofitInsatance.api.signup(signupRequest)
//            if (response.isSuccessful) {
//                // Handle successful signup
//            } else {
//                // Handle error
//            }
        }
    }
}