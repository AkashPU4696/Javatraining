package day11TryCatch;

import java.util.Scanner;

public class Calmethod {

	public void sum(int a, int b)
	{
		try 
		{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number for addition ");
		a = sc.nextInt();
		System.out.println("Enter the second number for addition ");
		b = sc.nextInt();
			int c = a+b;
			System.out.println("The result of Addition "+c);
		}
		catch (Exception E)
		{
			System.out.println("Enter the proper input for addition "+E);
		}
		
	}
	public void sub (int d, int e)
	{
		try
		{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the first number for subtraction ");
		d = sc1.nextInt();
		System.out.println("Enter the second number for subtraction ");
		e = sc1.nextInt();
		int f = d-e;
		System.out.println("Enter the result of subtraction "+f);
		}
		catch (Exception E1)
		{
			System.out.println("Enter the proper input number "+E1);
		}
	}
}
