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
		lNameLabel = new JLabel("Last Name");
		addressLabel = new JLabel("Address");
		cityLabel = new JLabel("City");		
		stateLabel = new JLabel("State");
		zipLabel = new JLabel("ZIP");
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
		
		leftPanel.add(lpanel1);
		leftPanel.add(lpanel2);
		leftPanel.add(lpanel3);
		lpanel1.setBorder(BorderFactory.createTitledBorder("lpanel1"));
		lpanel2.setBorder(BorderFactory.createTitledBorder("lpanel2"));
		lpanel3.setBorder(BorderFactory.createTitledBorder("lpanel3"));
		leftPanel.setBounds(0, 0, 300, 600);
		leftPanel.setLayout(new GridLayout(3, 1)); //3 rows, 1 column
		
		middlePanel.add(mpanel1);
		middlePanel.add(mpanel2);
		middlePanel.add(mpanel3);
		mpanel1.setBorder(BorderFactory.createTitledBorder("Models"));
		mpanel2.setBorder(BorderFactory.createTitledBorder("Extras"));
		mpanel3.setBorder(BorderFactory.createTitledBorder("Discounts"));
		middlePanel.setBounds(300, 0, 300, 600);
		middlePanel.setLayout(new GridLayout(3, 1)); //3 rows, 1 column
		
		rightPanel.add(rpanel1);
		rightPanel.add(rpanel2);
		rightPanel.add(rpanel3);
		rpanel1.setBorder(BorderFactory.createTitledBorder("Receipt"));
		rpanel2.setBorder(BorderFactory.createTitledBorder("rpanel2"));
		rpanel3.setBorder(BorderFactory.createTitledBorder("rpanel3"));
		rightPanel.setBounds(600, 0, 600, 600);
		rightPanel.setLayout(new GridLayout(3, 1)); //3 rows, 1 column
		
		
		JFrame frame = new JFrame();
		frame.setSize(900, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.add(leftPanel);
		frame.add(middlePanel);
		frame.add(rightPanel);
		frame.setTitle("Final Project");
		
		
	}
		
		
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
		//new CarDealer(); /*GUI*/
		Customer c = new Customer("Luis", "Lastname", "0000 NW 000th Ct", "Davie", "FL", "00000", "United States");
		S40 s4 = new S40(true, false, 0.0, false, false, true);
		S60 s6 = new S60();
		S70 s7 = new S70();
		S80 s8 = new S80(false, true, 5000, true, false, 2);
		System.out.println(c + "\n\n" + s4 + "\n" + s4.calculateSubTotal() + "\n" + s4.calculateTotal(s4.calculateSubTotal()) + "\n\n" + s6 + "\n\n" + s7 + "\n\n" + s8);
	}

}