package day10Interface;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		CalMethod Cal = new CalMethod();
		System.out.println("Enter the method Operation to perform ");
		String C = Sc.next();
		if(C.equalsIgnoreCase("Sum"))
		{
			System.out.println("Enter two numbers to perform addition ");
			int c= Cal.sum(Sc.nextInt(), Sc.nextInt());
			System.out.println("The result of Addition "+c);
		}
		else if (C.equalsIgnoreCase("Sub"))
		{
			System.out.println("Enter two numbers to perform Subtraction ");
			int e=Cal.sub(Sc.nextInt(), Sc.nextInt());
			System.out.println("The result of Subtraction "+e);
		}
		else if (C.equalsIgnoreCase("Mul"))
		{
			System.out.println("Enter two numbers to perform Multiplication ");
			int f= Cal.mul(Sc.nextInt(), Sc.nextInt());
			System.out.println("The result of Multiplication "+f);
		}
		else if (C.equalsIgnoreCase("Div"))
		{
			System.out.println("Enter two numbers to perform Division ");
			double g= Cal.div(Sc.nextInt(), Sc.nextInt());
			System.out.println("The result of division "+g);
		}
		else
		{
			System.out.println("Enter the proper Operation");
		}
	}

}
