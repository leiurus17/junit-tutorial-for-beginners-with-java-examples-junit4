package com.kamotelabs.junit4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.kamotelabs.helper.StringHelper;

public class StringHelperTest {

	@Test
	public void test() {
		
		StringHelper helper = new StringHelper();
		String actualValue = helper.truncateAInFirst2Positions("AACD");
		
		// expected, actual
		assertEquals("CD", actualValue);
		
	}

}
