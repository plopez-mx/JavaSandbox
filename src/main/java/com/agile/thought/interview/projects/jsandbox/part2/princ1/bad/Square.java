package com.agile.thought.interview.projects.jsandbox.part2.princ1.bad;

public class Square extends Rectangle{
	
	@Override
	public void setHeight(double height) {
		super.setHeight(height);
		super.setWidth(height);
	}
	
	@Override
	public void setWidth(double width) {
		super.setHeight(width);
		super.setWidth(width);
	}

}
