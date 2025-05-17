package com.elainevalles.getafe.ifct0062_2025_testws.service;

import com.elainevalles.getafe.ifct0062_2025_testws.entity.Movie;

import java.util.List;

public interface IMovieService {
    List<Movie> getAllMovies();
    public Movie createMovie(Movie movie);
    public void updateMovie(Movie movie);
    public void deleteMovie(Integer movieId);
    public Movie findMovieById(Integer movieId);
    public List<String> findAllTitles();
    public List<String> findAllGenres();
    public List<String> findAllDirectors();
    public List<Integer> findAllYears();
}
