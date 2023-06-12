package com.example.revision

import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.Typeface

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat

class QuizQuestionsActivity : AppCompatActivity(), OnClickListener{
    private var count:Int=0
    private var currentans:Int=0
    private var musername:String?=null
    private var position:Int=1
    private var ararylistofquestions:ArrayList<Questions>?=null
    private var myposition:Int=0
    private var tvprogressbar:ProgressBar?=null
    private  var tvprogress:TextView?=null
    private var tvquestion:TextView?=null
    private var tvimage:ImageView?=null
    private var tvoption1:TextView?=null
    private var tvoption2:TextView?=null
    private var tvoption3:TextView?=null
    private var tvoption4:TextView?=null
    private var finalans:Button?=null
    private var isclickable:Boolean=false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)
        var submit: Button?=null
        submit = findViewById(R.id.submit)
        submit.backgroundTintList = null
        musername=intent.getStringExtra(Constants.user_name)
        finalans=submit
        tvprogressbar = findViewById(R.id.progress_bar)
        tvprogress = findViewById(R.id.tv_progress)
        tvquestion = findViewById(R.id.question)
        tvimage = findViewById(R.id.imageview)
        tvoption1 = findViewById(R.id.optionone)
        tvoption2 = findViewById(R.id.optiontwo)
        tvoption3 = findViewById(R.id.optionthree)
        tvoption4 = findViewById(R.id.optionfour)
//        for (displayqsn in questionslist)
//        {
//           Log.e("questions", displayqsn.question)
//        }
        ararylistofquestions = Constants.getquestions()
        default()
        setofqsn()
        tvoption1?.setOnClickListener(this)
        tvoption2?.setOnClickListener(this)
        tvoption3?.setOnClickListener(this)
        tvoption4?.setOnClickListener(this)
        finalans?.setOnClickListener (this)
    }

    private fun setofqsn() {
        default()
        val displayedquestion: Questions = ararylistofquestions!![position-1]
        tvprogressbar?.progress = position
        tvprogress?.text = "${position}/${tvprogressbar?.max}"
        tvquestion?.text = displayedquestion.question
        tvoption1?.text = displayedquestion.optionA
        tvoption2?.text = displayedquestion.optionB
        tvoption3?.text = displayedquestion.optionC
        tvoption4?.text = displayedquestion.optionD
        tvimage?.setImageResource(displayedquestion.image)
        if(position==ararylistofquestions!!.size)
        {
            finalans?.text=getString(R.string.finish)
            finalans?.setTextColor(Color.parseColor("#FFFFFFFF"))
        }
        else
        {
            finalans?.setBackgroundColor(Color.parseColor("#bee3db"))
            finalans?.text=getString(R.string.check_answer)
            finalans?.setTextColor(Color.parseColor("#FFFFFFFF"))
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
    private fun default()
    {
        val options= ArrayList<TextView>()
        tvoption1?.let {
            options.add(0,it)
        }
        tvoption2?.let {
            options.add(1, it)
        }
        tvoption3?.let {
            options.add(2, it)
        }
        tvoption4?.let {
            options.add(3, it)
        }
        for(i in options)
        {
            i.setTextColor(Color.parseColor("#507dbc"))
            i.typeface=Typeface.DEFAULT
            i.background=ContextCompat.getDrawable(this,R.drawable.background_option)
        }
    }
    fun selectedoption(tv:TextView,selectedoption:Int)
    {
        default()
        myposition=selectedoption
        tv.setTextColor(Color.parseColor("#2a9d8f"))
        tv.setTypeface(tv.typeface,Typeface.BOLD)
        tv.background=ContextCompat.getDrawable(this,R.drawable.optionselected)
    }
    fun correctans(option:Int, color:Int)
    {
        when (option)
        {
            1 -> tvoption1?.background=ContextCompat.getDrawable(this,color)
            2-> tvoption2?.background=ContextCompat.getDrawable(this,color)
            3 ->tvoption3?.background=ContextCompat.getDrawable(this,color)
            4-> tvoption4?.background=ContextCompat.getDrawable(this,color)
        }
    }
    override fun onClick(view: View?) {
        when(view?.id)
        {
            R.id.optionone->
            {
                count++
                tvoption1?.let {
                    selectedoption(it,1)
                }
            }
            R.id.optiontwo ->
            {
                count++
                tvoption2?.let {
                    selectedoption(it,2)
                }
            }
            R.id.optionthree ->
            {
                count++
                tvoption3?.let {
                    selectedoption(it,3)
                }
            }
            R.id.optionfour ->
            {
                count++
                tvoption4?.let {
                    selectedoption(it,4)
                }
            }
            R.id.submit ->
            {
                if (count!=0)
                {
                    isclickable=true
                }
                else
                {
                    isclickable=false
                }
                if(isclickable )
                {
                if(myposition==0)
                {
                    position++
                    count=0
                    tvoption1?.isClickable = true
                    tvoption2?.isClickable = true
                    tvoption3?.isClickable = true
                    tvoption4?.isClickable = true
//                    when{
//                        position <= ararylistofquestions!!.size->
//                        {
//                            setofqsn()
//                        }
                    if(position<=25)
                    {
                        setofqsn()
                    }
                    else
                    {
                        val some=Intent(this,submit::class.java)
                        some.putExtra(Constants.user_name,musername)
                        some.putExtra(Constants.Correct_answer,currentans)
                        some.putExtra(Constants.total_Question,ararylistofquestions!! .size)
                        startActivity(some)
                        finish()
                    }
                }
                else {

                    val question = ararylistofquestions?.get(position - 1)
                    if (question?.correctoption != myposition) {
                        correctans(myposition, R.drawable.wrongoption)
                    }
                    else
                    {
                        currentans++
                    }
                    correctans(question!!.correctoption, R.drawable.correctoption)
                    myposition=0
                    isclickable=false
                    tvoption1?.isClickable = false
                    tvoption2?.isClickable = false
                    tvoption3?.isClickable = false
                    tvoption4?.isClickable = false
                    finalans?.text=getString(R.string.next_question)
                    finalans?.setBackgroundColor(Color.parseColor("#adb5bd"))
                    finalans?.setTextColor(Color.parseColor("#fff3b0"))
                }
                }
                else
                {
                    Toast.makeText(this,"select atleast one option",Toast.LENGTH_SHORT).show()
                }
            }
        }

    }
}