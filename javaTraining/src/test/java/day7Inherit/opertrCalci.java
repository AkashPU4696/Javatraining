package day7Inherit;

import java.util.Scanner;

public class opertrCalci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner srn = new Scanner(System.in);
		calci3 op = new calci3();
		
		System.out.println("Enter the Operation to perform");
		String inp = srn.next();
		
		if(inp.contains("Addition") || inp.contains("add") || inp.contains("Add") || inp.contains("addition"))
		{
			System.out.println("Enter two numbers for Addition ");
			int c=op.add(srn.nextInt(), srn.nextInt());
			System.out.println("The result of Addition "+c);
		}
		else if (inp.contains("Subtraction")||inp.contains("Sub")||inp.contains("sub")||inp.contains("subtraction"))
		{
			System.out.println("Enter two numbers for Subtraction ");
			int k=op.sub(srn.nextInt(), srn.nextInt());
			System.out.println("The result of Subtraction "+k);
		}
		else if (inp.contains("Multiplication")||inp.contains("Mul")||inp.contains("mul")||inp.contains("multiplication"))
		{
			System.out.println("Enter two numbers for Multiplication ");
			int o=op.mul(srn.nextInt(), srn.nextInt());
			System.out.println("The result of Multiplication "+o);
		}
		else if (inp.contains("Division")||inp.contains("Div")||inp.contains("div")||inp.contains("division"))
		{
			System.out.println("Enter two numbers for Division ");
			double p=op.div(srn.nextInt(), srn.nextInt());
			System.out.println("The result of Division "+p);
		}
		else
		{
			System.out.println("Enter the proper input for Operation");
		}
	}

}
