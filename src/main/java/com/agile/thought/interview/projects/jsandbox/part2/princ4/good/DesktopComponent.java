package com.agile.thought.interview.projects.jsandbox.part2.princ4.good;

public class DesktopComponent implements NonTouchUIComponent {

	public void mouseover(String event) {
		System.out.println("Mouse click Event Fired");

	}

	public void validate() {
		System.out.println("All UI is valid");
		
	}

}
