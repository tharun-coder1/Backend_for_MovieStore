package com.crudapp.repository;
import org.springframework.data.repository.CrudRepository;

import com.crudapp.model.Movies;
public interface MoviesRepository extends CrudRepository<Movies, Integer>
{
}
