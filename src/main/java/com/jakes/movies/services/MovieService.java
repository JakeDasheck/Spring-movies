package com.jakes.movies.services;

import com.jakes.movies.model.Movie;
import com.jakes.movies.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    private final MovieRepository repository;

    public MovieService(@Autowired MovieRepository repository) {
        this.repository = repository;
    }

    public Movie createMovie(Movie movie) {
        return repository.save(movie);
    }
}
