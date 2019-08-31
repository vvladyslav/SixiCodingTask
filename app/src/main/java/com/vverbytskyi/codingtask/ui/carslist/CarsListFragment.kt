package com.vverbytskyi.codingtask.ui.carslist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.vverbytskyi.codingtask.R
import dagger.android.support.DaggerFragment

class CarsListFragment : DaggerFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_cars_list, container, false)
    }
}