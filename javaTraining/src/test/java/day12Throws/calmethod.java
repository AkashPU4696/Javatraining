package day12Throws;

import java.util.Scanner;

public class calmethod {
	
	public void add()
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the input to perform operation ");
		String inp = scr.next();	
		try {
		if (inp.contains("Addition") || inp.contains("Add") )
		{
			try 
			{
				Scanner scr1 = new Scanner(System.in);
				 System.out.println("Enter first number for Addition ");
				  int a = scr1.nextInt();
				  System.out.println("Enter second number for Addition ");
				  int b = scr1.nextInt();
				  int c = a+b;
				  System.out.println("The result of Addition "+c);
			}
			 catch(Exception e)
			{
				 System.out.println("Enter the proper input for addition");
			}
		}
		else 
		{
			throw new AddException();
		}
		}
		catch(AddException A)
		{
			System.out.println("Enter proper input to perform operation "+A);
		}
	}
}
