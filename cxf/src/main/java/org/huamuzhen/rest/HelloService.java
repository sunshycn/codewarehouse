package org.huamuzhen.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello/")
public interface HelloService {
	
	@GET
	@Produces("text/plain")
	@Path("/")
	public String sayHello();
	

}
