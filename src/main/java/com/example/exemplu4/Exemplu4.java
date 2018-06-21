package com.example.exemplu4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class Exemplu4 {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Exemplu4.class, args);
		
		int [] numbers = {1,2,3,4,5};
		
		BinarySearchImpl binarySearch = (BinarySearchImpl) context.getBean("binarySearchImpl");
		
		System.out.println(binarySearch.sort(numbers, 3));
	
	}

}
