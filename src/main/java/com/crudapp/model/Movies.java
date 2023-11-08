package com.crudapp.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//mark class as an Entity 
@Entity
//defining class name as Table name
@Table
public class Movies
{
//Defining Movie id as primary key
@Id
@Column
private int Movieid;
@Column
private String Moviename;
@Column
private String genre;
@Column
private String image;
@Column
private int releaseYear;


public int getMovieid() {
	return Movieid;
}
public void setMovieid(int movieid) {
	Movieid = movieid;
}
public String getMoviename() {
	return Moviename;
}
public void setMoviename(String moviename) {
	Moviename = moviename;
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