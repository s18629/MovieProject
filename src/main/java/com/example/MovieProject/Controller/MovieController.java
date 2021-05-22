package com.example.MovieProject.Controller;

import com.example.MovieProject.Model.MovieModel;
import com.example.MovieProject.Service.MovieService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movies")
    public ResponseEntity<List<MovieModel>> returnAllMovies(){
        return ResponseEntity.ok(movieService.returnAllMovies());
    }

    @GetMapping("/movie/{id}")
    public ResponseEntity<Optional<MovieModel>> returnMovieById(@PathVariable Integer id){
        return ResponseEntity.ok(movieService.findById(id));
    }

    @PostMapping("/add")
    public ResponseEntity<MovieModel> createNewMovie(@RequestBody MovieModel movieModel){
        return ResponseEntity.ok(movieService.createNewMovie(movieModel));
    }

    @PostMapping("/remove/{id}")
    public void removeMovieById(@PathVariable Integer id){
        movieService.removeById(id);
    }

}
