
public class Car {

	private String make;
	private String model;
	private int year;
	private double price;
	//constructor
	public Car(){
		make = "";
		model = "";
		year = 0;
		price = 0.0;
	}
	
	public Car(String make, String model, int year, double price){
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
		
	}
	
	
	
	//getter1
	public String getMake() {
		return make;
	}
	//setter1
	public void setMake(String make) {
		this.make = make;
	}
	//getter2
	public String getModel() {
		return model;
	}
	//setter2
	public void setModel(String model) {
		this.model = model;
	}
	//getter3
	public int getYear() {
		return year;
	}
	//setter3
	public void setYear(int year) {
		this.year = year;
	}
	//getter4
	public double getPrice() {
		return price;
	}
	//setter4
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString(){
		return String.format("%1$-15s %2$-10s %3$-6d $%4$-10.2f \n", make, model, year, price);
	}
	
	
	
	

	}
