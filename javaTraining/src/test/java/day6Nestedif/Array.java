package day6Nestedif;

public class Array {

	public static void main(String[] args) {
		
		// Array used to reduce memory allocation
		String[] arr= {"a","b","c","d","e","f","g","h"};
		
		System.out.println(arr);
		//enhanced for loop
		for(String a:arr)
		{
			System.out.println(a);
		}
		
		int[] i = {0,1,2,3,4,5,6,7};
		{
			for(int a:i)
			{
				System.out.println(a);
			}
		}

	}

}
