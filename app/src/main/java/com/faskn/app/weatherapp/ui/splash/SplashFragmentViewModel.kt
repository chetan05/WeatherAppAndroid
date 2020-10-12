package com.faskn.app.weatherapp.ui.splash

import android.content.SharedPreferences
import com.faskn.app.weatherapp.core.BaseViewModel
import javax.inject.Inject




class SplashFragmentViewModel @Inject constructor(var sharedPreferences: SharedPreferences) : BaseViewModel() {
    var navigateDashboard = false
}
