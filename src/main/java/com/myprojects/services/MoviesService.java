package com.myprojects.services;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myprojects.entities.Movie;
import com.myprojects.repositories.MoviesRepository;
//defining the business logic
@Service
public class MoviesService 
{
@Autowired
MoviesRepository MoviesRepository;
//getting all Movies record by using the method findaAll() of CrudRepository
public List<Movie> getAllMovies() 
{
List<Movie> Movies = new ArrayList<Movie>();
MoviesRepository.findAll().forEach(Movies1 -> Movies.add(Movies1));
return Movies;
}
//getting a specific record by using the method findById() of CrudRepository
public Movie getMoviesById(int id) 
{
return MoviesRepository.findById(id).get();
}
//saving a specific record by using the method save() of CrudRepository
public void saveOrUpdate(Movie Movie) 
{
MoviesRepository.save(Movie);
}
//deleting a specific record by using the method deleteById() of CrudRepository
public void delete(int id) 
{
MoviesRepository.deleteById(id);
}
//updating a record
public void update(Movie Movies, int Movieid) 
{
MoviesRepository.save(Movies);
}
}