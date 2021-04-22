package carDealerFamily;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CarDealer extends JFrame{
	
	//GUI components declaration as fields
	private JLabel fNameLabel, lNameLabel, addressLabel, cityLabel, stateLabel, zipLabel, countryLabel;
	private JLabel modelsLabel, extrasLabel, discountsLabel, receiptLabel;
	private JLabel customerID, customerName, subtotal, total;
	private JButton signUpBtn, calculateBtn, exitBtn;
	
	private JTextField fName, lName, address, city, state, zip;
	private JRadioButton rbS40, rbS60, rbS70, rbs80;
	private ButtonGroup bgModels;
	
	private JCheckBox packageA, packageB, metallicPaint, tradeIn, financing, payCash;
	
	
	public CarDealer() {
		//GUI Components
		//build new objects of the field declarations
		fNameLabel = new JLabel("First Name");
		lNameLabel = new JLabel("Last Name");
		addressLabel = new JLabel("Address");
		cityLabel = new JLabel("City");		
		
		
		//add listeners
		
		//add colors
		
		//add layout manager
		
		//add components to window
		
		//add to window
		
		//set window parameters
	}

	public static void main(String[] args) {
		//new CarDealer(); /*GUI*/
		Customer c = new Customer("Luis", "Lastname", "0000 NW 000th Ct", "Davie", "FL", "00000", "United States");
		S40 s4 = new S40(true, false, 0.0, false, false, true);
		S60 s6 = new S60();
		S70 s7 = new S70();
		S80 s8 = new S80(false, true, 5000, true, false, 2);
		System.out.println(c + "\n\n" + s4 + "\n" + s4.calculateSubTotal() + "\n" + s4.calculateTotal(s4.calculateSubTotal()) + "\n\n" + s6 + "\n\n" + s7 + "\n\n" + s8);
	}

}