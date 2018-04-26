package pom.qa.business.service;

public interface IMovieService {

	String GetAllMovies();
	
	String getMovie(Long id);
	
	String addMovie(String movieJson);
	
	String deleteMovie(Long id);
	
	String updateMovie(Long id,String update);
	
	
	
	
}
