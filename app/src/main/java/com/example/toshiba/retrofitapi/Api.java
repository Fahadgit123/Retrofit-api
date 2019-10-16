package com.example.toshiba.retrofitapi;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Toshiba on 24-Sep-19.
 */

public interface Api {
    String BASE_URL = "https://simplifiedcoding.net/demos/marvel/";

    @GET("marvel")
    Call<List<Hero>> getHeroes();
}
