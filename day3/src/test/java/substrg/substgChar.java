package substrg;

public class substgChar {

	public static void main(String[] args) {
		
		String Name = "Akash";
		String MidName = "P";
		String LstName = "U";
		
		String a = null;
		a = Name.concat(" "+MidName);
		a = a.concat(" "+LstName);
		System.out.println(a);
		System.out.println("The FirstName is "+a.substring(0, 5));
		System.out.println("The MidName is "+a.charAt(6));
		System.out.println("The LastName is "+a.charAt(8));

	}

}
