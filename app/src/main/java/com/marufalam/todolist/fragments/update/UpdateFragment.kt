package com.marufalam.todolist.fragments.update

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.marufalam.todolist.R
import com.marufalam.todolist.databinding.FragmentUpdateBinding


class updateFragment : Fragment() {
    private lateinit var binding: FragmentUpdateBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentUpdateBinding.inflate(inflater, container, false)
        //set Menu
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.update_fragment_menu,menu)
    }


}