package com.faskn.app.weatherapp.ui.search.result

import androidx.databinding.ObservableField
import com.faskn.app.weatherapp.core.BaseViewModel
import com.faskn.app.weatherapp.db.entity.CitiesForSearchEntity
import javax.inject.Inject




class SearchResultItemViewModel @Inject internal constructor() : BaseViewModel() {
    var item = ObservableField<CitiesForSearchEntity>()
}
