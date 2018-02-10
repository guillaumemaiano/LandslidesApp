// name of the utility class in java
@file:JvmName("UtilityExtensions")

package com.guillaumemaiano.landslides.Extensions

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by Guillaume Maiano on 10/02/2018.
 * Some quick utilitity extensions that probably will be rendered *pôôôôintless* someday.... but aren't today
 */

fun ViewGroup.inflate(layoutId: Int, attachToRoot: Boolean = false): View {
    return LayoutInflater.from(context).inflate(layoutId, this, attachToRoot)
}

fun <T> androidLazy(initializer: () -> T) : Lazy<T> = lazy(LazyThreadSafetyMode.NONE, initializer)