package day6Nestedif;

import java.util.Scanner;

public class controlCalculator {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		
		calci Calculator3 = new calci();
		
		System.out.println("Enter the operation that you want to perform");
		       String   Cal = scr.next();
		
		if(Cal.equalsIgnoreCase("Add"))
		{
			System.out.println("Enter two numbers for addition ");
			int c = Calculator3.add(scr.nextInt(), scr.nextInt());
			System.out.println("The result of Addition "+c);
		}
		else if (Cal.equalsIgnoreCase("Sub"))
		{
			System.out.println("Enter the numbers for subtraction");
			int k = Calculator3.sub(scr.nextInt(), scr.nextInt());
			System.out.println("The result of subtraction "+k);
		}
		else if(Cal.equalsIgnoreCase("Mul"))
		{
			System.out.println("Enter the numbers for Multiplication");
			int o = Calculator3.mul(scr.nextInt(), scr.nextInt());
			System.out.println("The result of Multiplication "+o);
		}
		else if(Cal.equalsIgnoreCase("Div"))
		{
			System.out.println("Enter the numebrs for division ");
			double p = Calculator3.div(scr.nextInt(), scr.nextInt());
			System.out.println("The result of Division "+p);
		}
		else
		{
			System.out.println("Enter the proper input to continue for operation ");
		}
		
	}

}
