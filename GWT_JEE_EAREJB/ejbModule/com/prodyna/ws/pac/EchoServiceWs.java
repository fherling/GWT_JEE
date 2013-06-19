package com.prodyna.ws.pac;

import javax.jws.WebService;

@WebService
public interface EchoServiceWs {

	public abstract String echo(String value);
	
	
	public abstract DataObject handle(DataObject obj);


	void handleData(String jsonData);

}