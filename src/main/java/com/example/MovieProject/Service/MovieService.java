package com.example.MovieProject.Service;

import com.example.MovieProject.Model.MovieModel;
import com.example.MovieProject.Repository.MovieRepository;
import com.example.MovieProject.exception.MovieNotFoundException;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<MovieModel> returnAllMovies(){
        return movieRepository.findAll();
    }

    public MovieModel findById(Integer id){
        return movieRepository.findById(id).orElseThrow(MovieNotFoundException::new);
    }

    public MovieModel createNewMovie(MovieModel movieModel){
        return movieRepository.save(movieModel);
    }

    public void removeById(Integer id){
        movieRepository.deleteById(id);
    }

    public void updateMovie(Integer id){
        movieRepository.updateAvailability(id);
    }
}
