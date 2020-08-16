package com.jakes.movies.controller;

import com.jakes.movies.model.Movie;
import com.jakes.movies.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/movies")
public class MovieController {
    private final MovieService service;

    public MovieController(@Autowired MovieService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseBody
    public Movie createMovie(@RequestBody Movie movie) {
        Movie createdMovie = service.createMovie(movie);
        System.out.println("New movie created: " + createdMovie);
        return createdMovie;
    }

    @ResponseBody
    @GetMapping(value = "{id}")
    public Movie getMovie(@PathVariable Integer id) {
        return service.getMovie(id);
    }

    @ResponseBody
    @GetMapping(value = "/name/{name}")
    public List<Movie> getMovieByName(@PathVariable String name) {
        return service.getMovieByName(name);
    }
}


