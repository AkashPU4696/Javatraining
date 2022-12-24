package day5Scanner;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// Hard code declaration 
		 int a = 30;
		 //Scanner
		System.out.println("Before overriding "+a);
		
		System.out.println("Enter the number to be Overridden");
		
		a = scan.nextInt();
		
		System.out.println("After override the value "+ a);
		
		//String
		
		String Name = "Akash";
		System.out.println("Before overridden "+Name);
		
		System.out.println("Enter the String that needs to be overridden");
		
		Name = scan.next();
		System.out.println("After overridden "+Name);
		

	}

}
