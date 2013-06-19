package com.prodyna.gwt.pac.ejb;

import javax.ejb.Remote;

@Remote
public interface DummyServiceRemote {

	public abstract String echo(String value);

}