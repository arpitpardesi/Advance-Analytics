package com.zensar.day8.junit;

import org.junit.Test;

import junit.framework.Assert;

public class TestLogic3 {

	@Test
	public void testMax() {
		int result = Calculation.findMax(new int[] { -6,-4,-9,-1 });
		Assert.assertEquals(-1, result); 
	}
}
