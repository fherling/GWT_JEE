/**
 * 
 */
package com.prodyna.ws.pac;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.prodyna.pac.inject.RemoteServiceConsumer;

/**
 * @author fherling
 *
 */
@WebService(portName="EchoServiceSOAP", serviceName="EchoServiceWs", endpointInterface="com.prodyna.ws.pac.EchoServiceWs")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@Stateless
public class EchoServiceWsImpl implements EchoServiceWs {
	
	@EJB
	private RemoteServiceConsumer consumer;

	/* (non-Javadoc)
	 * @see com.prodyna.ws.pac.EchoServiceWs#echo(java.lang.String)
	 */
	@Override
	public String echo(String value){
		
		consumer.consume(value);
		
		return "Echo: " + value;
	}

	@Override
	public DataObject handle(DataObject obj) {
		
		consumer.consume("DUMMY");
		
		System.out.println(obj);
		
		obj.getNochmehrDaten().put("TEST", "TEST");
		
		return obj;
	}
	
	@Override
	public void handleData(String jsonData) {
		
		consumer.consume(jsonData);
		
//		System.out.println(jsonData);
		

	}
	
}
