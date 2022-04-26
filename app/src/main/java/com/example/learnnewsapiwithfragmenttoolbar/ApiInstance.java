package com.example.learnnewsapiwithfragmenttoolbar;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiInstance {
    private  static Retrofit retrofit;
    private  static final String BASEURL="https://newsapi.org/v2/";
    String key="75a145d868f74345a0f01a85712b6006";
    String country="in";

    public static Retrofit getRetrofit() {
        if(retrofit == null){
            retrofit=new Retrofit.Builder().baseUrl(BASEURL).addConverterFactory(GsonConverterFactory.create()).build();

        }
        return retrofit;
    }
}
