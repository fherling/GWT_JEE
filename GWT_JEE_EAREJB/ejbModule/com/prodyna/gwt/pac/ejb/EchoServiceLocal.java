package com.prodyna.gwt.pac.ejb;

import javax.ejb.Local;

@Local
public interface EchoServiceLocal {

	String echo(String value);

}
