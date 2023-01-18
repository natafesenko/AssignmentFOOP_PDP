package Mortgage;
import java.util.Scanner;
import java.util.InputMismatchException; 

public class MortgageCalculator {

	public static void main(String[] args) {
		double loanAmount;
		double annualInterestRate;
		double numberOfYears;

		// TODO Auto-generated method stub
		welcomeMessage();
		Scanner in = new Scanner(System.in);
		loanAmount = UserInput(in, "Enter the loan amount: ");
		annualInterestRate = UserInput(in, "Enter the annual interest rate (e.g., 00.0725): ");
		numberOfYears = UserInput(in, "Enter the number of years: ");
		double mortgage = calculateMortgage(loanAmount, annualInterestRate, numberOfYears);
		System.out.println("The mortgage is $" + mortgage);	
		System.out.println("Thank you for using my mortgage calculator!");	
	}
	
	public static void welcomeMessage() {
		//welcome message
		System.out.println("░█░░░█░█▀▀░█░░█▀▄░▄▀▀▄░█▀▄▀█░█▀▀░░░▀█▀░▄▀▀▄\n"
				+ "░▀▄█▄▀░█▀▀░█░░█░░░█░░█░█░▀░█░█▀▀░░░░█░░█░░█\n"
				+ "░░▀░▀░░▀▀▀░▀▀░▀▀▀░░▀▀░░▀░░▒▀░▀▀▀░░░░▀░░░▀▀░"
				+ "");
		System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄\n"
				+ "█░▄▀▄░█▀▄▄▀█░▄▄▀█▄░▄█░▄▄▄█░▄▄▀█░▄▄▄█░▄▄███▀▄▀█░▄▄▀█░██▀▄▀█░██░█░██░▄▄▀█▄░▄█▀▄▄▀█░▄▄▀\n"
				+ "█░█▄█░█░██░█░▀▀▄██░██░█▄▀█░▀▀░█░█▄▀█░▄▄███░█▀█░▀▀░█░██░█▀█░██░█░██░▀▀░██░██░██░█░▀▀▄\n"
				+ "█▄███▄██▄▄██▄█▄▄██▄██▄▄▄▄█▄██▄█▄▄▄▄█▄▄▄████▄██▄██▄█▄▄██▄███▄▄▄█▄▄█▄██▄██▄███▄▄██▄█▄▄\n"
				+ "▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀\n"
				+ "");
	}
	
	public static double UserInput(Scanner in, String question) {
	    // work with user input
	    double output;
	    while (true) {
	      try {
	        System.out.println(question);
	        // initial with user input
	        output = in.nextDouble();
	        System.out.println("Thank you!");
	        // processing the error
	      } catch (InputMismatchException ex) {
	        System.out.println("Error in your input");
	        // resets this scanner
	        in.reset();
	        in.nextLine();
	        continue;
	      }
	      //check that the input value is not 0
	      
		      if (Double.doubleToRawLongBits(output) <= 0) {
		        System.err.println("You must provide a correct input(double precision float)");
		        continue;
		      }
		      break;
		    }
		    return output;
		  }
	public static double monthlyInterestRate(double annualInterestRate) {
		// Calculate the monthly interest rate
		// monthlyInterestRate = annualInterestRate / 1200;
		return annualInterestRate / 1200;
	}
	
	public static double calculateMortgage(double loanAmount, double monthlyInterestRate, double numberOfYears) {
		// Calculate the mortgage
		// mortgage = loanAmount * monthlyInterestRate / (1 -
	    //  (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
		return loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
	}
}
