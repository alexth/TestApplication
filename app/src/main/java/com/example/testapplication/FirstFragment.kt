package com.example.testapplication

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.FrameLayout
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.fragment.findNavController
import com.example.widget.RangeSeekBar

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    lateinit var rangeSeekBar: RangeSeekBar
    lateinit var leftAgeThumb: AgeThumb
    lateinit var rightAgeThumb: AgeThumb

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_first, container, false)
        rangeSeekBar = rootView.findViewById(R.id.rangeSeekBar)

        leftAgeThumb = AgeThumb(requireContext())
        rightAgeThumb = AgeThumb(requireContext())

//        rangeSeekBar.leftSeekBar.setBackgroundColor(Color.RED)
        rangeSeekBar.leftSeekBar.addView(leftAgeThumb, ConstraintLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT))
        rangeSeekBar.rightSeekBar.addView(rightAgeThumb)
        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button_first).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
    }
}