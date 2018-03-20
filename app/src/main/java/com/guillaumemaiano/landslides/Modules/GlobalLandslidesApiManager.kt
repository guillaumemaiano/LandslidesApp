package com.guillaumemaiano.landslides.Modules
import android.content.pm.PackageManager
import android.support.v4.app.ShareCompat
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.guillaumemaiano.landslides.R


/**
 * Created by Guillaume Maiano on 05/02/2018.
 * the Api Manager class manages API details
 */

public class GlobalLandslidesApiManager constructor(instancingActivity: AppCompatActivity) {

    val _activity = instancingActivity

    fun test() {
        val MapsKeys = _activity.resources.getString(R.string.GoogleMapsApiKey)
        Log.i("Maps:", MapsKeys)

        val NasaApiKey: String =  _activity.resources.getString(R.string.NasaApiKey)
        Log.i("Key", NasaApiKey)

    }
}