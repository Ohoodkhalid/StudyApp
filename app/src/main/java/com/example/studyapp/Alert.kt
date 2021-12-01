package com.example.studyapp

import android.content.Context
import androidx.appcompat.app.AlertDialog

class Alert {
    fun customAlert(title: String, message: String,context :Context) {

        val builder = AlertDialog.Builder(context)
        //  set title for alert dialog
        builder.setTitle(title)
        //  set message for alert dialog
        message.toString()
        builder.setMessage(message)
        // builder.setItems(message.toArray()(new String [0])),new dialogInterface.OnClickListenr()
        builder.setIcon(android.R.drawable.ic_dialog_info)

        //performing positive action
        builder.setPositiveButton("Ok") { dialogInterface, which ->
        }
        // Create the AlertDialog
        val alertDialog: AlertDialog = builder.create()
        // Set other dialog properties
        alertDialog.setCancelable(false)
        alertDialog.show()
    }

}