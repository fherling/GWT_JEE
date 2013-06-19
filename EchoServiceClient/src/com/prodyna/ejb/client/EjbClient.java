package com.prodyna.ejb.client;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.prodyna.gwt.pac.ejb.DummyServiceRemote;

public class EjbClient {
	
	public static void main(String[] args){
		EjbClient client = new EjbClient();
		client.connect();
	}
	

	public void connect() {
		try {
			
//			InputStream io =  this.getClass().getClassLoader().getResourceAsStream("jboss-ejb-client.properties");
			
			
			final Properties env = new Properties();

	         env.put(Context.INITIAL_CONTEXT_FACTORY, "org.jboss.naming.remote.client.InitialContextFactory");

	         env.put(Context.PROVIDER_URL, "remote://localhost:4447");


	         env.put(Context.INITIAL_CONTEXT_FACTORY, org.jboss.naming.remote.client.InitialContextFactory.class.getName());

//	         env.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");

			env.put("jboss.naming.client.ejb.context", true);

//			props.put(Context.SECURITY_AUTHENTICATION, "admin");
//			props.put(Context.SECURITY_PRINCIPAL,  "fherling");
//			props.put(Context.SECURITY_CREDENTIALS, "55141791f88600c271bdbc84878e8d40");
//			props.put(Context.SECURITY_CREDENTIALS, "innovision");
//			props.put(Context.SECURITY_PROTOCOL, "Plain");

			
			Context context = new InitialContext(env);
//			Object ejb = context
//					.lookup("java:global/GWT_JEE_EAR/GWT_JEE_EAREJB/DummyServiceImpl!com.prodyna.gwt.pac.ejb.DummyServiceRemote");
			
			Object ejb = context
					.lookup("java:ejb/DummyServiceImpl!com.prodyna.gwt.pac.ejb.DummyServiceRemote");			
			DummyServiceRemote service = (DummyServiceRemote) ejb;
			service.echo("HALLO");

		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

}




