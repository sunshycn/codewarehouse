package org.huamuzhen.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.huamuzhen.model.Query;

@Path("/query/")
public interface QueryService {
	
	@Path("/")
	@POST
	@Produces({"application/text", "text/plain" })
	@Consumes({"application/json","text/json"})
	public String createQuery(Query query);

}
