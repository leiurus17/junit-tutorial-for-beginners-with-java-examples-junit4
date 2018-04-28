package com.kamotelabs.junit4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.kamotelabs.helper.StringHelper;

public class StringHelperTest {
	
	StringHelper helper = new StringHelper();

	@Test
	public void testTruncateAInFirstTwoPositions_AAinFirst2Positions() {
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
	}
	
	@Test
	public void testTruncateAInFirstTwoPositions2_AinFirstPosition() {
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}

}
