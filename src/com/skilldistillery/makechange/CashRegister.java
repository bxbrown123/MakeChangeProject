package com.skilldistillery.makechange;
import java.util.Scanner;
public class CashRegister {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		//double cost = 0.0;
		//double payment = 0.0;
		//double number = 0.0;
		
//User Story #1-The user is prompted asking for the price of the item.
		System.out.println("How much is the item?");        // Question.
		double cost = userInput.nextDouble ();              // Answer.
//User Story #2-The user is then prompted asking how much money was tendered by the customer.
		System.out.println("How much are you paying?");     // Question.
		double payment = userInput.nextDouble ();		    // Answer.
//User Story #3-Display an appropriate message if the customer provided too little money.
		//System.err.println("You have provide insufficient funds.");
//User Story #3a-Display an appropriate message if the customer provided the exact amount.	
		//System.out.println("Thank you for your purchase!");
//User Story #4-If the amount tendered is more than the cost of the item, display the number of bills and coins that should be given to the customer. 		
		if (payment > cost) 
		{System.out.println("There's a snake in my boot.");} // place holder until formula.
		else if (payment < cost) 
		{System.err.println("You have provided insufficient funds.");} // This is an error.
		else if (payment == cost) 
		{System.out.println("Thank you for your purchase!");} // Say thank you.
		userInput.close();
	}
}


//Overview
//In the cash register we will calculate the amount of change returned to a customer based on the purchase price and the amount tendered. 
//We will also notify the attendant how many of each type of currency ($20 ,$10 ,$5 ,$1, .25c, .10c, .05c, .01c) is needed to make the change for the customer.
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


