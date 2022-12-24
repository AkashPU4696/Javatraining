package day10Interface;

public class Signcertificate implements OfficeRules, CafeteriaRules{

	//Method Overridden
	public void productDmamage() {
		
		System.out.println("You have signed, Dont break any products which will create voilation");
		
	}

	public void maintainqueue() {
		
		System.out.println("You have signed, Maintainqueue to get food");
	}

	public void liftRules() {
		System.out.println("You have signed, Allowed 10 members in lift");
		
	}

	public void Officetimimgs() {
		
		System.out.println("You have signed, Be punctual to Officetimimgs at 9AM");
	}

	public void wearID() {
		
		System.out.println("You have signed, WearID card before entering Office");
	}

	public void worklogs() {
	
		System.out.println("You have signed, Send report to your manager");
	}

	public void dresscode() {
		
		System.out.println("You have signed, Wear formals on dailybasis");
	}

	
}
