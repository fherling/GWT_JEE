/**
 * 
 */
package com.prodyna.ws.pac;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.google.gson.Gson;

/**
 * @author fherling
 * 
 */
public class EchoServiceWsClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String url = "http://localhost:8080/GWT_JEE_EAREJB/EchoServiceWs/EchoServiceWsImpl";
		Service service;
		try {
			service = Service.create(new URL(url + "?wsdl"), new QName(
					"http://pac.ws.prodyna.com/", "EchoServiceWs"));
			EchoServiceWs halloWelt = service.getPort(EchoServiceWs.class);
			DataObject obj = new DataObject();
			obj.setDaten(new ArrayList<String>());
			obj.setNochmehrDaten(new HashMap<String, String>());
			obj.getAndereDaten().put("KEY", new Dummy());

			HashMap<String, String> data = new HashMap<String, String>();
			data.put("KEY", "VALUE");

			for (int i = 0; i < 10; i++) {
				System.out.println("\n" + halloWelt.echo("Ein Test" + i));
				obj.setName("" + i);
				obj.getDaten().add(""+i);
				obj.getNochmehrDaten().put("KEY" + i, "VALUE" + i );
//				System.out.println(halloWelt.handle(obj));

//				halloWelt.handleData(generateJson(data));
				
				halloWelt.handleData(generateJson(obj));
				

			}

		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}

	public static String generateJson(DataObject data) {

		Gson gson = new Gson();
		String value = gson.toJson(data);
		
		DataObject res = gson.fromJson(value, DataObject.class);

		System.out.println(res);
		
		return value;
	}

}
