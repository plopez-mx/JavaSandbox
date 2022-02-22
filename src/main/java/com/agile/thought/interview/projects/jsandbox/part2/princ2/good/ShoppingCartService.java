package com.agile.thought.interview.projects.jsandbox.part2.princ2.good;

import java.util.List;

public class ShoppingCartService {
	
	public double calculateTotalOrder(List<Product> products){

		
		double orderTotal = 0;
		
		
		for (Product product : products) {
			
			
			orderTotal+=product.calculateTaxIncludedPrice();
		}
		
		return orderTotal;
	}

}
