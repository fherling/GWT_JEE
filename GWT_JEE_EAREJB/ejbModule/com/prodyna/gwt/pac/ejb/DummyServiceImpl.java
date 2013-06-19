package com.prodyna.gwt.pac.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class DummyService
 */
@Stateless
@LocalBean
public class DummyServiceImpl implements DummyService, DummyServiceRemote {

    /**
     * Default constructor. 
     */
    public DummyServiceImpl() {
        System.out.println("Create DummyService");
    }
    
    
    /* (non-Javadoc)
	 * @see com.prodyna.gwt.pac.ejb.DummyService#echo(java.lang.String)
	 */
    @Override
	public String echo(String value){
    	System.out.println("DummyService.echo(" + value + ")"); 
    	return "Echoed: " + value;
    }

}
