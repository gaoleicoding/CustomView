package com.java.mylibrary

import android.app.Activity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.FragmentActivity


class ChatTransActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat_trans)

    }

    fun finishActivity(view: View) {
        super.finish()
        overridePendingTransition(0, 0);
    }
}
