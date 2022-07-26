package com.marufalam.todolist.fragments.add

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.marufalam.todolist.R
import com.marufalam.todolist.databinding.FragmentAddBinding


class addFragment : Fragment() {

    private lateinit var binding: FragmentAddBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAddBinding.inflate(inflater, container, false)
        //set Menu
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.add_fragment_menu,menu)
    }


}