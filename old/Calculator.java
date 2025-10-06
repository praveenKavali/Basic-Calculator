import java.util.Scanner;

public class Calculator {

	private int addition(int i, int j) {
		return (i+j);
	}

	private int subtraction(int i, int j) {
		return (i-j);
	}

	private int multiplication(int i, int j) {
		return (i*j);
	}

	private void division(int i, int j) {
		if(j == 0) {
			System.out.println("Cannot divide by 0");
		} else {
			System.out.println("result: " + (double)i/j);
		}
	}

	private double power(int i, int j) { 
		return Math.pow(i, j);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Calculator calculate = new Calculator();

		System.out.println("Enter \"end\" to stop\nyou have to enter in the following manner 4, 5, +");
		while(true) {     // we can exit loop by entering "end" word
			String value = input.next();

			if(value.equals("end")){
				break;
			}

			try {
				int i = Integer.valueOf(value);//here we convert string value to integer

				int j = input.nextInt();
				System.out.println("Enter the operation you want to perform (+,-,*,/,^): ");
				String operation = input.next();

				switch(operation) {
				case "+":
					System.out.println("result: " + calculate.addition(i, j));
					break;

				case "-":
					System.out.println("result: " + calculate.subtraction(i, j));
					break;

				case "*":
					System.out.println("result: " + calculate.multiplication(i, j));
					break;

				case "/":
					calculate.division(i, j);
					break;

				case "^":
					System.out.println("result: " + calculate.power(i, j));
					break;

				default:
					System.out.println("calculation is not possible");
				}
			} catch(Exception e) {
				System.out.println("Enter a valid number");
			}
		}
		input.close();
	}

}
