package pom.qa.integration;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import pom.qa.business.service.IMovieService;

@Path("/Movie")
public class MovieEndpoint {
	
	@Inject
	private IMovieService ims;
	
	@GET 
	@Path("/json")
	@Produces(("application/json"))
	public String getAllMovies() {
		return ims.GetAllMovies();
		
	}
	

}