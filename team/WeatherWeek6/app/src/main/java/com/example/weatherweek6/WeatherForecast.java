package com.example.weatherweek6;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

public class WeatherForecast {
    @SerializedName("list")
    public List<WeatherForecastItem> week = new ArrayList<>();


}
