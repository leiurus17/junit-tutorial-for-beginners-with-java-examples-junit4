package com.kamotelabs.junit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
	
	@Test
	public void areFirstAndLastTwoCharactersTheSameTest_BasicNegativeTesting() {
		// "Dummy String" will appear if the test fails
		assertFalse("Dummy String", helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	
	@Test
	public void areFirstAndLastTwoCharactersTheSameTest_BasicPositiveTesting() {
		// "Dummy String" will appear if the test fails
		assertTrue("Dummy String", helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
	
	@Test
	public void areFirstAndLastTwoCharactersTheSame_OneCharacterOnly() {
		assertFalse("Dummy String", helper.areFirstAndLastTwoCharactersTheSame("A"));
	}
	
	@Test
	public void areFirstAndLastTwoCharactersTheSame_TwoCharacters() {
		assertTrue("Dummy String", helper.areFirstAndLastTwoCharactersTheSame("AB"));
	}

}
