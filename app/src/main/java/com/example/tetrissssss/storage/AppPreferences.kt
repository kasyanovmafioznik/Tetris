package com.example.tetrissssss.storage

import android.content.Context
import android.content.SharedPreferences

class AppPreferences(ctx: Context) {
    var data: SharedPreferences = ctx.getSharedPreferences("APP_PREFERENSCES", Context.MODE_PRIVATE)
    fun saveHighScore(highScore: Int){
        data.edit().putInt("HIGH_SCORE",highScore).apply()
    }

    fun getHighScore():Int{
        return data.getInt("HIGJ_SCORE",0)
    }

    fun clearHoghScore(){
        data.edit().putInt("HIGH_SCORE",0).apply()
    }
}