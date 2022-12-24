package substrg;

public class subStgChar2 {

	public static void main(String[] args) {
		
		String val1 = "Name field accepts only alphabets";
		String val2 = "Number field accepts numbers only";
		
		String a = val1.concat(val2);
		String b = val2.substring(0, 33);
		
		System.out.println(a.substring(0, 33));
        System.out.println(b);
	}

}
