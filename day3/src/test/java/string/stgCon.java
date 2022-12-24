package string;

public class stgCon {

	public static void main(String[] args) {
		String FirstName = "Akash";
		String MidName = "P";
		String LasName = "U";

		String FullName = null;
		System.out.println(FirstName);
		FullName = FirstName.concat(" " +MidName);
		System.out.println(FullName);
		FullName = FullName.concat(" "+LasName);
		System.out.println("My Name is"+ " " +FullName);
	}

}
