package com.prodyna.gwt.pac.ejb;

import javax.ejb.Remote;

@Remote
public interface EchoServiceRemote {

	String echo(String value);
}
