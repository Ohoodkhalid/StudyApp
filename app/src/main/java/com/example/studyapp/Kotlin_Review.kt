package com.example.studyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Kotlin_Review : AppCompatActivity() {
    var titls= ArrayList<String>()
    var descriptions= ArrayList<String>()
    var message = ArrayList<String>()
    lateinit var  recView : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_review)
        titls.add("var and val ")
        titls.add("user input")
        titls.add("Strings")
        titls.add("Data Type" )
        titls.add("Basic operation ")

        descriptions.add("Declaring variable ")
        descriptions.add("Getting user input ")
        descriptions.add("string concatenation interpolation and method  ")
        descriptions.add("Understanding data type ")
        descriptions.add("performing  math operation in kotlin ")

        message.add("Kotlin uses two different keywords to declare variables: val and var.\n" +
                "\n" +
                "Use val for a variable whose value never changes.\n" +
                " You can't reassign a value to a variable that was declared using val.\n" +
                "Use var for a variable whose value can change.")
        message.add("Reading user input in Kotlin is easy. Kotlin provides one inbuilt function to make this task easy for us. readLine () function allow us to read the input that is entered by the user.")
        message.add("Strings are used for storing text.\n" +
                "\n" +
                "A string contains a collection of characters surrounded by double quotes:")
        message.add("Kotlin is a statically typed language, which means that the data type of every expression should be known at compile time.\n" +
                "\n" +
                "Kotlin built in data type can be categorized as follows:\n" +
                "\n" +
                "Number\n" +
                "\n" +
                "Character\n" +
                "\n" +
                "String\n" +
                "\n" +
                "Boolean\n" +
                "\n" +
                "Array")
        message.add("Some of the many basic operators in Kotlin Mathematical operations" +
                "\n like addition, substraction, multiplication, and division comes built-in with Kotlin.")

        recView = findViewById(R.id.recView2)
        recView.adapter=RecyclerViewAdapter( titls ,descriptions,message,this)
        recView.layoutManager = LinearLayoutManager(this)

    }

}