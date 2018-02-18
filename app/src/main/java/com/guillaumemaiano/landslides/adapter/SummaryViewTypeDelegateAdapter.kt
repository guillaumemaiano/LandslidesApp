package com.guillaumemaiano.landslides.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

/**
 * Created by Guillaume Maiano on 18/02/2018.
 * An interface for the summary delegate adapters to follow
 */
interface SummaryViewTypeDelegateAdapter {

    fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder

    fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType)
}