package com.prodyna.ws.pac;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Dummy implements Serializable{
	

	private static final long serialVersionUID = -1385487362715047837L;
	private String value = "n.a.";
	private Integer alter = new Integer(0);
	@Override
	public String toString() {
		return "Dummy [value=" + value + ", alter=" + alter + ", data=" + data
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alter == null) ? 0 : alter.hashCode());
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
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
		Dummy other = (Dummy) obj;
		if (alter == null) {
			if (other.alter != null)
				return false;
		} else if (!alter.equals(other.alter))
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}
	private List<Object> data = new ArrayList<>();
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Integer getAlter() {
		return alter;
	}
	public void setAlter(Integer alter) {
		this.alter = alter;
	}
	public List<Object> getData() {
		return data;
	}
	public void setData(List<Object> data) {
		this.data = data;
	}
	
}
