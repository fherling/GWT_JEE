package com.prodyna.pac.inject;

import java.io.Serializable;
import java.util.Hashtable;
import java.util.Properties;

import javax.enterprise.inject.Default;
import javax.enterprise.inject.Produces;
import javax.inject.Named;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.naming.spi.InitialContextFactory;

import com.prodyna.gwt.pac.ejb.DummyServiceRemote;

@Default
@Named
public class RemoteServiceFactory implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8744675944523649397L;

	@Produces
	public RemoteService createRemoteService() {

		System.out.println("createRemoteService");

		RemoteServiceImpl impl = new RemoteServiceImpl();

		try {
			Properties props = new Properties();
//			props.put(Context.PROVIDER_URL, "127.0.0.1:4447");
			props.put(Context.PROVIDER_URL, "remote://localhost:4447");
			
			props.put(Context.INITIAL_CONTEXT_FACTORY, "org.jboss.naming.remote.client.InitialContextFactory");

//			props.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");

			props.put("jboss.naming.client.ejb.context", true);

			Context context = new InitialContext(props);
			// Object ejb =
			// context.lookup("java:global/GWT_JEE_EAR/GWT_JEE_EAREJB/DummyService!com.prodyna.gwt.pac.ejb.DummyService");
//			Object ejb = context
//					.lookup("java:global/GWT_JEE_EAR/GWT_JEE_EAREJB/DummyServiceImpl!com.prodyna.gwt.pac.ejb.DummyServiceRemote");
			
			Object ejb = context
					.lookup("java:ejb/DummyServiceImpl!com.prodyna.gwt.pac.ejb.DummyServiceRemote");
			
			
			
			DummyServiceRemote service = (DummyServiceRemote) ejb;
			service.echo("HALLO");

			impl.setDummyService(service);

		} catch (NamingException e) {
			e.printStackTrace();
		}

		if( true ){
			throw new RuntimeException("So nicht funktionieren");
		}
		
		return impl;
	}
}
