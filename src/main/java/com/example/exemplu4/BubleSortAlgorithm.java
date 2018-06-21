package com.example.exemplu4;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BubleSortAlgorithm implements SortAlgorithm {

		@Override
		public int[] sort(int [] numbers) {
			return numbers;
		}
}
