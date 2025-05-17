package com.elainevalles.getafe.ifct0062_2025_testws.service;

import com.elainevalles.getafe.ifct0062_2025_testws.Repository.IMovieRepository;
import com.elainevalles.getafe.ifct0062_2025_testws.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieService implements IMovieService {

    @Autowired
    IMovieRepository movieRepository;

    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public Movie createMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public void updateMovie(Movie movie) {
        movieRepository.save(movie);
    }

    @Override
    public void deleteMovie(Integer movieId) {
        movieRepository.deleteById(movieId);
    }

    @Override
    public Movie findMovieById(Integer movieId) {
        return movieRepository.findById(movieId)
                .orElseThrow(() -> new RuntimeException("Movie not found with ID: " + movieId));
    }

    @Override
    public List<String> findAllTitles() {
        return movieRepository.findAll()
                .stream()
                .map(Movie::getTitle)
                .collect(Collectors.toList());
    }

    @Override
    public List<String> findAllGenres() {
        return movieRepository.findAll()
                .stream()
                .map(movie -> movie.getGenre().getName())
                .distinct()
                .collect(Collectors.toList());
    }

    @Override
    public List<String> findAllDirectors() {
        return movieRepository.findAll()
                .stream()
                .map(Movie::getDirector)
                .collect(Collectors.toList());
    }

    @Override
    public List<Integer> findAllYears() {
        return movieRepository.findAll()
                .stream()
                .map(Movie::getYear)
                .collect(Collectors.toList());
    }

}
