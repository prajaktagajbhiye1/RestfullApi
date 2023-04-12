package com.tutorialacademy.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/test")
public class RESTfulHelloWorld {
	
	@GET
    @Produces(MediaType.APPLICATION_XML)
    public ResponseProject getStartingPage()
    {
		ResponseProject obj1 = new ResponseProject();
		obj1.setId(33);
		obj1.setName("prajakta");
		return obj1;
        
    }

}
