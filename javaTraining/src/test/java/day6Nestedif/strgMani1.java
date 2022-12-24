package day6Nestedif;

public class strgMani1 {

	public static void main(String[] args) {
		
		String title = "Attend Java class";
		
		String[] title1 = title.split(" ");
		
		System.out.println(title1);

		for(String a:title1)
		{
			System.out.println(a);
		}
		
	         System.out.println(title.contains("Java"));
	}

}
