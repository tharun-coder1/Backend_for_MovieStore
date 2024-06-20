package com.myprojects.repositories;
import org.springframework.data.repository.CrudRepository;

import com.myprojects.entities.Movie;
public interface MoviesRepository extends CrudRepository<Movie, Integer>
{
}
