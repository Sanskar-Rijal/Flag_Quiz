package com.example.revision

data class Questions(
    val id:Int,
    val question:String,
    val image:Int,
    val optionA:String,
    val optionB:String,
    val optionC:String,
    val optionD:String,
    val correctoption:Int
)
