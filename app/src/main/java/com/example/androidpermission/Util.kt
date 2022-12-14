package com.example.androidpermission

import android.view.View
import com.google.android.material.snackbar.Snackbar


fun View.showSnackBar(
    view: View,
    msg: String,
    length: Int,
    actionMessage: CharSequence?,
    action: (View) -> Unit
) {
    val snackBar = Snackbar.make(view, msg, length)
    if (actionMessage != null) {
        snackBar.setAction(actionMessage) {
            action(this)
        }.show()
    } else {
        snackBar.show()
    }
}