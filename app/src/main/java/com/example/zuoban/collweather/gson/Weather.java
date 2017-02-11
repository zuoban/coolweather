package com.example.zuoban.collweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by zuoba on 2017/2/11 0011.
 */

public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastLIst;

}
