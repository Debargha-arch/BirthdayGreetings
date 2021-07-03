package com.example.birthgreet

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_greetings_page.*

class GreetingsPage : AppCompatActivity() {

    companion object {
        const val NAME_EXTRA = "name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greetings_page)

        val name = intent.getStringExtra(NAME_EXTRA)
        birthdayGreetings.text = "Happy Birthday\n $name !"
    }
}