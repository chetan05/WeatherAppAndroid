package com.faskn.app.weatherapp.domain.datasource.forecast

import com.faskn.app.weatherapp.db.dao.ForecastDao
import com.faskn.app.weatherapp.db.entity.ForecastEntity
import com.faskn.app.weatherapp.domain.model.ForecastResponse
import javax.inject.Inject




class ForecastLocalDataSource @Inject constructor(private val forecastDao: ForecastDao) {

    fun getForecast() = forecastDao.getForecast()

    fun insertForecast(forecast: ForecastResponse) = forecastDao.deleteAndInsert(ForecastEntity(forecast))
}
