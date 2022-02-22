package com.agile.thought.interview.projects.jsandbox.part2.princ3.good;

public class PrinterDesk {
	private Printer printer;

	public PrinterDesk(Printer printer) {
		super();
		this.printer = printer;
	}
	
	
	public void printFile(){
		printer.print("File Content");
	}
	
}
