package day22_leb;

public class Ques_2 {
	public static void main(String[] args) {
		
		/*
		 
Create a method that accepts two strings, a and b, return the result of putting them together in the 
order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
makeAbba("Hi", "Bye") → "HiByeByeHi" makeAbba("Yo", "Alice") → "YoAliceAliceYo" makeAbba("What", "Up") → "WhatUpUpWhat"
		 */
		
		String s=makeAbba("Hi", "Bye") ;
		System.out.println(s);
		
		
	}

	private static String makeAbba(String a, String b) {
		String c=a.concat(b).concat(b).concat(a);
		return c;
		
	}

}
