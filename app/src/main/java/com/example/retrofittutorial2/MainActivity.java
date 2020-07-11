package com.example.retrofittutorial2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
//Adapter_Song adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        RequestInterface requestInterface=APIclient.getSong().create(RequestInterface.class);

        Call<List<MovieList>>call=requestInterface.getMovieList();

       call.enqueue(new Callback<List<MovieList>>() {
           @Override
           public void onResponse(Call<List<MovieList>> call, Response<List<MovieList>> response) {


               if(response.isSuccessful()){
                   Toast.makeText(MainActivity.this, "yessyesssyesss", Toast.LENGTH_SHORT).show();


        }
           }

           @Override
           public void onFailure(Call<List<MovieList>> call, Throwable t) {
               Toast.makeText(MainActivity.this, "nooooooo", Toast.LENGTH_SHORT).show();
           }
       });

    }}









//for(Song song:response.body()){
//
//Log.i("getsong",song.getSong_name()+"__"+song.getArtist_name()+"__"+song.getSong_id());
//
//}