package com.example.studyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Android_Review : AppCompatActivity() {
    var titls= ArrayList<String>()
    var descriptions= ArrayList<String>()
    var message = ArrayList<String>()
     lateinit var  recView : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_review)
        titls.add("Project setup")
        titls.add("Console")
        titls.add("Print")
        titls.add("Debug")
        titls.add("Git hub")

        descriptions.add("setting up an android studio project")
        descriptions.add("you can print any thing ane see in console")
        descriptions.add("there is differences between print &println")
        descriptions.add("you can use debug to code tracking")
        descriptions.add("You can share your project on git hub ")


        message.add("1- Create a project 2- Choose your project 3- Configure your project ")
        message.add("The log class is a pre-defined class in android studio which allows the developer to print messages in Logcat Window, which is the console for Android Studio. Every message is written using a log, Contains a special type or format that represents for what purpose the message is being written.")
        message.add("You can print using print &println")
        message.add("Android Studio provides a debugger that allows you to do the following and more:\n" +
                "\n" +
                "Select a device to debug your app on.\n" +
                "Set breakpoints in your Java, Kotlin, and C/C++ code.\n" +
                "Examine variables and evaluate expressions at runtime.")
        message.add("Download and install GitHub Desktop\nConnect Android Studio to your GitHub account\nShare your project")


        recView = findViewById(R.id.recView)
        recView.adapter=RecyclerViewAdapter( titls ,descriptions,message,this)
        recView.layoutManager = LinearLayoutManager(this)

    }


}


