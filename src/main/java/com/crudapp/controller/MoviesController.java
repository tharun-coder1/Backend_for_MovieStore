package com.crudapp.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crudapp.model.Movies;
import com.crudapp.service.MoviesService;


@RestController
public class MoviesController 
{

//Autowire the MoviesService class
@Autowired
MoviesService MoviesService;
//creating a get mapping that retrieves all the Movies detail from the database

@GetMapping("/Movie")
private List<Movies> getAllMovies() 
{
return MoviesService.getAllMovies();
}


//creating a get mapping that retrieves the detail of a specific Movie
@GetMapping("/Movie/{Movieid}")
private Movies getMovies(@PathVariable("Movieid") int Movieid) 
{
return MoviesService.getMoviesById(Movieid);
}


//creating a delete mapping that deletes a specified Movie
@DeleteMapping("/Movie/{Movieid}")
private void deleteMovie(@PathVariable("Movieid") int Movieid) 
{
MoviesService.delete(Movieid);
}


//creating post mapping that post the Movie detail in the database
@PostMapping("/Movies")
private int saveMovie(@RequestBody Movies Movies) 
{
MoviesService.saveOrUpdate(Movies);
return Movies.getMovieid();
}


//creating put mapping that updates the Movie detail 
@PutMapping("/Movies")
private Movies update(@RequestBody Movies Movies) 
{
MoviesService.saveOrUpdate(Movies);
return Movies;
}
}
