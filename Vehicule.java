package inheritanceQuest;

public abstract class Vehicule {
	// attributes
	private String brand;
	private int kilometers;

	// constructor
	public Vehicule(String brand, int kilometers) {
		this.brand = brand;
		this.kilometers = kilometers;

	}
	
	//getters/ setters 
	public String getBrand() {
		return this.brand; 
	}
	
	public int getKilometers() {
		return this.kilometers; 
	}
	
	public void setBrand(String brand) {
		this.brand = brand; 
	}

	public void setKilometers(int kilometers) {
		this.kilometers = kilometers; 
	}
	
	// abstract methods
	public abstract String doStuff();
}
