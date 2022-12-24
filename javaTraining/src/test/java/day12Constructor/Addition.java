package day12Constructor;

import java.util.Scanner;

public class Addition {

	public Addition()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number for addition ");
		int a = sc.nextInt();
		System.out.println("Enter second number for addition ");
		int b = sc.nextInt();
		int c = a+b;
		System.out.println("The result of Sum "+c);
		
	}
}
