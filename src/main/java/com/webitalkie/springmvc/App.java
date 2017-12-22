package com.webitalkie.springmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
	
    public static void main( String[] args ) {
    	
        System.setProperty("server.port", "8080");
        SpringApplication.run(App.class,  args);
    }
}
