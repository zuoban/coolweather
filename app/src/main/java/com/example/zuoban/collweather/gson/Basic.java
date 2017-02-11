package com.example.zuoban.collweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zuoba on 2017/2/11 0011.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;


    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }


}
