package com.ananya.springusingspringboot.Basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm{

	public BubbleSortAlgorithm() {
		System.out.println("Bubble Sort Algo");
	}
	
	public int[] sort(int[] numbers) {
		return numbers;
	}
}
