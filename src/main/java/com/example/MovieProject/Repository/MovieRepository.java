package com.example.MovieProject.Repository;

import com.example.MovieProject.Model.MovieModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MovieRepository extends JpaRepository<MovieModel, Integer> {

}
