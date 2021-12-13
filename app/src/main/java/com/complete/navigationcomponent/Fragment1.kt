package com.complete.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.complete.navigationcomponent.databinding.Fragment1Binding
import com.complete.navigationcomponent.databinding.Fragment2Binding

class fragment1 : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val b = Fragment1Binding.inflate(layoutInflater)

        b.first.setOnClickListener {
            val navController = Navigation.findNavController(b.root)
            //if you simply want to get there without passing a value
            //navController.navigate(R.id.action_fragment1_to_fragment2)
            val input = b.input.text
            val action = fragment1Directions.actionFragment1ToFragment2(input.toString())
            navController.navigate(action)
        }
        return b.root
    }

}