package day12Throws;

import java.util.Scanner;

public class calmethod1 {

	public void sub()
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the proper input to perform operation ");
		String inp1 = sc1.next();
		try 
		{
			if(inp1.contains("Subtraction") || inp1.contains("Sub"))
			{
				try 
						{
				Scanner scr1 = new Scanner(System.in);
				System.out.println("Enter the first number for subtraction ");
				int d = scr1.nextInt();
				System.out.println("Enter the second number for subtraction ");
				int e = scr1.nextInt();
				int f = d - e;
				System.out.println("The result of Subtraction "+f);
						}
				catch(Exception e)
					{
					System.out.println("Enter the proper number for subtraction");
					}
			}
			else 
				{
				throw new SubException();
				}
			}
			catch (SubException S)
			{
				System.out.println("Enter the proper inupt to perform operation");
			}
	}
}
