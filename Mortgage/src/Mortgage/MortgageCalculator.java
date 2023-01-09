package Mortgage;
import java.util.Scanner;
import java.util.InputMismatchException; 

public class MortgageCalculator {
	
	static double loanAmount;
	static double annualInterestRate;
	static double numberOfYears;
	static double monthlyInterestRate;
	static double mortgage;
	static double calculateMortgage;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		welcomeMessage();
		Scanner in = new Scanner(System.in);
		loanAmount = UserInput(in, "Enter the loan amount: ");
		annualInterestRate = UserInput(in, "Enter the annual interest rate (e.g., 7.25): ");
		numberOfYears = UserInput(in, "Enter the number of years: ");
		mortgage = calculateMortgage(loanAmount, annualInterestRate, numberOfYears);
		System.out.println("The mortgage is $" + mortgage);
		
		
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
		return monthlyInterestRate = annualInterestRate / 1200;
		
	}
	
	public static double calculateMortgage(double loanAmount, double hmonthlyInterestRate, double numberOfYears) {
		// Calculate the mortgage
		// mortgage = loanAmount * monthlyInterestRate / (1 -
	    //  (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
		return mortgage = loanAmount * monthlyInterestRate / (1 -
			      (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
	}
	//
	//public static void CastingBmi(Scanner in, double bmi)  {
	//	System.out.println("Round your BMI? If answer yes, you should write 1, if no - 0");  
	//	// Casting int to double
	 //   int question = in.nextInt();
	 //   // ask user how value show for him
	//    if (question == 1) {
	//	      int intBmi = (int) bmi;
	//	      System.out.println("Your BMI is " + intBmi);
	//	      return;
	  //  }
	//    if(question == 0) {
	//      System.out.println("Your BMI is " + bmi);
	 //   }
	  //  return;
	//}

}
