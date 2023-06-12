package com.example.revision

import android.content.Context
import android.media.MediaPlayer

object background_music {
    private var mediaplayer:MediaPlayer?=null
    fun start(contex:Context , resourseid:Int)
    {
        if(mediaplayer==null)
        {
            mediaplayer=MediaPlayer.create(contex.applicationContext,resourseid)
            mediaplayer?.isLooping=true
            mediaplayer?.start()
        }
    }
    fun pause()
    {
        mediaplayer?.pause()
    }
    fun resume()
    {
        mediaplayer?.start()
    }
    fun stop()
    {
        mediaplayer?.stop()
        mediaplayer?.release()
        mediaplayer=null
    }
}