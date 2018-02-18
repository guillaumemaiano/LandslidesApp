package com.guillaumemaiano.landslides.adapter.delegateAdapters

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.guillaumemaiano.landslides.Extensions.inflate
import com.guillaumemaiano.landslides.adapter.SummaryViewTypeDelegateAdapter
import com.guillaumemaiano.landslides.adapter.ViewType
import com.guillaumemaiano.landslides.R
import com.guillaumemaiano.landslides.R.id.description
import com.guillaumemaiano.landslides.models.LandslideSummaryItem
import kotlinx.android.synthetic.main.landslide_list_item.view.*


/**
 * Created by Guillaume Maiano on 18/02/2018.
 * Based on http://hannesdorfmann.com/android/adapter-delegates
 * Adapter for earthquakes (summary view) delegate
 */

class EarthquakeDelegateAdapter : SummaryViewTypeDelegateAdapter {

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
        holder as ViewHolderConnector
        holder.bind(item as LandslideSummaryItem)
    }

    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        return ViewHolderConnector(parent)
    }

    class ViewHolderConnector(parent: ViewGroup): RecyclerView.ViewHolder(parent.inflate(R.layout.landslide_list_item)) {
        fun bind(item: LandslideSummaryItem) = with(itemView) {
            country.text = item.country
            date.text = item.date
            trigger.text = item.trigger
        }
    }
}