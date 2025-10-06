import java.util.Scanner;

public class Calculator {



	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter \"end\" to stop\nyou have to enter in the following manner 4, operator(+,-..), 5");
		while(true) {     // we can exit loop by entering "end" word
			String value = input.next();

			if(value.equals("end")){
				break;
			}

			try {
				int i = Integer.valueOf(value);//here we convert string value to integer

				System.out.println("Enter the operation you want to perform (+,-,*,/,^,!): ");
				String operation = input.next();

				if(operation.equals("!")) {
					Calculation c = new Calculation(i, 0);
					System.out.println(c.factorial());
				} else {
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
					case "^":
						System.out.println("Result: " + calculation.power());
						break;
					default:
						System.out.println("calculation is not possible");
						break;
					}

				}
			} catch(Exception e) {
				System.out.println("Enter a valid number");
			}
		}
		input.close();
	}

}
