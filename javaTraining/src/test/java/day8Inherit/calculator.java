package day8Inherit;

public class calculator {

	//Encapsulation
	//Binding data and method's
	//Hiding private data
	//Protecting/secure the data
	//Encapsulation can be achieved by setting access specifier as private(setting variable in private)
	//Encapsulation can be achieved using getter and setter method

	
	private String AccountNo;
	private String Atmpin;
	
	
	//Method Overloading
	public int add(int a, int b)
	{
		int c=a+b;
		return c;
	}
	public int add(int d, int e, int f)
	{
		int g = d+e+f;
		return g;
	}
	public int add(int h, int i, int j, int k)
	{
		int l= h+i+j+k;
		return l;
	}
	
}
