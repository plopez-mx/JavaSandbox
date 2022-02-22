package com.agile.thought.interview.projects.jsandbox.part2.princ3.good;

public class DotMatrixPrinterPrinter implements Printer {
	private String inc;

	public String getInc() {
		return inc;
	}

	public void setInc(String inc) {
		this.inc = inc;
	}
	
	

	public void print(String text){
		System.out.println(text);
	}
	
}
