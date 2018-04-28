package com.kamotelabs.junit4;

import java.util.Arrays;

import org.junit.Test;

public class PerformanceTest {
	
	@Test(timeout=100)
	public void testSort_Performance() {
		
		int array[] = {12,23,4};
		
		for(int i = 1;  i <= 1_000_000; i++) {
			array[0] = i;
			Arrays.sort(array);
		}
		
	}

}
