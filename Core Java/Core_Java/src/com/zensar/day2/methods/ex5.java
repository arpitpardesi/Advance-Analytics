package com.zensar.day2;

public class ex5 {
	public static int myMethod(int x) {
        int square = x*x;
        return square;
    }
    
    public static void main(String[] args) {
        int result = myMethod(5);
        System.out.println(result);
    }
}
