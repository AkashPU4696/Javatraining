package day9;

public class accessModifier {

	public static void main(String[] args) {
		
		//Access modifiers used to restrict your code
		//Public - By using this we can use it in any other class or package, without specified as public by default it will take it as public
		//Private - this is used only within the class, it cannot be accessed in other class
		//Final - by this methods cannot be overridden
		//Protected - This will not allow to access in other package

		AM a=new AM();
		int c =a.sum(5, 3);
		System.out.println(c);
		int f =a.mul(5, 3);
		System.out.println(f);
		int l=a.div(6, 3);
		System.out.println(l);
		
		//after inheritance
		AM2 b=new AM2();
		int d=b.sum(8, 9, 7);
		System.out.println(d);
	   int k= b.mul(6, 3);
		System.out.println(k);
		
	}

}
