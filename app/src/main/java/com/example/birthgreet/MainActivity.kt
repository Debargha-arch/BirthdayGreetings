package com.example.birthgreet

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun createBirthdayCard(view: View) {
        val name = editTextTextPersonName.editableText.toString()
        Toast.makeText(this,"Entered name is $name",Toast.LENGTH_LONG).show()

        val intent =Intent(this,GreetingsPage::class.java)
        intent.putExtra(GreetingsPage.NAME_EXTRA, name)
        startActivity(intent)
    }
}