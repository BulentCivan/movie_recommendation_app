package com.movierecommendation.movieservice;

import com.movierecommendation.movieservice.Movie;
import java.util.List;
import java.util.Optional;

public interface MovieService {
    List<Movie> getAllMovies();
    Optional<Movie> getMovieById(Long id);
    Movie addMovie(Movie movie);
    void deleteMovie(Long id);
}
