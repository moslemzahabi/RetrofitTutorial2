package com.example.retrofittutorial2;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RequestInterface {

    @GET("api/json.php")
    Call<List<MovieList>>getMovieList();


}
