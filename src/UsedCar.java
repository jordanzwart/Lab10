/*
 * Lab 10
 */
public class UsedCar extends Car {
private double milage;

	
	
	public UsedCar() {
		
	}

	public UsedCar(String make, String model, int year, double price, double milage) {
		super(make, model, year, price);
		this.milage = milage;
		
	}

	public double getMilage() {
		return milage;
	}

	public void setMilage(double milage) {
		this.milage = milage;
	}
	
	public String toString(){
		return String.format("%1$-15s %2$-10s %3$-6d $%4$.2f (Used)%5$-10.1f miles \n", super.getMake(), super.getModel(),
				super.getYear(), super.getPrice(), milage);
	}

}
