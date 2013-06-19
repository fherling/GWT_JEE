package com.prodyna.ws.pac;

import javax.ejb.Stateless;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Session Bean implementation class RestWsImpl
 */
//@Stateless
@Named
@Path("/receive")
public class RestWsImpl {

    /**
     * Default constructor. 
     */
    public RestWsImpl() {

    }
    
    
    @GET
    @Path("lasturl")
    @Produces("text/plain")
    public String receive(){
    	return "TEST";
    }

}
