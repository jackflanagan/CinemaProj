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
	
	

	



	
	
	
	
}
