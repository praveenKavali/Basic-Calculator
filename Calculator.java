import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("enter first number :");
		int num1 = scanner.nextInt();         //here you can enter first number
		System.out.println("enter second number :");
		int num2 = scanner.nextInt();         //here you can enter second number
		System.out.println("enter the operator(+, -, *, /):");
		String operation = scanner.next();    //here you can enter the operator(Which  mathmatical operation you want to perform)

		switch(operation) {
		case "+" :
			int add = num1+num2;   
			System.out.println(add);
			break;
		case "-" :
			int sub = num1-num2;
			System.out.println(sub);
			break;
		case "*" :
			int mul = num1 * num2;
			System.out.println(mul);
			break;
		case "/" :
			if(num2 != 0) {
				System.out.println((double)num1/num2);
			} else {
				System.out.println("Error: Division by zero is not allowed.");
			}
			break;

		default :     //if you enter the any key other than +, -, *, / then you cannot perform mathmatical operation
			System.out.println("Cannot calculate the answer please enter (+, -, *,/)");

		}
		scanner.close();

	}

}
