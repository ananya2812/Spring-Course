package com.ananya.springusingspringboot.Basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm{

	public QuickSortAlgorithm() {
		System.out.println("Quick Sort Algo");
	}

	public int[] sort(int[] numbers) {
		return numbers;
	}
}
