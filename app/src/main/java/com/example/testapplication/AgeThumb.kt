package com.example.testapplication

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class AgeThumb : ConstraintLayout {
    lateinit var mainView: View
    lateinit var textView: TextView

    private val passedContext: Context

    constructor(context: Context) : super(context) {
        this.passedContext = context
        setupMainView()
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        this.passedContext = context
        setupMainView()
    }

    private fun setupMainView() {
        val rootView = View.inflate(context, R.layout.age_thumb, null)
        this.mainView = rootView
        addView(rootView)
        instantiateUIComponents()
        setupUI()
    }

    private fun instantiateUIComponents() {
        textView = mainView.findViewById(R.id.textView)
    }

    private fun setupUI() {
        // TODO:
        setBackgroundColor(Color.RED)
    }
}
