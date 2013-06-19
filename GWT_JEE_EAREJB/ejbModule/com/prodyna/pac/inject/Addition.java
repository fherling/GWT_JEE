package com.prodyna.pac.inject;

import javax.inject.Named;

@Named
public class Addition {
	public Addition(){
		System.out.println("Create Addition");
	}
	
	public int add(int a, int b){
		return a + b;
	}
}
