package pom.qa.business.service;

import javax.inject.Inject;

import pom.qa.business.repository.IMovieRepoistory;
import pom.qa.business.repository.MovieDBRepository;
import pom.qa.persistence.domain.Movie;
import pom.qa.util.JSONUtil;

public class MovieService implements IMovieService {

	@Inject
	JSONUtil util;
	
	@Inject
	private IMovieRepoistory mr;
	
	public String GetAllMovies() {
		return mr.getAllMovies();
	}

	@Override
	public String getMovie(Long id) {
		// TODO Auto-generated method stub
		return mr.getMovie(id);
	}

	@Override
	public String addMovie(String movieJson) {
		// TODO Auto-generated method stub
		return mr.addMovie(movieJson);
	}

	@Override
	public String deleteMovie(Long id) {
		// TODO Auto-generated method stub
		return mr.deleteMovie(id);
	}
	
	@Override
	public String updateMovie(Long id, String update) {
		// TODO Auto-generated method stub
		return mr.updateMovie(id,update);
	}
	
	

	



	
	
	
	
}
