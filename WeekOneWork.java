package com.sri.WeekOneWork;

public class WeekOneWork {

	public static void main(String[] args) {
		/* 
		 * This program is the Java Week1 coding assignment effort
		 * Author: Sridharan (Sri) Srinivasan - student
		 * Today's date: 09/15/2020
		 */
		
		/*
		 * The following 7 variables are declared and values are assigned.
		 * Only two (2) variable types (int and String) are used per assignment instructions.
		 * These variables are used in subsequent steps.
		 */
		int itemPrice = 40;
		int moneyInWallet = 100;
		int numFriends = 186;
		int myAge = 62;
		String firstName = "Sri";
		String middleInitial = "S";
		String lastName = "Srinivasan";
		
		/*
		 * The next three variables are declared to assist in operations 
		 */
		
		int moneyLeftInWallet;  //float type used can accommodate decimals
		int friendsPerYear;		//float type used can accommodate decimals for fraction results
		String myFullName;
		
		/* 
		 * The following section performs the operation on money spent on an item and displays the amount left in the wallet.
		 */
		
		System.out.println("Price of Item: $" +itemPrice);
		System.out.println("Money in Wallet: $" + moneyInWallet);
		// System.out.println("New amount of money in wallet: $" + (moneyInWallet - itemPrice));
		System.out.println();		//Prints a blank line
		
		moneyLeftInWallet = moneyInWallet - itemPrice;	//Subtraction
		System.out.println("New amount of money left in wallet after buying item: $" + moneyLeftInWallet);
		
		System.out.println();		//Prints a blank line
		System.out.println();		//Prints a blank line
		/* 
		 * The following section performs the operation to calculate number of friends per year.
		 */
		
		System.out.println("Total number of friends I have: " + numFriends);
		System.out.println("My age now is: " + myAge);
		//System.out.println("Number of Friends I made per year: "+ (numFriends / myAge));
		System.out.println();
		
		friendsPerYear = numFriends / myAge;	//Division
		System.out.println("Number of Friends I have made per year so far in life: "+ friendsPerYear);
		
		System.out.println();		//Prints a blank line
		System.out.println();		//Prints a blank line
		/* 
		 * The following section performs the operation to show 
		 * the full name based on the first, middle and last name assigned.
		 * Though I do not have a middle initial or middle name, I have used "S" for this program exercise.
		 */
		
		System.out.println("My First Name is: "+ firstName );
		System.out.println("My Middle Name is: " + middleInitial);
		System.out.println("My Last Name is: " + lastName);
		// System.out.println("My Full Name is: " + firstName + " " + middleInitial + ". " + lastName);
		
		System.out.println();		//Prints a blank line
		myFullName = firstName + " " + middleInitial + ". " + lastName;  //Concatenation
		System.out.println("My Full Name is: " + myFullName);

	}

}
