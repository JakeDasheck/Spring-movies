package com.jakes.movies.services;

import com.jakes.movies.model.Movie;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    public Movie createMovie(Movie movie) {
        return movie;
    }
}
