/**
 * 
 */
package com.prodyna.ws.pac;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author fherling
 *
 */
public class DataObject implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2989639159165637791L;
	private String name;
	private List<String> daten;

	private HashMap<String, String> nochmehrDaten;
	
	private Map<String, Dummy> andereDaten = new HashMap<String, Dummy>();

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((andereDaten == null) ? 0 : andereDaten.hashCode());
		result = prime * result + ((daten == null) ? 0 : daten.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((nochmehrDaten == null) ? 0 : nochmehrDaten.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DataObject other = (DataObject) obj;
		if (andereDaten == null) {
			if (other.andereDaten != null)
				return false;
		} else if (!andereDaten.equals(other.andereDaten))
			return false;
		if (daten == null) {
			if (other.daten != null)
				return false;
		} else if (!daten.equals(other.daten))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (nochmehrDaten == null) {
			if (other.nochmehrDaten != null)
				return false;
		} else if (!nochmehrDaten.equals(other.nochmehrDaten))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DataObject [name=" + name + ", daten=" + daten
				+ ", nochmehrDaten=" + nochmehrDaten + ", andereDaten="
				+ andereDaten + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getDaten() {
		return daten;
	}

	public void setDaten(List<String> daten) {
		this.daten = daten;
	}

	public HashMap<String, String> getNochmehrDaten() {
		return nochmehrDaten;
	}

	public void setNochmehrDaten(HashMap<String, String> nochmehrDaten) {
		this.nochmehrDaten = nochmehrDaten;
	}

	public Map<String, Dummy> getAndereDaten() {
		return andereDaten;
	}

	public void setAndereDaten(Map<String, Dummy> andereDaten) {
		this.andereDaten = andereDaten;
	}

}
