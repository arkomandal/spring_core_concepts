package com.normalway;

public class Mobile {
	public static void main(String args []) {
		System.out.println("hello world");
		Sim sim = new Airtel();
		System.out.println(sim.getCalling());
	}
}