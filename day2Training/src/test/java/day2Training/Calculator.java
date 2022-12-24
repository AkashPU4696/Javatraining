package day2Training;

public class Calculator {

	public static void main(String[] args) {
		
		Assign math = new Assign();
		System.out.println("The Addition result = "+math.addtion(10, 20));
		System.out.println("The Substraction result = "+math.subtraction(50, 30));
		System.out.println("The Multiplication result = "+math.multiplication(5, 3));
		System.out.println("The Division result = "+math.division(2, 3));
	}

}
