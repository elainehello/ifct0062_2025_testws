package com.elainevalles.getafe.ifct0062_2025_testws.controller;

import com.elainevalles.getafe.ifct0062_2025_testws.Repository.IGenreRepository;
import com.elainevalles.getafe.ifct0062_2025_testws.Repository.IMovieRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AppController {
    IGenreRepository genreRepository;
    IMovieRepository movieRepository;

    public AppController(IGenreRepository genreRepository, IMovieRepository movieRepository) {
        this.genreRepository = genreRepository;
        this.movieRepository = movieRepository;
    }

    @GetMapping("/")
    public String index(Model model) {

        return "index";
    }

}
