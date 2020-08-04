package com.zensar.day3.innerClass;

public class test {
	public static void main(String[] args) {
		Ext ext = new Ext();
		System.out.println(ext.a);
		
		Ext.Internal internal = ext.new Internal();
		System.out.println(internal.b);
	}
}
