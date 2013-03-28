package org.huamuzhen.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/plain/")
public interface PlainService {
	
	@Path("/")
	@POST
	@Produces({"application/text", "text/plain" })
	@Consumes({"application/text","text/plain"})
	public String plain(String plain);

}
