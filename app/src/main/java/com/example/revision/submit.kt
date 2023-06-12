package com.example.revision

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class submit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_submit)
        var name:TextView=findViewById(R.id.username)
        var score:TextView=findViewById(R.id.score)
        var finish: Button=findViewById(R.id.over)
        finish.backgroundTintList=null
        name.text=intent.getStringExtra(Constants.user_name)
        val totalquestion=intent.getIntExtra(Constants.total_Question,0)
        val correctans=intent.getIntExtra(Constants.Correct_answer,0)
        score.text="you answered $correctans out of 25"
        finish.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    override fun onPause() {
        super.onPause()
        background_music.pause()
    }

    override fun onResume() {
        super.onResume()
        background_music.resume()
    }
}