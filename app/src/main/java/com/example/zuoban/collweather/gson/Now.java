package com.example.zuoban.collweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zuoba on 2017/2/11 0011.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
