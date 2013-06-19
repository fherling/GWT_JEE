package com.prodyna.pac.inject;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

public @Stateless
class RemoteServiceConsumerBean implements RemoteServiceConsumer {

	@Inject @Default
	private RemoteService remoteService;
	
	@Inject
	private Addition add;
	
	public RemoteService getRemoteService() {
		return remoteService;
	}


	public void setRemoteService(RemoteService remoteService) {
		this.remoteService = remoteService;
	}


	


	@Override
	public void consume(String value) {
		if( null != remoteService){
		remoteService.call(value);
		}else{
			System.out.println("########################   GEHT NOCH NICHT ##################################");
		}
		
	}
}
