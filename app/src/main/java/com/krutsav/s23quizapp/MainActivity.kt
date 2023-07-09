package com.krutsav.s23quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO: below method is depreciated, learn the alternative way to make activity full screen
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val btnStart = findViewById<Button>(R.id.btn_Start)

        btnStart.setOnClickListener {
            val etName = findViewById<EditText>(R.id.et_name)
            if (etName.text.isEmpty()){
                Toast.makeText(this, "Please enter a name", Toast.LENGTH_LONG).show()
            }
            else{
                val intent = Intent(this, QuizQuestionActivity::class.java)
                startActivity(intent)
//                finish() //will finish the current activity, upon pressing back from next activity, app will close
            }
        }

    }
}