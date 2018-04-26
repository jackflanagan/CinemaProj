package pom.qa.business.service;

import java.util.HashMap;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import pom.qa.persistence.domain.Movie;
import pom.qa.util.JSONUtil;

@ApplicationScoped
@Alternative
public class MovieMapRepo implements IMovieService {

	private final Long INITIAL_COUNT = 1L;
	private Map<Long, Movie> MovieMap;
	private Long ID;

	@Inject
	private JSONUtil util;

	public MovieMapRepo() {
		this.MovieMap = new HashMap<Long, Movie>();
		ID = INITIAL_COUNT;
		initMovieMap();
	}
	

	private void initMovieMap() {
		Movie  m = new Movie("hello", "hello", "hello");
		MovieMap.put(1L, m);
	}

	@Override
	public String GetAllMovies() {
		// TODO Auto-generated method stub
		return util.getJsonForObject(MovieMap.values());
	}

	@Override
	public String addMovie(String movieJson) {
	
		Movie m = util.getObjectForJSON(movieJson, Movie.class);
		MovieMap.put(ID, m);
		return "{\"message\": \"movie sucessfully added\"}";
	}

	@Override
	public String deleteMovie(Long id) {
		MovieMap.remove(id);
		return "{\"message\": \"movie sucessfully removed\"}";
	}

	@Override
	public String updateMovie(Long id, String update) {
		Movie movieToUpdate = util.getObjectForJSON(update, Movie.class);
		MovieMap.put(id, movieToUpdate);
		return "{\"message\": \"movie sucessfully updated\"}";
	}

	@Override
	public String getMovie(Long id) {
		
		MovieMap.get(id);
		return util.getJsonForObject(MovieMap).valueOf(id);
	}

}
