package inheritanceQuest;

public class Car  extends Vehicule {
	
	public Car(String brand, int kilometers) {
		super(brand, kilometers);
	
	}
	
	@Override
	public  String doStuff() {
	 return "I am "+  this.getBrand() +" and I go zoom zoom zoom!"; 
	}
}
