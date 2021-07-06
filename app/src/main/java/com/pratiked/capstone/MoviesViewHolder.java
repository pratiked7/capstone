package com.pratiked.capstone;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.pratiked.capstone.model.Movie;

import java.util.List;

public class MoviesViewHolder extends ViewModel {

    private MutableLiveData<List<Movie>> liveMovies = new MutableLiveData<>();

    public MoviesViewHolder(){

    }

    public void init(){

    }

    public LiveData<List<Movie>> getMovies(){
        return liveMovies;
    }
}
