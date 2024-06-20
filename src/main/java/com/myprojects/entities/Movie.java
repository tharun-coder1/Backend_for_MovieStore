package com.myprojects.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Movie
{

@Id
@GeneratedValue
private int movieid;


private String moviename;


private String genre;


private String image;


private int releaseYear;


public int getMovieid() {
	return movieid;
}
public void setMovieid(int movieid) {
	this.movieid = movieid;
}
public String getMoviename() {
	return moviename;
}
public void setMoviename(String moviename) {
	this.moviename = moviename;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}
public int getReleaseYear() {
	return releaseYear;
}
public void setReleaseYear(int releaseYear) {
	this.releaseYear = releaseYear;
}

}