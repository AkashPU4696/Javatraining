package day5Scanner;

import java.util.Scanner;

public class scanCaluls2 {

	public static void main(String[] args) {
		
		Scanner snr = new Scanner(System.in);
		
		Calculator2 cal = new Calculator2();
		
		System.out.println("Enter the numbers for addition");
		
		int c = cal.add(snr.nextInt(), snr.nextInt());
		
		System.out.println("The result of addition "+c);
		
		System.out.println("Enter the numbers for subtraction");
		
		int o = cal.sub(snr.nextInt(), snr.nextInt());
		
		System.out.println("The result of subtraction "+o);
		
		System.out.println("Enter the numbers for multiplication");
		
		int p = cal.mul(snr.nextInt(), snr.nextInt());
		
		System.out.println("The result of Multiplication "+p);
		
		System.out.println("Enter the numbers for Division");
		
		double w = cal.div(snr.nextDouble(), snr.nextDouble());
		
		System.out.println("The result of division "+w);

	}

}
