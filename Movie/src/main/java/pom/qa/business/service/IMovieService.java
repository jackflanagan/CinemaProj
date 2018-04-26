package pom.qa.business.service;

public interface IMovieService {

	String GetAllMovies();
	
	String getMovie(Long id);
	
	String addMovie(String movieJson);
	
	
	
	
}
