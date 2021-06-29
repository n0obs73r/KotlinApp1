package com.example.myapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val submitButton = findViewById<Button>(R.id.submit)

        submitButton.setOnClickListener {
            submitButton()
        }
        startActivity(intent)

    }
    fun submitButton()
    {
        val editname: EditText = findViewById(R.id.name)
        val name = editname.text.toString()
        val editnumber: EditText = findViewById(R.id.number)
        val number = editnumber.text.toString()
//        val editsubject: EditText = findViewById(R.id.subject)
//        val subject = editsubject.text.toString()
        val editbody: EditText = findViewById(R.id.body)
        val body = editbody.text.toString()
        val editsubject: EditText = findViewById(R.id.subject)
        val subject = editsubject.text.toString()
        var message: String
        message = "\nHello! My name is "+ name
        message += "\nMy contact number is "+number
        message += "\nI wanted to tell you that: " + body
        message += "\nHope, You have a great day!! "

        val intent = Intent(Intent.ACTION_SENDTO)
        intent.data = Uri.parse("mailto:")
        intent.putExtra(Intent.EXTRA_EMAIL, "aryan.prince999@gmail.com")
        intent.putExtra(Intent.EXTRA_SUBJECT, subject)
        intent.putExtra(Intent.EXTRA_TEXT, message)
        startActivity(intent)
    }


}