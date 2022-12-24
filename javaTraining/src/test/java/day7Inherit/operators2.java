package day7Inherit;

import java.util.Scanner;

public class operators2 {

	public static void main(String[] args) {
		
		// %, &&, ||
		// Modulus - Remainder of two numbers
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the number to know Even or Odd ");
		
		int i = scr.nextInt();
			
		if (i%2 == 0)
			{
			System.out.println("The entered number is Even ");
			}
		else
			{
			System.out.println("The entered number is Odd ");
			}
		
		String fstname = "Alphabets";
		if (fstname.contains("a") && fstname.contains("t"))
		{
			System.out.println("First Name is valid");
		}
		else
		{
			System.out.println("First Name is Invalid");
		}
		
		if(fstname.contains("x") || fstname.contains("e"))
		{
			System.out.println("Valid text field");
		}
		else
		{
			System.out.println("Invalid text field");
		}
	}
}


