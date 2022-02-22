package com.agile.thought.interview.projects.jsandbox.part2.princ2.good;

public class ElectrnicDevice extends Product{

	@Override
	public double calculateTaxIncludedPrice() {
		
		return getBasePrice()*1.18;
	}

}
