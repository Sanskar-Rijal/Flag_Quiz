package com.example.revision

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    //public lateinit var mysong:MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
      //  mysong=MediaPlayer.create(this,R.raw.bell)
     //mysong.isLooping=true
       // mysong.start()
        background_music.start(this,R.raw.bell)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn_start:Button=findViewById(R.id.buttonstart)
        val entername:EditText=findViewById(R.id.text_entered)
        btn_start.setOnClickListener {
            if((entername.text.isNotEmpty()))
            {
                val intenton= Intent(this,QuizQuestionsActivity::class.java)
                intenton.putExtra(Constants.user_name,entername.text.toString())
                startActivity(intenton)
                finish()
            }
            else
                Toast.makeText(this,"Enter your name and click the Button",Toast.LENGTH_SHORT).show()
        }
    }

//    override fun onPause() {
//        super.onPause()
//        if(mysong.isPlaying)
//        {
//            mysong.pause()
//        }
//    }
//
//    override fun onResume() {
//        super.onResume()
//        if(!mysong.isPlaying)
//        {
//            mysong.start()
//        }
//    }
    override fun onPause() {
        super.onPause()
    background_music.pause()
    }

    override fun onResume() {
        super.onResume()
        background_music.resume()
    }
}
