package com.prodyna.gwt.pac.ejb;

import javax.ejb.Local;

@Local
public interface DummyService {

	public abstract String echo(String value);

}