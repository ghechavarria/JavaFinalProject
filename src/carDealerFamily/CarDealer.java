package carDealerFamily;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CarDealer extends JFrame{
	
	//GUI components declaration as fields
	private JLabel fNameLabel, lNameLabel, addressLabel, cityLabel, stateLabel, zipLabel, countryLabel;
	private JLabel modelsLabel, extrasLabel, discountsLabel, receiptLabel;
	private JLabel customerID, customerName, subtotal, total;
	private JLabel idDisplay, nameDisplay, subtotalDisplay, totalDisplay;
	private JButton signUpBtn, calculateBtn, exitBtn;
	
	private JTextField fName, lName, address, city, state, zip;
	private JRadioButton rbS40, rbS60, rbS70, rbS80;
	private ButtonGroup bgModels;
	
	private JCheckBox packageA, packageB, metallicPaint, tradeIn, financing, payCash;
	
	
	public CarDealer() {
		//GUI COMPONENTS
		//inside left panel
		fNameLabel = new JLabel("First Name");
		lNameLabel = new JLabel("Last Name");
		addressLabel = new JLabel("Address");
		cityLabel = new JLabel("City");		
		stateLabel = new JLabel("State");
		zipLabel = new JLabel("ZIP");
		countryLabel = new JLabel("Country");
		//DROPDOWN FOR COUNTRY MISSING
		signUpBtn = new JButton("Sign Up");
		
		//inside middle panel
		bgModels = new ButtonGroup();
		rbS40 = new JRadioButton("S40");
		rbS60 = new JRadioButton("S60");
		rbS70 = new JRadioButton("S70");
		rbS80 = new JRadioButton("S80");
		
		packageA = new JCheckBox("Package 'A'");
		packageB = new JCheckBox("Package 'B'");
		metallicPaint = new JCheckBox("Metallic Paint");
		
		discountsLabel = new JLabel("Discounts");
		tradeIn = new JCheckBox("Trade-In");
		financing = new JCheckBox("Financing");
		payCash = new JCheckBox("Pay Cash");
		
		//inside right panel
		customerID = new JLabel("Customer ID: ");
		idDisplay = new JLabel("------");
		customerName = new JLabel("Customer Name: ");
		nameDisplay = new JLabel("------ --------");
		subtotal = new JLabel("Subtotal: ");
		subtotalDisplay = new JLabel("$-----.00");
		total = new JLabel("Total: ");
		totalDisplay = new JLabel("$-----.00");
		calculateBtn = new JButton("Calculate");
		exitBtn = new JButton("Exit");
		
		
		//ACTION LISTENERS
		//dropdown
		
		//radio buttons
		rbS40.addActionListener(new rbActionListener());
		rbS60.addActionListener(new rbActionListener());
		rbS70.addActionListener(new rbActionListener());
		rbS80.addActionListener(new rbActionListener());
		//check boxes
		packageA.addItemListener(new CheckListener());
		packageB.addItemListener(new CheckListener());
		metallicPaint.addItemListener(new CheckListener());
		tradeIn.addItemListener(new CheckListener());
		financing.addItemListener(new CheckListener());
		payCash.addItemListener(new CheckListener());
		//buttons
		signUpBtn.addActionListener(new buttonListener());
		calculateBtn.addActionListener(new buttonListener());
		exitBtn.addActionListener(new buttonListener());
		
		//add colors
		
		//add layout manager
		
		//add components to window
		
		//add to window
		
		//set window parameters
	}
	
	private class rbActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
//			if(e.getSource() == rbS40) {
//
//			}
//			if(e.getSource() == rbS60) {
//
//			}
//			if(e.getSource() == rbS70) {
//
//			}
//			if(e.getSource() == rbS80) {
//
//			}
		}
	}
	
	private class buttonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
//			if(signUpBtn.isSelected())
//
//
//			if(calculateBtn.isSelected())
//
//
//			if(exitBtn.isSelected())

		}
	}

	
	private class CheckListener implements ItemListener{
		@Override
		public void itemStateChanged(ItemEvent e) {
//			if(e.getSource() == packageA) {
//				if(packageA.isSelected())
//
//			}

//			if(e.getSource() == packageB) {
//				if(packageB.isSelected())
//
//			}

//			if(e.getSource() == metallicPaint) {
//				if(metallicPaint.isSelected())
//
//			}
			
//			if(e.getSource() == tradeIn) {
//				if(tradeIn.isSelected())
//
//			}
			
//			if(e.getSource() == financing) {
//			if(financing.isSelected())
//
//			}
			
//			if(e.getSource() == payCash) {
//			if(payCash.isSelected())
//
//			}
		}
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