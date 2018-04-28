package com.kamotelabs.junit4;

import static org.junit.Assert.assertNull;

import java.util.Arrays;

import org.junit.Test;

public class NullTest {
	
	@Test(expected=NullPointerException.class)
	public void testArraySort_NullArray() {
		int[] numbers = null;
		Arrays.sort(numbers);
		
		assertNull(numbers);
	}

}
