package com.zensar.day8.junit;

import org.junit.Assert;

import org.junit.Test;

public class TestLogic {  
	  
    @Test  
    public void testFindMax(){  
        Assert.assertEquals(2,Calculation.findMax(new int[]{1,3,4,2}));  
     // Assert.assertEquals(-1,Calculation.findMax(new int[]{-12,-1,-3,-4,-2}));  
    }  
}  