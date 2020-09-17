package com.sri.WeekOneWork;

public class WeekOneWork {

	public static void main(String[] args) {
		/* 
		 * This program is the Java Week1 coding assignment effort
		 * Author: Sridharan (Sri) Srinivasan - student
		 * Today's date: 09/17/2020
		 */
		
		/*
		 * The following 10 variables are declared and values are assigned.
		 * These variables are used in subsequent steps.
		 */
		double itemPriceApple = 1.99;	//cost of apple
		double itemPricePear = 1.29;		//cost of pear
		double moneyInWallet = 100.00;		//initial amount in wallet
		int numHomeFriends = 186;		//number of friends of family thus far
		int numWorkFriends = 2400;		//number of friends over working years
		int numberYearsWorked = 35;		//number of years worked
		int myAge = 62;					//age in number of years
		String firstName = "Sri";		//First name
		String middleInitial = "S";		//Middle Initial
		String lastName = "Srinivasan";	//Last Name
		
		/*
		 * The next five variables are declared to assist in operations 
		 */
		
		double totalItemCost;		//used to track total spent on items
		double moneyLeftInWallet;	//used to track money left in wallet
		double homeFriendsPerYear;	//used to compute friends of family made per year of life thus far
		double workFriendsPerYear;	//used to compute friends made at work per year of life
		String myFullName;
		
		/* 
		 * The following section performs the operation on money spent on an item and displays the amount left in the wallet.
		 */
		
		System.out.println("Price of Apple: $" +itemPriceApple);
		System.out.println("Price of Pear: $" +itemPricePear);
		System.out.println("Money in Wallet: $" + moneyInWallet);
		
		System.out.println();		//Prints a blank line
		
		totalItemCost = ((5 * itemPriceApple) + (4 * itemPricePear));	//  assuming I bought 5 apples and 4 pears, performs multiply and add
		moneyLeftInWallet = (moneyInWallet - totalItemCost);		//Subtraction
		System.out.println("New amount of money left in wallet after buying items: $" + moneyLeftInWallet);
		
		System.out.println();		//Prints a blank line
		System.out.println();		//Prints a blank line
		
		/* 
		 * The following section performs the operation to calculate number of friends per year for family.
		 */
		
		System.out.println("Total number of Friends of the family I have: " + numHomeFriends);
		System.out.println("My age now is: " + myAge);
		
		System.out.println();
		
		homeFriendsPerYear = (numHomeFriends / myAge);	//Division computes friends per year of age
		System.out.println("Number of Friends of the family I have made per year so far in life: "+ homeFriendsPerYear);
		
		System.out.println();		//Prints a blank line
		System.out.println();		//Prints a blank line
		
		/* 
		 * The following section performs the operation to calculate number of friends per year at work.
		 */
		
		System.out.println("Total number of Friends I have made at work: " + numWorkFriends);
		System.out.println("Number of years I have worked so far: " + numberYearsWorked);
		
		System.out.println();
		
		workFriendsPerYear = (numWorkFriends / numberYearsWorked);	//Division computes friends per year at work
		System.out.println("Number of Friends I have made per year so far at work: "+ workFriendsPerYear);
		
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
