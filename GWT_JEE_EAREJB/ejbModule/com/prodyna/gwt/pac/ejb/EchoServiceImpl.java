package com.prodyna.gwt.pac.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class EchoServiceImpl
 */
@Stateless
@LocalBean
public class EchoServiceImpl implements EchoServiceRemote, EchoServiceLocal {

    /**
     * Default constructor. 
     */
    public EchoServiceImpl() {
    	System.out.println("EchoService created");
    }
    
    @Override
    public String echo(String value){
    	System.out.println("Received: " + value);
    	return "Echoed: " + value;
    }

}
