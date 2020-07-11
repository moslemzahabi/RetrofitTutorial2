package com.example.retrofittutorial2;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIclient {

    public  static Retrofit getSong(){
        String BaseUrl ="https://programchi.ir/";
        Retrofit retrofit =new Retrofit.Builder()
                .baseUrl(BaseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return  retrofit;
    }


}
