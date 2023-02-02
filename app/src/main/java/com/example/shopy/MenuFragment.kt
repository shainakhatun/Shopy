package com.example.shopy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView


class MenuFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_menu, container, false)

        val menuItems = arrayListOf("Home", "Profile", "Orders", "Logout")

        val listView = view.findViewById<ListView>(R.id.listView)
        val adapter = ArrayAdapter(requireActivity(), android.R.layout.simple_list_item_1, menuItems)
        listView.adapter = adapter

        listView.setOnItemClickListener { _, _, position, _ ->
            when (position) {
                0 -> {
                    // handle Home item click
                }
                1 -> {
                    // handle Profile item click
                }
                2 -> {
                    // handle Orders item click
                }
                3 -> {
                    // handle Logout item click
                }
            }
        }

        return view
    }
}
