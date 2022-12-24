package day14finalize;

public class Mainfinalize {

	public static void main(String[] args) {
		
		
		//Finalize
		//To delete or free up the memory of the unwanted reference which is created and 
		//not being refered finalize method will be called before java is calling garbage collector method.
		finalize f = new finalize();
		
		f = null;
		
		System.gc();

	}

}
