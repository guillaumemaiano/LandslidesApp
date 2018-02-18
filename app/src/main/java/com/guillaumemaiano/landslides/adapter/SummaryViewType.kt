package com.guillaumemaiano.landslides.adapter

/**
 * Created by Guillaume Maiano on 18/02/2018.
 */

interface ViewType {
    fun getViewType(): Int
}

object SummaryViewType {
    val EARTHQUAKE = 0
}