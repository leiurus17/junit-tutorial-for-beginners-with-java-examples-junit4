package com.kamotelabs.junit4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.kamotelabs.helper.StringHelper;

public class StringHelperTest {

	@Test
	public void testTruncateAInFirstTwoPositions() {
		StringHelper helper = new StringHelper();
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
	}
	
	@Test
	public void testTruncateAInFirstTwoPositions2() {
		StringHelper helper = new StringHelper();
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}

}
