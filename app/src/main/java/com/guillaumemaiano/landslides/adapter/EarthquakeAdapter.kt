package com.guillaumemaiano.landslides.adapter

import android.support.v4.util.SparseArrayCompat
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.guillaumemaiano.landslides.adapter.delegateAdapters.EarthquakeDelegateAdapter

/**
 * Created by Guillaume Maiano on 18/02/2018.
 */
class EarthquakeAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var items: ArrayList<ViewType>
    private var delegateAdapters = SparseArrayCompat<SummaryViewTypeDelegateAdapter>()

            init {
                delegateAdapters.put(SummaryViewType.EARTHQUAKE, EarthquakeDelegateAdapter())
                items = ArrayList()
            }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return delegateAdapters.get(viewType).onCreateViewHolder(parent)
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        delegateAdapters.get(getItemViewType(position)).onBindViewHolder(holder, this.items[position])
    }

    override fun getItemViewType(position: Int): Int {
        return this.items.get(position).getViewType()
    }
}
