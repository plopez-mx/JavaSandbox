package com.agile.thought.interview.projects.jsandbox;

import com.agile.thought.interview.projects.jsandbox.part1.MyPublicClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApp {

	public static void main(String[] args) {
		//SpringApplication.run(MainApp.class, args);
		MyPublicClass.main(args);
	}

}
