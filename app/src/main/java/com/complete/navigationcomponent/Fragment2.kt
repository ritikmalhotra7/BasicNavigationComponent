package com.complete.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.complete.navigationcomponent.databinding.Fragment1Binding
import com.complete.navigationcomponent.databinding.Fragment2Binding

class Fragment2 : Fragment() {
    val args :Fragment2Args by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val b = Fragment2Binding.inflate(layoutInflater)

        b.second.setOnClickListener {
             val navController = Navigation.findNavController(b.root)
            navController.navigate(R.id.action_fragment2_to_fragment1)

        }
        b.output.setText(args.input)

        return b.root
    }
}