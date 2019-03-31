package com.ananya.mockito;

public class SomeBusinessImpl {
	private DataService dataService;

	public SomeBusinessImpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}

	int findGreatest() {
		int[] data = dataService.retrieveAllData();
		int max = Integer.MIN_VALUE;
		for (int num : data) {
			if (num > max) {
				max = num;
			}
		}
		return max;
	}

}
