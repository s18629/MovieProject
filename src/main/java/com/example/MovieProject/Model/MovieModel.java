package com.example.MovieProject.Model;

import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.stereotype.Component;

import java.util.ArrayList;


public class MovieModel {

    private int id;
    private String genre;
    private String name;


    public MovieModel(int id, String genre, String name) {
        this.id = id;
        this.genre = genre;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getGenre() {
        return genre;
    }

    public String getName() {
        return name;
    }
}
