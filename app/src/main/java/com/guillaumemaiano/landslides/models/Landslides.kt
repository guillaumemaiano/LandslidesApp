package com.guillaumemaiano.landslides.models

import com.guillaumemaiano.landslides.adapter.SummaryViewType
import com.guillaumemaiano.landslides.adapter.ViewType

/**
 * Created by Guillaume Maiano on 18/02/2018.
 * Landslide related models
 */

data class LandslideSummaryItem(val date: String, val trigger: String, val country: String) : ViewType {

    override fun getViewType() = SummaryViewType.EARTHQUAKE
}