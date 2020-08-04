package com.zensar.day8.junit;

import org.junit.Test;

import junit.framework.Assert;

public class TestLogic2 {

	@Test
	public void testMax() {
		int result = Calculation.findMax(new int[] { 5, 7, 1, 8, 3 });
		Assert.assertEquals(8, result);
	}
}
