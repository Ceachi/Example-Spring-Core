package com.example.exemplu3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.exemplu2.Point;
import com.example.exemplu2.Triangle4;

@SpringBootApplication
public class Exemplu3 {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring2.xml");
		
		Circle circle = (Circle) applicationContext.getBean("circle");
		
		
		System.out.println(circle);
	}
}
