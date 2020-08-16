package com.jakes.movies.service;

import com.jakes.movies.model.Movie;
import com.jakes.movies.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    private final MovieRepository repository;

    public MovieService(@Autowired MovieRepository repository) {
        this.repository = repository;
    }

    public Movie createMovie(Movie movie) {
        return repository.save(movie);
    }

    public Movie getMovie(Integer id) {
        return repository.getOne(id);
    }

    public List<Movie> getMovieByName(String name) {
        return repository.findMoviesByName(name);
    }
}
