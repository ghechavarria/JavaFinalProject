package carDealerFamily;

public abstract class Car {
	//fields
	private double price;
	
	//getters and setters
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	//constructors
	//no-args
	public Car() {
		this.price = 0.0;
	}
	
	//full params
	public Car(double price) {
		this.setPrice(price);
	}
	
	//copy constructor
	public Car(Car c) {
		this.setPrice(c.getPrice());
	}
	
	//ABSTRACT METHOD
	public abstract void methodPackage();
	
}
