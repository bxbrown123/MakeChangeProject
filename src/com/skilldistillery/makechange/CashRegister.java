package com.skilldistillery.makechange;
import java.util.Scanner;
public class CashRegister {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in); 
		
//User Story #1-The user is prompted asking for the price of the item.
		System.out.println("How much is the item?");        
		double cost = userInput.nextDouble ();              
//User Story #2-The user is then prompted asking how much money was tendered by the customer.
		System.out.println("How much are you paying?");     
		double payment = userInput.nextDouble ();		  

		// if  customer gives exact amount
		if(payment == cost) 
		{System.out.println("Thank you for your purchase!");} // Say thank you.
		// if customer gives less than the amount
		else if (payment < cost) 
		{System.err.println("You have provided insufficient funds.");} // This is an error.
		else { 
		double changeDue = (payment - cost); 
		System.out.println(changeDue);
		 
		if (changeDue >= 20){
			int counter = (int)(changeDue / 20);
			changeDue -= counter * 20;
			System.out.println("change due in twenties " + counter );
		}
		
		if (changeDue >= 10){
			int counter = (int)(changeDue / 10);
			changeDue -= counter * 10;
			System.out.println("change due in tens " + counter );
		}
		
		if (changeDue >= 5){
			int counter = (int)(changeDue / 5);
			changeDue -= counter * 5;
			System.out.println("change due in five " + counter );
		}
		
		if (changeDue >= 1){
			int counter = (int)(changeDue / 1);
			changeDue -= counter * 1;
			System.out.println("change due in ones " + counter );
		}
		
		if (changeDue >= .25){
			int counter = (int)(changeDue / .25);
			changeDue -= counter * .25;
			System.out.println("change due in quarter " + counter );
		}
		
		if (changeDue >= .10){
			int counter = (int)(changeDue / .10);
			changeDue -= counter * .10;
			System.out.println("change due in dime " + counter );
		}
		
		if (changeDue >= .05){
			int counter = (int)(changeDue / .05);
			changeDue -= counter * .05;
			System.out.println("change due in nickels " + counter );
		}
		
		if (changeDue >= .01){
			int counter = (int)(changeDue / .01);
			changeDue -= counter * .01;
			System.out.println("change due in pennies " + counter );
		} 
		 
		 //{ if (changeDue / 20)                        //the denom answer / 20 then previous answer/ 10	
		}		
		userInput.close();	
			
		}
			
}
		
//		else if (payment > cost);
//		{ double twenty = 20.00, ten = 10.00, five = 5.00, one = 1.00, quarter = .25, nickel = .05, penny = 0.01; 
//	//handTwenty = , handTen = 0.0, handFive = 0.0 , handOne = 0.0, handQuarter = 0.0, handNickel = 0.0, handPenny = 0.0;
//		double change = (payment - cost);  // payment 30.50 - cost 20.00
//		if (change % 20 == 0);
//		
	
			
	
		
//		double changeDue = (payment - cost);  // payment 30.50 - cost 20.00
//		 if  (changeDue / 20 >=1);
//		{System.out.println("your change is " + changeDue);}
//		if  (changeDue / 10 >=1);
//		{System.out.println("your change is " + changeDue);}
//		
//			
				
		
			
			
	 
		
		
		
		//User Story #4-If the amount tendered is more than the cost of the item, display the number of bills and coins that should be given to the customer. 			
//		{System.out.println( payment - cost);} // place holder until formula. step 2  30 dollars
//		
//		changeDue = (payment - cost); // go through each line until you give all that you owe
//		 if (changeDue / 20 >= 1) {
//		int bills  = (int)(changeDue/20) //we are using int for typecast change to int we want a whole number
//			changeDue = (changeDue - 20); // not hard coding you are doing bills x 20 and we'll be repeating the formula from earlier with the rest
		 
		//run this first before you go to next sections
		 //if (changeDue / 10 >= 1
		 //if (ChangeDue / 05  >=1
		 //if (ChangeDue / 01 >=1
		// if ChangeDue / .25 >=1
		//if ChangeDue / .10 >=1
		// if ChangeDue / .05 >=1
		 //if ChangeDue / .01 >=1
//User Story #3-Display an appropriate message if the customer provided too little money.//System.err.println("You have provide insufficient funds.");
		
//User Story #3a-Display an appropriate message if the customer provided the exact amount.	//System.out.println("Thank you for your purchase!");
		
		
	
	


	 
// Step 1 do i need to give change? line 19
// Step 2 figure how much is total change  line 21
// step 3 figure out how many of each bill/coin to give line 24

//Overview
//In the cash register we will calculate the amount of change returned to a customer based on the purchase price and the amount tendered. 
//We will also notify the attendant how many of each type of currency ($20 ,$10 ,$5 ,$1, .25c, .10c, .05c, .01c) is needed to make the 
//change for the customer.
//Change will be provided using a combination of the largest bill and coin denominations as possible.
//Denominations that are not used will not be displayed.Hint: Mod operator

//Denominations that are not used will not be displayed.
//Grading
//This is a graded project. You are to have your project completed and pushed to Git by 0830 on Monday morning.
//If the code:
//meets all stated requirements by the due date, you will receive 1 point.
//meets most of the stated requirements by the due date, you may receive .5 point.
//does not meet the stated requirements by the due date, you may receive 0 points.
//Here are example test conditions:
//
//Amount: .67, Tendered: .50, Result: Error message
//Amount: .67, Tendered: 1.00, Result: 1 quarter, 1 nickel, 3 pennies.
//Amount: .59, Tendered: 1.00, Result: 1 quarter, 1 dime, 1 nickel, 1 penny.
//Amount: 3.96, Tendered: 20.00, Result: 1 ten dollar bill, 1 five dollar bill, 1 one dollar bill, 4 pennies.
//Amount: any amount less than 20.00, Tendered: anything greater than amount: correct denominations for correct change.
//If the project receives 0 points, resubmission for potential partial credit may, at the discretion of the instructor, be granted. 
//Ignored assignments are given 0 points with no possibility for resubmission.
//To turn in a project, you must push it to a GitHub repository named MakeChangeProject. You must include a README.md describing how to run your program.
//---------------------------------------------------------------------------
// What I need to do. You don’t have to use everything you've learned up until this point. Just get the answer.
// You don’t need loops or can use loops for this. 
// I need questions and get answers using a system.out.println and a scanner.
// I need if and else if statrments for Thank you and error lines otherwise it'll pop up by default.
// Figure out a formula for giving change back.
// What can I use? Switch, if/else, mod, typecasting, method,


