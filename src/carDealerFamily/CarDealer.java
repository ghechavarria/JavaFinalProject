package carDealerFamily;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CarDealer extends JFrame{
	
	//GUI components declaration as fields
	
	public CarDealer() {
		//GUI Components
		//build new objects of the field declarations
		
		//add listeners
		
		//add colors
		
		//add layout manager
		
		//add components to window
		
		//add to window
		
		//set window parameters
	}

	public static void main(String[] args) {
		//new CarDealer(); /*GUI*/
		Model m = new Model();
		Model m2 = new Model(27700.00, "S40");
		Customer c = new Customer("Luis", "Lastname", "0000 NW 000th Ct", "Davie", "FL", "00000", "United States");
		System.out.println(c + "\n\n" + m + "\n\n" + m2);
	}

}