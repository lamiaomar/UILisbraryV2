package com.example.uiviewlibrary

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

class CustomView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : AppCompatTextView(context, attrs, defStyleAttr) {

    init {
        // Custom initialization code
        text = "Hello from CustomView"
    }
}