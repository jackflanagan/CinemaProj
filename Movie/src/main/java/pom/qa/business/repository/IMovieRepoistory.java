package pom.qa.business.repository;

public interface IMovieRepoistory {
	
	String getAllMovies();
	
	String getMovie(Long id);
	
	String addMovie(String MovieJson);
	
	String deleteMovie(Long id);
	
	String updateMovie(Long id, String update);

}
