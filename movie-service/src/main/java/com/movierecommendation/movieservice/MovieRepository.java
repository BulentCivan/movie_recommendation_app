package com.movierecommendation.movieservice;

import com.movierecommendation.movieservice.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
