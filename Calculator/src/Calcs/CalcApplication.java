package Calcs;

import java.util.Scanner;

public class CalcApplication {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Please enter the first digit");
		String num1 = scanner.nextLine();
		double operand1 = Double.parseDouble(num1);
		
		while (true) {
		
			System.out.println("Please enter the operator (+, -, *, /)");
			String operator = scanner.nextLine();
		
					
			System.out.println("Please enter another digit");
			String num2 = scanner.nextLine();
			double operand2 = Double.parseDouble(num2);
			
			double result = 0;
			
			CalcMethod calc = new CalcMethod(operand1, operand2);
			
			switch(operator) {
			case "+":
				result = calc.addition();
				
				break;
			case "-":
				result = calc.subtraction();
				
				break;
			case "*":
				result = calc.subtraction();
				
			case "/":
				result = calc.division();
				
				break;
			default:
				System.out.println("Please enter a valid operator");
				continue;
		
			}
			
			System.out.println("The result is: " + result);
			
			while (true) {	
				
				System.out.println("Do you wish to continue? (y/n)");
				String answer = scanner.nextLine();
			
			
				if (answer.equals("y")) {
					operand1 = result;
					break;
				} else if (answer.equals("n")) {
					System.out.println("Thank you for using my calculator!");
					scanner.close();
					System.exit(0);
				} else {
					System.out.println("Invalid entry");
					continue;
				}
			}
		}
	}
}