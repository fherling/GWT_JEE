package com.prodyna.pac.inject;

import javax.enterprise.inject.Any;

import com.prodyna.gwt.pac.ejb.DummyServiceRemote;

@Any
public class RemoteServiceImpl implements RemoteService {


	private DummyServiceRemote remote;
	
	/* (non-Javadoc)
	 * @see com.prodyna.pac.inject.RemoteService#call(java.lang.String)
	 */
	@Override
	public void call(String value){
		System.out.println("RemoteService is called with " + value);
		
		remote.echo(value);
	}
	
	public void setDummyService(DummyServiceRemote remote){
		this.remote = remote;
		
	}
	
}
