package com.jakes.movies.controllers;

import com.jakes.movies.model.Movie;
import com.jakes.movies.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/movies")
public class MovieController {
    MovieService service;

    public MovieController(@Autowired MovieService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseBody
    public Movie createMovie(@RequestBody Movie movie) {
        System.out.println(movie);
        return service.createMovie(movie);
    }

}


