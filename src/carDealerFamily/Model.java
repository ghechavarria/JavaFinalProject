package carDealerFamily;

public class Model extends Car {
	
	private String model;
	

	//getters and setters
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	
	//constructor
	//no args
	public Model() {
		model = "no-model";
	}
	
	//full params
	public Model(double price,String model) {
		super(price);
		this.setModel(model);
	}
	
	//copy constructor
	public Model(Model m) {
		super((Model)m);
		this.setModel(this.getModel());
	}
	
	//to string
	public String toString() {
		return "Model: " + this.getModel() + "\nPrice: " + super.getPrice();
	}

	//ABSTRACT METHOD
	@Override
	public void methodPackage() {
		//???

	}

}
