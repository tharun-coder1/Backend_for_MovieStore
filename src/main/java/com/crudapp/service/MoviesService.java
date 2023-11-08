package com.crudapp.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudapp.model.Movies;
import com.crudapp.repository.MoviesRepository;
//defining the business logic
@Service
public class MoviesService 
{
@Autowired
MoviesRepository MoviesRepository;
//getting all Movies record by using the method findaAll() of CrudRepository
public List<Movies> getAllMovies() 
{
List<Movies> Movies = new ArrayList<Movies>();
MoviesRepository.findAll().forEach(Movies1 -> Movies.add(Movies1));
return Movies;
}
//getting a specific record by using the method findById() of CrudRepository
public Movies getMoviesById(int id) 
{
return MoviesRepository.findById(id).get();
}
//saving a specific record by using the method save() of CrudRepository
public void saveOrUpdate(Movies Movies) 
{
MoviesRepository.save(Movies);
}
//deleting a specific record by using the method deleteById() of CrudRepository
public void delete(int id) 
{
MoviesRepository.deleteById(id);
}
//updating a record
public void update(Movies Movies, int Movieid) 
{
MoviesRepository.save(Movies);
}
}