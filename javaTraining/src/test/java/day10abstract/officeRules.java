package day10abstract;

public abstract class officeRules {

	//To achieve multiple inheritance through interface/abstraction
	// By using implements keyword to inherit properties
	//Interface will not allow you to write method 
	
	
	//Abstraction will allow method implimentation in non abstract method
	//Method which is created with abstract key will not allow you to create implimentation
	//abstract keyword to be used in class to create abstract method
	//without method implimentation not able to inherit properties
	//Abstract will not allow to create object
	
	
	public abstract void officeTimimgs();
	
	public void wearID()
	{
		System.out.println("Always wear id card");
	}
	public abstract void dresscode();
	public abstract void workLogs();
}
