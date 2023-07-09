package com.krutsav.s23quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView

class QuizQuestionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_question)

        val gotQuestionsList = Constants.getQuestions()

        val currentQuestionIndex = 0
        val currentQuestion = gotQuestionsList[currentQuestionIndex]

        val tvQuestion = findViewById<TextView>(R.id.tv_question)
        val ivFlag = findViewById<ImageView>(R.id.iv_flag)
        val progressBar = findViewById<ProgressBar>(R.id.progress_bar)
        val progressCounter = findViewById<TextView>(R.id.progress_counter)
        val tvOption1 = findViewById<TextView>(R.id.tv_option1)
        val tvOption2 = findViewById<TextView>(R.id.tv_option2)
        val tvOption3 = findViewById<TextView>(R.id.tv_option3)
        val tvOption4 = findViewById<TextView>(R.id.tv_option4)
        tvQuestion.text = currentQuestion.question
        ivFlag.setImageResource(currentQuestion.image)
        progressBar.progress = 4
        val progressCounterString = "${(currentQuestionIndex + 1)}/${gotQuestionsList.size}"
        progressCounter.text = progressCounterString
        tvOption1.text = currentQuestion.optionOne
        tvOption2.text = currentQuestion.optionTwo
        tvOption3.text = currentQuestion.optionThree
        tvOption4.text = currentQuestion.optionFour

    }
}