package SmallProjects;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter \"end\" to stop\nyou have to enter first number, operator(+,-..) and secoond number(if requaired)");
		
		while(true) {     // we can exit loop by entering "end" word
			
			System.out.println("Enter first number:");
			String value = input.next();

			if(value.equals("end")){
				break;
			}

			try {
				int i = Integer.valueOf(value);//here we convert string value to integer

				System.out.println("Enter the operation you want to perform (+,-,*,/,%,x,^,!,Σ): ");
				/*
				 * using + operator we can add two numbers.
				 * using - operator we can subtract two numbers. 
				 * using * operator we can multiply two numbers. 
				 * using / operator we can divide two numbers.
				 * using % operator we can get remainder after divide two numbers.
				 * using x we can get the multiplication table for first number.
				 * using ^ we can find the power value of the first number.
				 * using ! we can find the factorial of the first number. you can find factorial upto 20
				 * using Σ we can find the sum of the all natural numbers from 1 to the enter number(to enter Σ use alt + 228)
				 */				
				String operation = input.next();
				
				if(operation.equals("!") || operation.equals("x") || operation.equals("Σ")) {
				    Operations(i, operation);
				    
				} else {
					System.out.println("Enter second number:");
					int j = input.nextInt();

					Calculation calculation = new Calculation(i, j);

					switch(operation) {
					case "+":
						System.out.println("Result: " + calculation.addition());
						break;
					case "-":
						System.out.println("Result: " + calculation.subtraction());
						break;
					case "*":
						System.out.println("Result: " + calculation.multiplication());
						break;
					case "/":
						calculation.division();
						break;
					case "%":
						System.out.println("Result: " + calculation.module());
						break;
					case "^":
						System.out.println("Result: " + calculation.power());
						break;
					default:
						System.out.println("calculation is not possible");
						break;
					}
				}
				System.out.println("------------");

				
			} catch(Exception e) {
				System.out.println("Enter a valid number");
			}
		}
		
		input.close();
	}

	public static void Operations(int i, String s) {
		Calculation c = new Calculation(i, 0);
		
		switch(s) {
		case "!":
			System.out.println(c.factorial());
			break;
		case "x":
			c.tables();
			break;
		case "Σ":
			System.out.println("Result: " + c.naturalNumberSum());
			break;
		}
	}

}
