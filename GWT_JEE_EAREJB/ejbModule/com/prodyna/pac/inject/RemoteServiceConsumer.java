package com.prodyna.pac.inject;

import javax.ejb.Remote;

@Remote
public interface RemoteServiceConsumer {

	void consume(String value);

}
