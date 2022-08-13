package com.lokilinks.retrofit.sreans.second

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.lokilinks.retrofit.R
import com.lokilinks.retrofit.sreans.start.StartAdapter
import com.lokilinks.retrofit.sreans.start.StartViewModel
import kotlinx.android.synthetic.main.fragment_second.view.*
import kotlinx.android.synthetic.main.fragment_start.view.*


class SecondFragment : Fragment() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: SecondAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        val viewModel = ViewModelProvider(this).get(SecondViewModel::class.java)

        val view = inflater.inflate(R.layout.fragment_second, container, false)
        recyclerView = view.rv_second
        adapter = SecondAdapter()
        recyclerView.adapter = adapter
        viewModel.getBeznalMoney()
        viewModel.myMoneyList.observe(viewLifecycleOwner,{ list ->
            list.body()?.let { adapter.setList(it) }
        } )

        return view
    }

}