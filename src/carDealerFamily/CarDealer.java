package carDealerFamily;


public class CarDealer {

	public static void main(String[] args) {
		Model m = new Model();
		Model m2 = new Model(27700.00, "S40");
		Customer c = new Customer("Luis", "Lastname", "0000 NW 000th Ct", "Davie", "FL", "00000", "United States");
		System.out.println(c);
		System.out.println(m + "\n");
	}

}
