package pom.qa.business.service;

import javax.inject.Inject;

import pom.qa.business.repository.IMovieRepoistory;
import pom.qa.business.repository.MovieDBRepository;

public class MovieService implements IMovieService {

	@Inject
	private IMovieRepoistory mr;
	
	public String GetAllMovies() {
		return mr.getAllMovies();
	}
	
}
