package com.arun.java.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class ProductFunctionDemo {

	public static void main(String[] args) {
		Product p1 = new Product(101, "Mobile", 500.00, "Electronics");
		Product p2 = new Product(102, "TV", 200.00, "Electronics");
		Product p3 = new Product(103, "Laptop", 1000.00, "Electronics");
		Product p4 = new Product(104, "Watch", 50.00, "Men");
		Product p5 = new Product(105, "Apple", 10.00, "Fruits");

		List<Product> products = new ArrayList<Product>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		
		//prod.pType.equalsIgnoreCase("Electronics")
		Predicate<Product> isElectronic = prod -> prod.pType.equalsIgnoreCase("Electronics");
		
		Function<Product, Product> discountedElectronics = prod -> {

			if(isElectronic.test(prod)) {
				prod.price =  prod.price -(prod.price * 0.1 ) ;
			}
			return prod;
		};
		
		for(Product p : products) {
			Product newProduct = discountedElectronics.apply(p);
			System.out.println(newProduct.pName +  " - "+newProduct.pType + " = "+newProduct.price);
		}
		
	}
}
