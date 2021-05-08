package com.example.MovieProject.Controller;

import com.example.MovieProject.Model.MovieModel;
import com.example.MovieProject.Service.MovieService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


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

    @PostMapping("/add")
    public ResponseEntity<MovieModel> createNewMovie(@RequestBody MovieModel movieModel){
        return ResponseEntity.ok(movieService.createNewMovie(movieModel));
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<MovieModel> findById(@PathVariable("id") int id){
//        return ResponseEntity.ok(movieService.findById(id));
//    }
}
