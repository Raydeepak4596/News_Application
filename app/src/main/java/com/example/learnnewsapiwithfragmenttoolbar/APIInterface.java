package com.example.learnnewsapiwithfragmenttoolbar;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIInterface {
//    @GET("top-headlines")
//    Call<Pojo> myposts(@Query("country") String country,
//                          @Query("apiKey") String apikey);

    @GET("top-headlines")
    Call<Pojo> myposts(@Query("country") String country,@Query("category") String category,@Query("pageSize") int pageSize,
                         @Query("apiKey") String apikey);
}

//    @GET("https://newsapi.org/v2/top-headlines?country=us&apiKey=75a145d868f74345a0f01a85712b6006")
//    Call<MyPojo> myposts();
//}
