package com.example.MovieProject.Model;

import javax.persistence.*;

@Entity(name = "movie")
public class MovieModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String genre;
    private String name;


   public MovieModel(){
   }

    public Integer getId() {
        return id;
    }

    public String getGenre() {
        return genre;
    }

    public String getName() {
       return name;
    }
}
