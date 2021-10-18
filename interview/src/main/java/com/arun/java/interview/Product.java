package com.arun.java.interview;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Product {

	int pId;
	String pName;
	double price;
	String pType;

	public Product(int pId, String pName, double price, String pType) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.price = price;
		this.pType = pType;
	}

}
