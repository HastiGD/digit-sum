import java.util.Scanner; // Import Scanner class

/*
 * The DigitSum class contains the static method addDigits() which calculates the sum of the individual
 * digits in an integer provided by the user. 
 */

public class DigitsSum {
	static int sum = 0; // initializing the counter 

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in); // Create a scanner object
		System.out.println("Enter an integer who's digits you would like to sum"); // Ask user for their number
		int userNum = myScanner.nextInt(); // Read user input
		addDigits(userNum); // calls addDigits() and passes the users input as an argument
		System.out.println("The sum of the digits is " + sum); // prints the sum of the digits
	}
	
	private static int addDigits(int num) { // this method adds the digits in the integer "num"
		int lastDigit = num%10; // lastDigit is the last digit in num
		sum = sum + lastDigit; // lastDigit is added to sum
		int newNum = num/10; // lastDigit is removed from num
		
		if (num == 0) // condition which must be met to end recursion
			return sum;
		
		else 
			return addDigits(newNum); //recursive call	
	}
}
