package carDealerFamily;

public abstract class Car {
	//fields
	private double price;
	private boolean metallicPaint;	//if true add $650
	private boolean tradeIn; 		//if true dialog box for car value
	private double tradeInValue; 	//if tradeIn is true
	private boolean financing; 		//if true 7% off total
	private boolean payCash; 		//if true deduct from total
	
	//getters and setters
	public double getPrice() {
		return price;
	}
	//hello
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean getMetallicPaint() {
		return metallicPaint;
	}
	public void setMetallicPaint(boolean metallicPaint) {
		this.metallicPaint = metallicPaint;
	}
	public boolean getTradeIn() {
		return tradeIn;
	}
	public void setTradeIn(boolean tradeIn) {
		this.tradeIn = tradeIn;
	}
	public double getTradeInValue() {
		return tradeInValue;
	}
	public void setTradeInValue(double tradeInValue) {
		this.tradeInValue = tradeInValue;
	}
	public boolean getFinancing() {
		return financing;
	}
	public void setFinancing(boolean financing) {
		this.financing = financing;
	}
	public boolean getPayCash() {
		return payCash;
	}
	public void setPayCash(boolean payCash) {
		this.payCash = payCash;
	}
	
	
	//constructors
	//no-args
	public Car() {
		this.metallicPaint = false;
		this.tradeIn = false;
		this.tradeInValue = 0.0;
		this.financing = false;
		this.payCash = false;
	}
	
	//full params
	public Car(boolean metallicPaint, boolean tradeIn, double tradeInValue,boolean financing, boolean payCash) {
		this.setMetallicPaint(metallicPaint);
		this.setTradeIn(tradeIn);
		this.setTradeInValue(tradeInValue);
		this.setFinancing(financing);
		this.setPayCash(payCash);
	}
	
	//copy constructor
	public Car(Car c) {
		this.setMetallicPaint(c.getMetallicPaint());
		this.setTradeIn(c.getTradeIn());
		this.setTradeInValue(c.getTradeInValue());
		this.setFinancing(c.getFinancing());
		this.setPayCash(c.getPayCash());
	}
	
	//ABSTRACT METHOD
	public abstract double calculateSubTotal();
	
	//class method
	public double calculateTotal(double subTotal) {
		double total = 0.0;
		double tax = 0.0;
		final double SALESTAX = .06;
		final double TITLE_TAGS = 325;
		
		tax = subTotal * SALESTAX;
		total = subTotal + TITLE_TAGS + tax;
		return total;
	}
	
}
