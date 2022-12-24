package day5Scanner;

public class strgMani {

	public static void main(String[] args) {
		
		//trim
		String a = "    Hi This is AkAsh A";
		System.out.println(a);
		
		String b = null;
		b= a.trim();
		System.out.println(b);
		
		//length
		
		System.out.println("Length of a "+a.length());
		System.out.println("Length of b "+b.length());
		
		//index
		
		System.out.println("index of a "+a.indexOf("A"));
		System.out.println("index of b "+b.indexOf("A"));
		
		//index of 2nd occurance of char
		
		System.out.println("T two times ouccured "+a.indexOf("T", a.indexOf("T")+1));
		System.out.println("A two times ouccured "+b.indexOf("A", b.indexOf("A")+1));
		
		//3rd ouccurance
		int three = b.indexOf("A", b.indexOf("A")+1);
		System.out.println("A third ouccurance "+b.indexOf("A", three+1));
		
		// == (int)
		// Equals (String)
		String m = "Java";
		String n = "Java";
		System.out.println(m.equals(n));
		
		System.out.println(a.equals(b));
		
		// Ignore captial and small characters at String - Equals Ignore case
		
		String small = "hi, this is akash";
		String cap = "HI, THIS IS AKASH";
		
		System.out.println(small.equalsIgnoreCase(cap));
		
		// Date manipulation Replace date format
		
		String Date = "08/11/2022";
		System.out.println(Date);
		System.out.println(Date.replace("/", "-"));

	}

}
