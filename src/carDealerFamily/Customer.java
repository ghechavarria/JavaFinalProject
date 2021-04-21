package carDealerFamily;

import java.util.Random;

public class Customer {
	//fields
	private String id;
	private String fName;
	private String lName;
	private String street;
	private String city;
	private String state;
	private String zip;
	private String country;
	
	
	//getters and setters
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setid(String fName, String lName) {
		this.id = fName.substring(0,1).toUpperCase() + lName.substring(0,1).toUpperCase() + createRandNumer();
	}
	public String getID() {
		return id;
	}
	
	//methods
	public String createRandNumer() {
		Random rand = new Random();
		String fourDigitNum = "";
		for(int i = 0; i<4; i++)
			fourDigitNum += String.valueOf(rand.nextInt(10));
		return fourDigitNum;
	}
	
	//constructors
	//no-args
	public Customer() {
		this.id = "no-id";
		this.fName = "no-fname";
		this.lName = "no-lname";
		this.street = "no-street";
		this.city = "no-city";
		this.state = "no-state";
		this.zip = "no-zip";
		this.country = "no-country";
	}
	
	//full params
	public Customer(String fName, String lName, String street, String city, String state, String zip, String country) {
		super();

		this.setfName(fName);
		this.setlName(lName);
		this.setid(this.getfName(), this.getlName());
		this.setStreet(street);
		this.setCity(city);
		this.setState(state);
		this.setZip(zip);
		this.setCountry(country);
	}
	
	//copy constructor
	public Customer(Customer c) {
		super();
		this.id = c.id; //copy or creat new?
		this.setfName(c.fName);
		this.setlName(c.lName);
		this.setStreet(c.street);
		this.setCity(c.city);
		this.setState(c.state);
		this.setZip(c.zip);
		this.setCountry(c.country);
	}
	
	public String toString() {
		return "Customer ID: " + this.getID() + "\nFirst Name: " + this.getfName() + "\nLast Name: " 
				+ this.getlName() + "\nStreet: " + this.getStreet() +	"\nCity: " + this.getCity() 
				+ "\nState: " + this.getState() + "\nZIP: " + this.getZip() + "\nCountry: " + this.getCountry();
	}
	
}
