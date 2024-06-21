package com.skilldistillery.makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		//TODO - CREATE SCANNER
		// TODO - PROMPT FOR INPUTS
		// NOW COMMDAND S AND IT'S SAVED
		Scanner Keyboard = new Scanner(System.in);
		
		System.out.println("Enter the price; ");
		double price = Keyboard.nextDouble ();
		System.out.println("Price: " + price);
		
		
		Keyboard.close();
	}

}
