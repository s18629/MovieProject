package com.example.MovieProject.Repository;

import com.example.MovieProject.Model.MovieModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


public interface MovieRepository extends JpaRepository<MovieModel, Integer>{
    @Override
    Optional<MovieModel> findById(Integer integer);

    @Override
    List<MovieModel> findAll();

    @Override
    void deleteById(Integer integer);

    @Override
    MovieModel save (MovieModel movie);

    @Transactional
    @Modifying
    @Query("update movie set isAvailable = 1 where id = :id")
    void updateAvailability(@Param("id") Integer id);


}
