package string;

public class strgCon2 {

	public static void main(String[] args) {
		String Name = "Hi This is Akash P U";
		String time = "Attending 8 pm";
		String training = "Java Class";
		
		String Details = null;
		Details = Name.concat(" "+time);
		Details = Details.concat(" "+training);
		System.out.println(Details);

	}

}
