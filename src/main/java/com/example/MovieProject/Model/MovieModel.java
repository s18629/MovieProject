package com.example.MovieProject.Model;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@DynamicUpdate
@Entity(name = "movie")
public class MovieModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String genre;
    private String name;

    @Column(columnDefinition = "TINYINT")
    private Boolean isAvailable;

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

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }
}
