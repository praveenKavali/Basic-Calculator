public class Calculation {

	private int num1;
	private int num2;

	public Calculation(int i, int j) {
		this.num1 = i;
		this.num2 = j;
	}

	public int addition() {
		return (num1 + num2);
	}

	public int subtraction() {
		return (num1 - num2);
	}

	public int multiplication() {
		return (num1 * num2);
	}

	public void division() {
		if(num2 == 0) {
			System.out.println("Cannot divide by 0");
		} else {
			System.out.println("result: " + (double)num1 / num2);
		}
	}

	public double power() { 
		return Math.pow(num1, num2);
	}

	public int factorial() {
		int result = 1;
		for(int i=num1; i>0; i--) {
			result *= i;
		}

		return result;
	}

}
