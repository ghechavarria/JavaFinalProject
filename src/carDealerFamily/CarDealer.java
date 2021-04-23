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
	
	private JComboBox countryDropDown;
	
	public CarDealer() {
		//list for dropdown
		String country[] = {"United States", "Canada"};
		
		//GUI COMPONENTS
		//inside left panel
		fNameLabel = new JLabel("First Name");
		fName = new JTextField();
		lNameLabel = new JLabel("Last Name");
		lName = new JTextField();
		addressLabel = new JLabel("Address");
		address = new JTextField();
		cityLabel = new JLabel("City");	
		city = new JTextField();
		stateLabel = new JLabel("State");
		state = new JTextField();
		zipLabel = new JLabel("ZIP");
		zip = new JTextField();
		countryLabel = new JLabel("Country");
		countryDropDown = new JComboBox(country);
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
		
		//create panels and manage layout 
		JPanel leftPanel = new JPanel();
		JPanel lpanel1 = new JPanel();
		JPanel lpanel2 = new JPanel();
		JPanel lpanel3 = new JPanel();
		
		JPanel middlePanel = new JPanel();
		JPanel mpanel1 = new JPanel();
		JPanel mpanel2 = new JPanel();
		JPanel mpanel3 = new JPanel();
		
		JPanel rightPanel = new JPanel();
		JPanel rpanel1 = new JPanel();
		JPanel rpanel2 = new JPanel();
		JPanel rpanel3 = new JPanel();
		
		//create layout for sub-panels
		leftPanel.setBounds(0, 0, 250, 550);
		leftPanel.setLayout(new GridLayout(3, 1)); //3 rows, 1 column
		
		middlePanel.setBounds(300, 0, 250, 550);
		middlePanel.setLayout(new GridLayout(3, 1)); //3 rows, 1 column
		
		rightPanel.setBounds(600, 0, 250, 550);
		rightPanel.setLayout(new GridLayout(3, 1)); //3 rows, 1 column
		
		//create panel for Image
		leftPanel.add(lpanel1);
		lpanel1.setBorder(BorderFactory.createTitledBorder("Image Goes Here"));
		
		//create panel for text boxes to enter user information
		leftPanel.add(lpanel2);
		//add labels & text field to panel
		lpanel2.add(fNameLabel);
		lpanel2.add(fName);
		lpanel2.add(lNameLabel);
		lpanel2.add(lName);
		lpanel2.add(addressLabel);
		lpanel2.add(address);
		lpanel2.add(cityLabel);
		lpanel2.add(city);
		lpanel2.add(stateLabel);
		lpanel2.add(state);
		lpanel2.add(zipLabel);
		lpanel2.add(zip);
		lpanel2.add(countryLabel);
		lpanel2.add(countryDropDown);
		//set layout for labels & text fields
		lpanel2.setLayout(new GridLayout(8, 2));
		//create border for labels & text fields
		lpanel2.setBorder(BorderFactory.createTitledBorder("Customer Info"));
		
		//create panel for submit button
		leftPanel.add(lpanel3);
		//add submit button
		lpanel3.add(signUpBtn);
		//create border for submit button
		lpanel3.setBorder(BorderFactory.createTitledBorder("Sign Up"));
		
		//Create panel for Model
		middlePanel.add(mpanel1);
		//add radio buttons to button group
		bgModels.add(rbS40);
		bgModels.add(rbS60);
		bgModels.add(rbS70);
		bgModels.add(rbS80);
		//add radio buttons to panel
		mpanel1.add(rbS40);
		mpanel1.add(rbS60);
		mpanel1.add(rbS70);
		mpanel1.add(rbS80);
		//set layout for radio buttons
		mpanel1.setLayout(new GridLayout(4,1));
		//create border for Model panel
		mpanel1.setBorder(BorderFactory.createTitledBorder("Models"));
		
		//create panel for Extras
		middlePanel.add(mpanel2);
		//add check boxes to panel
		mpanel2.add(packageA);
		mpanel2.add(packageB);
		mpanel2.add(metallicPaint);
		//set layout for check boxes
		mpanel2.setLayout(new GridLayout(3,1));
		//create border for Extras panel
		mpanel2.setBorder(BorderFactory.createTitledBorder("Extras"));
		
		//create panel for Discounts
		middlePanel.add(mpanel3);
		//add check boxes to panel
		mpanel3.add(tradeIn);
		mpanel3.add(financing);
		mpanel3.add(payCash);
		//set layout for check boxes
		mpanel3.setLayout(new GridLayout(3,1));
		//create border for Discounts panel
		mpanel3.setBorder(BorderFactory.createTitledBorder("Discounts"));
		
		//create panel for Receipt
		rightPanel.add(rpanel1);
		rpanel1.add(customerID);
		rpanel1.add(idDisplay);
		rpanel1.add(customerName);
		rpanel1.add(nameDisplay);
		rpanel1.add(subtotal);
		rpanel1.add(subtotalDisplay);
		rpanel1.add(total);
		rpanel1.add(totalDisplay);
		//set layout for Receipt panel
		rpanel1.setLayout(new GridLayout(5, 2));
		//create border for Receipt panel
		rpanel1.setBorder(BorderFactory.createTitledBorder("Receipt"));
		
		
		//add panel for calculate and exit buttons
		rightPanel.add(rpanel2);
		//add calculate and exit buttons
		rpanel2.add(calculateBtn);
		rpanel2.add(exitBtn);
		//create border for calculate and exit buttons. TEMPORARY will probably delete later
		rpanel2.setBorder(BorderFactory.createTitledBorder("Buttons"));
		
		//useless panel
		rightPanel.add(rpanel3);
		//useless border
		rpanel3.setBorder(BorderFactory.createTitledBorder("rpanel3"));
		
		
		//configure JFrame
		JFrame frame = new JFrame();
		frame.setSize(900, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.add(leftPanel);
		frame.add(middlePanel);
		frame.add(rightPanel);
		frame.setTitle("Final Project");
		
		
		
		
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
//				//dropdown
//				int index;
//				String selectedCountry;
//				index = countryDropDown.getSelectedIndex()
//				selectedCountry = country[index]
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
		new CarDealer(); /*GUI*/
		Customer c = new Customer("Luis", "Lastname", "0000 NW 000th Ct", "Davie", "FL", "00000", "United States");
		S40 s4 = new S40(true, false, 0.0, false, false, true);
		S60 s6 = new S60();
		S70 s7 = new S70();
		S80 s8 = new S80(false, true, 5000, true, false, 2);
		System.out.println(c + "\n\n" + s4 + "\n" + s4.calculateSubTotal() + "\n" + s4.calculateTotal(s4.calculateSubTotal()) + "\n\n" + s6 + "\n\n" + s7 + "\n\n" + s8);
	}

}