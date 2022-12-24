package day8Inherit;

public class Hero {

	public static void main(String[] args) {
		
		Honda h = new Honda();
		
		//Method Over ridding same name with different functionality
		//Compile time poly while compile system knows which methid to call
		
		h.Wheel();
		h.accelator();
		h.engine();
        h.mileage();
		
	}

}
