package carDealerFamily;

public class S80 extends Car {

	//fields
		private String model;
		private int numPackage;
		private String namePackage;
		
		//getters and setter
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public String getNamePackage() {
			return namePackage;
		}
		public void setNamePackage(String namePackage) {
			this.namePackage = namePackage;
		}
		public int getNumPackage() {
			return numPackage;
		}
		public void setNumPackage(int d) {
			this.numPackage = d;
			
			if (this.numPackage == 1)
				this.setNamePackage("A");
			if (this.numPackage == 2) 
				this.setNamePackage("B");
			if (this.numPackage == 0) 
				this.setNamePackage("no-package"); //numPackage == 0
			
		}
		

		//no args
		public S80() {
			super.setPrice(44000); //hard code the price
			this.setModel("S80");
			this.setNumPackage(0);
			//setNumPackage -> sets setNamePackage
		}

		//full params
		public S80(boolean metallicPaint, boolean tradeIn, double tradeInValue, boolean financing, boolean payCash, int numPackage) { //add from this class
			super(metallicPaint, tradeIn, tradeInValue, financing, payCash);
			this.setPrice(44000); //hard code the price
			this.setModel("S80");
			this.setNumPackage(numPackage);
			//setNumPackage -> sets setNamePackage
		}
		
		//copy constructor
		public S80(S80 c) {
			super((Car)c); //polymorphism
			this.setNumPackage(c.getNumPackage());
			//setNumPackage -> sets setNamePackage
		}
		
		//to string
		public String toString() {
			return "\nModel: " + this.getModel() + "\nPackage: " + this.getNumPackage() + "\nPackage Name: " + this.getNamePackage() + "\nBase Price: " + super.getPrice()
					+ "\nMetallic Paint: " + super.getMetallicPaint() + "\nTrade-in: " + super.getTradeIn() + "\nTrade-in Value: " + super.getTradeInValue()
					+ "\nFinancing: " + super.getFinancing() + "\nPay Cash: " + super.getPayCash();
		}
		
		//ABSTRACT METHODS
		@Override
		public double calculateSubTotal() {
			//base price
			double subtotal = super.getPrice();
			
			//calculate package price according to package 0,1,2
			switch(this.getNumPackage()) {
				case 0:
					subtotal += 0;
				case 1:
					subtotal += 2200; //Package "A"
				case 2:
					subtotal += 3250; //Package "B"
			}
			
			if (super.getMetallicPaint() == true)
				subtotal += 650;
			if (super.getTradeIn() == true)
				subtotal -= this.getTradeInValue();
			if (super.getPayCash() == true)
				subtotal -= 750;
			if (super.getFinancing() == true)
				subtotal -= subtotal*.7; //7% off

			return Math.round(subtotal*100.0)/100.0;
		}

}
