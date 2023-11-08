package com.crudapp.repository;
import org.springframework.data.repository.CrudRepository;

import com.crudapp.model.Movie;
public interface MoviesRepository extends CrudRepository<Movie, Integer>
{
}
