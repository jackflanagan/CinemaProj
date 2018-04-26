package pom.qa.business.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;
import java.util.Collection;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.apache.log4j.Logger;

import pom.qa.persistence.domain.Movie;
import pom.qa.util.JSONUtil;

public class MovieDBRepository implements IMovieRepoistory{

	
	private static final Logger LOGGER = Logger.getLogger(MovieDBRepository.class);
	
	@PersistenceContext(unitName = "primary")
	private EntityManager em; 
	
	@Inject
	private JSONUtil util;
	
	@Override
	public String getAllMovies() {
		LOGGER.info("MovieDBRepostory : getAllMovies");
		Query query = em.createQuery("Select m from Movie m");
		Collection <Movie> movies = (Collection <Movie>) query.getResultList();
		
		return util.getJsonForObject(movies);
	}
	
	
	@Override
	public String getMovie(Long id) {
		Movie aMovie = findMovie(id);
		if(aMovie != null) {
			return util.getJsonForObject(aMovie);
		}
		return "{\"message\": \"movie has been found\"}";
	}
	
	
	@Override
	@Transactional(REQUIRED)
	public String addMovie(String MovieJson) {
		Movie movieToAdd = util.getObjectForJSON(MovieJson, Movie.class);
		em.persist(movieToAdd);
		return "{\"message\": \"movie has been sucessfully added\"}";
	}
	
	
	private Movie findMovie(Long id) {
		Movie aMovie = em.find(Movie.class, id);
		return aMovie;
	}


	
	

}
