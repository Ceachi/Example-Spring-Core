package com.example.exemplu4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component("binarySearchImpl")
public class BinarySearchImpl {

	@Autowired
	SortAlgorithm sortAlgorithm;
	
	public int sort(int [] numbers, int x) {
		// diferiti algorithmi
		
		sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		
		return 3;
	}
}
