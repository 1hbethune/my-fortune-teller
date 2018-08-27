import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your first name? ");
		String name = input.nextLine();
		System.out.println("Thank you. What is your last name?");
		String name2 = input.nextLine();
		
		
		System.out.println("What is your age? ");
		int age = input.nextInt(); 
		input.nextLine();
		System.out.println("Please enter your birth month, as a number.");
		int month = input.nextInt(); 
		input.nextLine();
		System.out.println("What is your favorite ROYGBIV color. If you do not know what ROYGBIV is, please type HELP.");
		String response = input.nextLine();
		String color;
		while (response.toLowerCase().equals("help")) {
			  System.out.println("ROYGBIV colors are as follows: Red, Orange, Yellow, Green, Pink, and Violet. " + "Please choose a ROYGBIV color.");
			  System.out.println("Please enter your favorite color.");
			 response = input.nextLine();
			
			} color = response;	
	
		
		System.out.println("How many siblings do you have? ");
		int siblings = input.nextInt(); 
		
		String retireResult;
		if (age % 2 == 0) {
		retireResult = "15 years";
			} else {
				retireResult = "20 years";
			}
		
		String numSiblings = null; 
		if (siblings == 0) {
			numSiblings = "Miami, FL";
    		} else if (siblings == 1) {
    			numSiblings = "Washington D.C.";
    		} else if (siblings == 2) {
    			numSiblings = "Nassau, Bahamas";			
    		} else if (siblings == 3) {
    			numSiblings = "New Orleans, LA";
      		} else if (siblings > 3) {
      			numSiblings = "Paris France";      			
      		} else if (siblings < 0) {
      			numSiblings = "The Frozen Tundra";
      					
      		}
	
		String carColor = null; 
		if (color.equalsIgnoreCase("Red")) {
			carColor = "Ferrari";
		} else if (color.equalsIgnoreCase("Orange")) {
			carColor = "Lamborghini";
		} else if (color.equalsIgnoreCase("Yellow")) {
			carColor = "Volkswagon Beetle";
		} else if (color.equalsIgnoreCase("Green")) {
			carColor = "Maserati";
		} else if (color.equalsIgnoreCase("Pink")) {
			carColor = "Hovercraft";
		} else if (color.equalsIgnoreCase("Violet")) {
			carColor = "Spaceship";
		}
		
		String retireFund = null;
		if (month <= 4) {
			retireFund = "$500,000";
		} else if (month <= 8) {
			retireFund = "$1,000,000";
		} else if (month <= 12) {
			retireFund = "$100,000"; 
		} else if (month > 12) {
			retireFund = "$0.00"; 
		}
		
		System.out.println(name + " " + name2 + " will retire in " + retireResult + " with " + retireFund + " in the bank, a vacation home in "
				+ numSiblings + ", and travels by " + carColor);
	
	}
	
}
