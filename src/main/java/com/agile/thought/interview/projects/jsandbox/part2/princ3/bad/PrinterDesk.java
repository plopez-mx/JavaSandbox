package com.agile.thought.interview.projects.jsandbox.part2.princ3.bad;

public class PrinterDesk {
	private DotMatrixPrinterPrinter printer;

	public PrinterDesk(DotMatrixPrinterPrinter printer) {
		super();
		this.printer = printer;
	}
	
	
	public void printFile(){
		printer.print("File Content");
	}
	
}
