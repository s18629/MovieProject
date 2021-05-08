package com.example.MovieProject.Service;

import com.example.MovieProject.Model.MovieModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    private ArrayList<MovieModel> movies;


    public List<MovieModel> returnAllMovies(){
        MovieModel movie_one = new MovieModel(1, "Horror", "saw");
        return List.of(movie_one);
    }

    public MovieModel createNewMovie(MovieModel movieModel){
        return movieModel;
    }
//
//    public MovieModel findById(int id){
//        return findById(id);
//    }
}
