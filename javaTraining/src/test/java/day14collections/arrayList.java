package day14collections;

import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
		
		// Collections - It is a collections of Datatypes,Strings,objects,integers

			String[] s = new String[5];
			s[0] = "ABC";
			// Array Drawbacks
			
			//Size needs to be declared
			//String array once declared will not accept integer
			//Fixed in size
			
			//***********************************************************************************
			
			//Collections used to overcome array drawbacks
			// We can increase array list size, their is no size restriction
			//We can use assign any datatype with other data types, String assigned and provided integer data types
			//Even we can restrict data types integer declared and provided integer data types
			
			//Iterator, Collections, List, Set, Queue
			
			//Index starts from 0 at array list 
			//Insertion order is maintained
			
			ArrayList A = new ArrayList();
			
			//Restrict datatype
			ArrayList<String> S = new ArrayList<String>();
				//S.add("12");
				//S.add(ABC);
			S.add("A");
			S.add("B");
			S.add("C");
			S.add("D");
			S.add("E");
			S.add("F");
			
			for(Object o : S)
			{
				System.out.println(o);
			}
			System.out.println("************");
			for(int i =0; i<S.size(); i++) 
			{
				System.out.println(S.get(i));
			}
			System.out.println("************");
			A.add("h");
			A.add("i");
			A.add("j");
			A.add("k");
			A.add("l");
			A.add("m");
			 System.out.println(A);
			//Insertion order
			System.out.println(A.get(2));
			A.add(6, "n");
			System.out.println(A.get(6));
			
			System.out.println(A.size());
			System.out.println(A.contains("n"));
			 System.out.println(A);
	}

}
