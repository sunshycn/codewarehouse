package org.huamuzhen.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.huamuzhen.model.User;

@Path("/user/")
public interface UserService {
	
	@Path("/")
	@POST
	@Produces({"application/text", "text/plain" })
	@Consumes({"application/json","text/json"})
	public String createUser(User user);
	
	@Path("/")
	@GET
	public Response hello();

}
