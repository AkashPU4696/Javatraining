package string;

public class strgCon3 {

	public static void main(String[] args) {
		
		String a = "Name field should accept alphabets only";
		String b = "Number field should accept numbers only";
		String c = "Address field should alphanumeric";
		
		String validation = null;
		validation = a.concat(","+" "+b);
		validation = validation.concat(","+" "+c);
		System.out.println(validation);

	}

}
