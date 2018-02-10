/**
 * Created by Guillaume Maiano on 09/02/2018.
 * Defines a fragment to represent a simplified view of the total data
 */

package com.guillaumemaiano.landslides

import android.app.Fragment
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class EarthquakesFragment: Fragment() {

    private var quakesList: RecyclerView? = null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view = inflater?.inflate(R.layout.landslides_fragment, container,false) ?: super.onCreateView(inflater, container, savedInstanceState)
        quakesList = view?.findViewById(R.id.landslides_list)
        quakesList?.setHasFixedSize(true) // use this setting to improve performance
        quakesList?.layoutManager = LinearLayoutManager(context) // forces API level 23
        return view
    }

}