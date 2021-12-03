package inheritanceQuest;

public class Hangar {

	public static void main(String[] args) {
		// instance boat and car 
		
		Car  myCar = new Car("Mercedes", 569); 
		Boat  myBoat = new Boat("Sea Ray.", 4352); 
		
		System.out.println(myCar.doStuff());
		System.out.println(myBoat.doStuff());

	}


}
