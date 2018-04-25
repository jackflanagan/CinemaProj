package pom.qa.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;




@Entity
public class Movie {
	
	
	
	
	@GeneratedValue
	@Id
	private Long id;
	@Column
	private String MovieTitle;
	@Column
	private String MovieGenre;
	@Column
	private String MovieRating;
	
	
public Movie() {
		
	}
	
	public Movie(String MovieTitle,String MovieGenre,String MovieRating ) {
		
		this.MovieTitle = MovieTitle;
		this.MovieGenre = MovieGenre;
		this.MovieRating = MovieRating;
		
	}

	public Long getId() {
		return id;
	}

	

	public String getMovieTitle() {
		return MovieTitle;
	}

	public void setMovieTitle(String movieTitle) {
		MovieTitle = movieTitle;
	}

	public String getMovieGenre() {
		return MovieGenre;
	}

	public void setMovieGenre(String movieGenre) {
		MovieGenre = movieGenre;
	}

	public String getMovieRating() {
		return MovieRating;
	}

	public void setMovieRating(String movieRating) {
		MovieRating = movieRating;
	}
	

}
