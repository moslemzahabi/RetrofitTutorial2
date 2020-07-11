package com.example.retrofittutorial2;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MovieList {
    @SerializedName("movies")
    private List<Movie> movies ;

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

}
