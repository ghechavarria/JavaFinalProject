package carDealerFamily;

public class S40 extends Car{
	//fields
	private String model;
	private boolean carPackage; //if true carPackage is Package "A"
	private String namePackage;
	
	//getters and setters
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public boolean getCarPackage() {
		return carPackage;
	}
	public void setCarPackage(boolean carPackage) {
		this.carPackage = carPackage;
		if (this.getCarPackage() == true)
			this.setNamePackage("A");
		else
			this.setNamePackage("no-package");
	}
	public String getNamePackage() {
		return namePackage;
	}
	public void setNamePackage(String namePackage) {
		this.namePackage = namePackage;
	}
	
	//constructors
	//no args
	public S40() {
		super.setPrice(27700);//hard code the price
		model = "S40";
		carPackage = false;
		namePackage = "no-package";
	}
	
	//full params
	public S40(boolean metallicPaint, boolean tradeIn, double tradeInValue, boolean financing, boolean payCash, boolean carPackage) {
		super(metallicPaint, tradeIn, tradeInValue, financing, payCash);
		this.setPrice(27700); //hard code the price
		this.setModel("S40");
		this.setCarPackage(carPackage);
		//setNumPackage -> sets setNamePackage
	}
	
	//copy constructor
	public S40(S40 s) {
		super((Car)s); //polymorphism
		this.setCarPackage(s.getCarPackage());
		//setNumPackage -> sets setNamePackage
	}
	
	//to string
	public String toString() {
		return "\nModel: " + this.getModel() + "\nPackage: " + this.getCarPackage() + "\nPackage Name: " + this.getNamePackage() + "\nBase Price: " + super.getPrice()
				+ "\nMetallic Paint: " + super.getMetallicPaint() + "\nTrade-in: " + super.getTradeIn() + "\nTrade-in Value: " + super.getTradeInValue()
				+ "\nFinancing: " + super.getFinancing() + "\nPay Cash: " + super.getPayCash();
	}

	//ABSTRACT METHODS
	@Override
	public double calculateSubTotal() {
		//base price
		double subtotal = super.getPrice();
		
		if(this.carPackage == true)
			subtotal += 2200;
		if (super.getMetallicPaint() == true)
			subtotal += 650;
		if (super.getTradeIn() == true)
			subtotal -= this.getTradeInValue();
		if (super.getPayCash() == true)
			subtotal -= 750;
		if (super.getFinancing() == true)
			subtotal -= subtotal*.7; //7% off
		
		return subtotal;
	}

}
