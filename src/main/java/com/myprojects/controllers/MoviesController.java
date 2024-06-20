package com.myprojects.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.myprojects.entities.Movie;
import com.myprojects.services.MoviesService;


@RestController
public class MoviesController 
{

//Autowire the MoviesService class
@Autowired
MoviesService MoviesService;
//creating a get mapping that retrieves all the Movies detail from the database

@GetMapping("/movies")
private List<Movie> getAllMovies() 
{
return MoviesService.getAllMovies();
}


//creating a get mapping that retrieves the detail of a specific Movie
@GetMapping("/movie/{movieid}")
private Movie getMovies(@PathVariable("movieid") int movieid) 
{
return MoviesService.getMoviesById(movieid);
}


//creating a delete mapping that deletes a specified Movie
@DeleteMapping("/movie/{movieid}")
private void deleteMovie(@PathVariable("movieid") int movieid) 
{
MoviesService.delete(movieid);
}


//creating post mapping that post the Movie detail in the database
@PostMapping("/addmovie")
private int saveMovie(@RequestBody Movie movie) 
{
MoviesService.saveOrUpdate(movie);
return movie.getMovieid();
}


//creating put mapping that updates the Movie detail 
@PutMapping("/movies")
private Movie update(@RequestBody Movie movie) 
{
MoviesService.saveOrUpdate(movie);
return movie;
}
}
