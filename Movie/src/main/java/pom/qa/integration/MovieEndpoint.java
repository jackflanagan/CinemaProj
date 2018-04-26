package pom.qa.integration;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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
	
	@GET 
	@Path("/json/{id}")
	@Produces(("application/json"))
	public String getMovie(@PathParam("id") Long id) {
		return ims.getMovie(id);
		
	}
	
	@POST 
	@Path("/json")
	@Produces(("application/json"))
	public String addMovie(String movieToAdd) {
		return ims.addMovie(movieToAdd);
		
	}
	
	@DELETE 
	@Path("/json/{id}")
	@Produces(("application/json"))
	public String addMovie(@PathParam("id") Long id) {
		return ims.deleteMovie(id);
		
	}
	
	@PUT 
	@Path("/json/{id}")
	@Produces(("application/json"))
	public String updateMovie(@PathParam("id") Long id,String update) {
		return ims.updateMovie(id,update);
		
	}
	
	

}
