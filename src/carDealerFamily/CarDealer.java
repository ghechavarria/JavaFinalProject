package carDealerFamily;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.Enumeration;


public class CarDealer extends JFrame{
	//GUI components declaration as fields
	private ImageIcon imageUser = new ImageIcon("userImage2.png");
	private ImageIcon carPicture = new ImageIcon("car.png");
	private JLabel picLabel;
	private JLabel carLabel;
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
	
	private double tiValue = 0;
	private JLabel tiValueLabel;
	private JTextField tiValueText;
	
	private String fnValue, lnValue, aValue, cValue, sValue, zValue, ctrValue;
	
	public CarDealer() {
		//list for dropdown
		String country[] = {"United States", "Canada"};
		
		//GUI COMPONENTS
		//inside left panel
		picLabel = new JLabel("");
		carLabel = new JLabel("");
		fNameLabel = new JLabel(" First Name");
		fName = new JTextField();
		lNameLabel = new JLabel(" Last Name");
		lName = new JTextField();
		addressLabel = new JLabel(" Address");
		address = new JTextField();
		cityLabel = new JLabel(" City");	
		city = new JTextField();
		stateLabel = new JLabel(" State");
		state = new JTextField();
		zipLabel = new JLabel(" ZIP");
		zip = new JTextField();
		countryLabel = new JLabel(" Country");
		countryDropDown = new JComboBox(country);
		signUpBtn = new JButton("Sign Up");
		
		//inside middle panel
		bgModels = new ButtonGroup();
		rbS40 = new JRadioButton("S40  ($27,700)");
		rbS60 = new JRadioButton("S60  ($32,500)");
		rbS70 = new JRadioButton("S70  ($36,000)");
		rbS80 = new JRadioButton("S80  ($44,000)");
		
		packageA = new JCheckBox("Package A  (+$2,200)");
		packageB = new JCheckBox("Package B  (+$3,250)");
		metallicPaint = new JCheckBox("Metallic Paint  (+$650)");
		
		discountsLabel = new JLabel("Discounts");
		tradeIn = new JCheckBox("Trade-In");
		tiValueLabel = new JLabel(" Trade-In Value: ");
		tiValueText = new JTextField();
		financing = new JCheckBox("Financing  (-7%)");
		payCash = new JCheckBox("Pay Cash  (-$750)");
		
		//inside right panel
		customerID = new JLabel(" Customer ID: ");
		idDisplay = new JLabel("------");
		customerName = new JLabel(" Customer Name: ");
		nameDisplay = new JLabel("---------  ------------");
		subtotal = new JLabel(" Subtotal: ");
		subtotalDisplay = new JLabel("$-----.00");
		total = new JLabel(" Total: ");
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
		
		//add colors
		signUpBtn.setBackground(Color.decode("#7B7C3C"));
		calculateBtn.setBackground(Color.decode("#7B7C3C"));
		exitBtn.setBackground(Color.decode("#7B7C3C"));
		signUpBtn.setForeground(Color.WHITE);
		calculateBtn.setForeground(Color.WHITE);
		exitBtn.setForeground(Color.WHITE);
		
		signUpBtn.setBorderPainted(false);
		calculateBtn.setBorderPainted(false);
		exitBtn.setBorderPainted(false);
		signUpBtn.setBorder(BorderFactory.createEmptyBorder(10,35,10,35));
		calculateBtn.setBorder(BorderFactory.createEmptyBorder(10,25,10,25));
		exitBtn.setBorder(BorderFactory.createEmptyBorder(10,45,10,45));
		
		leftPanel.setBackground(Color.decode("#E4E5E7"));
		rightPanel.setBackground(Color.decode("#f5f5f5"));
		lpanel1.setBackground(Color.decode("#E4E5E7"));
		lpanel2.setBackground(Color.decode("#E4E5E7"));
		lpanel3.setBackground(Color.decode("#E4E5E7"));
		mpanel1.setBackground(Color.decode("#f5f5f5"));
		mpanel2.setBackground(Color.decode("#f5f5f5"));
		mpanel3.setBackground(Color.decode("#f5f5f5"));
		rpanel1.setBackground(Color.decode("#f5f5f5"));
		rpanel2.setBackground(Color.decode("#f5f5f5"));
		rpanel3.setBackground(Color.decode("#f5f5f5"));
		
		fNameLabel.setOpaque(true);
		lNameLabel.setOpaque(true);
		addressLabel.setOpaque(true);
		addressLabel.setOpaque(true);
		cityLabel.setOpaque(true);
		stateLabel.setOpaque(true);
		zipLabel.setOpaque(true);
		countryLabel.setOpaque(true);
		fNameLabel.setBackground(Color.decode("#E4E5E7"));
		lNameLabel.setBackground(Color.decode("#E4E5E7"));
		addressLabel.setBackground(Color.decode("#E4E5E7"));
		cityLabel.setBackground(Color.decode("#E4E5E7"));
		stateLabel.setBackground(Color.decode("#E4E5E7"));
		zipLabel.setBackground(Color.decode("#E4E5E7"));
		countryLabel.setBackground(Color.decode("#E4E5E7"));
		
		rbS40.setOpaque(true);
		rbS60.setOpaque(true);
		rbS70.setOpaque(true);
		rbS80.setOpaque(true);
		
		rbS40.setBackground(Color.decode("#f5f5f5"));
		rbS60.setBackground(Color.decode("#f5f5f5"));
		rbS70.setBackground(Color.decode("#f5f5f5"));
		rbS80.setBackground(Color.decode("#f5f5f5"));
		
		packageA.setOpaque(true);
		packageB.setOpaque(true);
		metallicPaint.setOpaque(true);
		
		packageA.setBackground(Color.decode("#f5f5f5"));
		packageB.setBackground(Color.decode("#f5f5f5"));
		metallicPaint.setBackground(Color.decode("#f5f5f5"));
		
		discountsLabel.setOpaque(true);
		tradeIn.setOpaque(true);
		financing.setOpaque(true);
		payCash.setOpaque(true);
		
		discountsLabel.setBackground(Color.decode("#f5f5f5"));
		tradeIn.setBackground(Color.decode("#f5f5f5"));
		financing.setBackground(Color.decode("#f5f5f5"));
		payCash.setBackground(Color.decode("#f5f5f5"));
		
		customerID.setOpaque(true);
		idDisplay.setOpaque(true);
		customerName.setOpaque(true);
		nameDisplay.setOpaque(true);
		subtotal.setOpaque(true);
		subtotalDisplay.setOpaque(true);
		total.setOpaque(true);
		totalDisplay.setOpaque(true);
		
		customerID.setBackground(Color.decode("#f5f5f5"));
		idDisplay.setBackground(Color.decode("#f5f5f5"));
		customerName.setBackground(Color.decode("#f5f5f5"));
		nameDisplay.setBackground(Color.decode("#f5f5f5"));
		subtotal.setBackground(Color.decode("#f5f5f5"));
		subtotalDisplay.setBackground(Color.decode("#f5f5f5"));
		total.setBackground(Color.decode("#f5f5f5"));
		totalDisplay.setBackground(Color.decode("#f5f5f5"));
		
		//add layout manager
		//create layout for sub-panels
		leftPanel.setBounds(0, 0, 300, 550);
		leftPanel.setLayout(new GridLayout(3, 1)); //3 rows, 1 column
		leftPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.decode("#A5AA6A"), 2, true),"Customer"));
		((javax.swing.border.TitledBorder)leftPanel.getBorder()).setTitleColor(Color.decode("#444B54"));
		((javax.swing.border.TitledBorder)leftPanel.getBorder()).setTitleFont(new Font("MonoLisa", Font.BOLD, 18));
		
		middlePanel.setBounds(300, 0, 300, 550);
		middlePanel.setLayout(new GridLayout(3, 1)); //3 rows, 1 column
		
		rightPanel.setBounds(600, 0, 300, 550);
		rightPanel.setLayout(new GridLayout(3, 1)); //3 rows, 1 column
		rightPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.decode("#A5AA6A"), 2, true),"Receipt"));
		((javax.swing.border.TitledBorder)rightPanel.getBorder()).setTitleColor(Color.decode("#444B54"));
		((javax.swing.border.TitledBorder)rightPanel.getBorder()).setTitleFont(new Font("MonoLisa", Font.BOLD, 18));
		
		//create panel for Image
		leftPanel.add(lpanel1);
		picLabel.setIcon(imageUser);
		lpanel1.add(picLabel);
		
		//create panel for text fields to enter user information
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
		
		//create panel for submit button
		leftPanel.add(lpanel3);
		//add submit button
		lpanel3.add(signUpBtn);
		
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
		mpanel1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.decode("#A5AA6A"), 2, true),"Models"));
		((javax.swing.border.TitledBorder)mpanel1.getBorder()).setTitleColor(Color.decode("#444B54"));
		((javax.swing.border.TitledBorder)mpanel1.getBorder()).setTitleFont(new Font("MonoLisa", Font.BOLD, 18));
		
		//create panel for Extras
		middlePanel.add(mpanel2);
		//add check boxes to panel
		mpanel2.add(packageA);
		mpanel2.add(packageB);
		mpanel2.add(metallicPaint);		
		//set layout for check boxes
		mpanel2.setLayout(new GridLayout(3,1));
		//create border for Extras panel
		mpanel2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.decode("#A5AA6A"), 2, true),"Extras"));
		((javax.swing.border.TitledBorder)mpanel2.getBorder()).setTitleColor(Color.decode("#444B54"));
		((javax.swing.border.TitledBorder)mpanel2.getBorder()).setTitleFont(new Font("MonoLisa", Font.BOLD, 18));
		
		
		//create panel for Discounts
		middlePanel.add(mpanel3);
		//add check boxes to panel
		mpanel3.add(tradeIn);
		mpanel3.add(tiValueLabel);
		mpanel3.add(tiValueText);
		tiValueText.setText("0.0");
		tiValueText.setEditable(false);
		mpanel3.add(financing);
		mpanel3.add(payCash);
		//set layout for check boxes
		mpanel3.setLayout(new GridLayout(5,1));
		//create border for Discounts panel
		mpanel3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.decode("#A5AA6A"), 2, true),"Discounts"));
		((javax.swing.border.TitledBorder)mpanel3.getBorder()).setTitleColor(Color.decode("#444B54"));
		((javax.swing.border.TitledBorder)mpanel3.getBorder()).setTitleFont(new Font("MonoLisa", Font.BOLD, 18));
		
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
				
		
		//add panel for calculate and exit buttons
		rightPanel.add(rpanel2);
		//add calculate and exit buttons
		rpanel2.add(calculateBtn);
		rpanel2.add(exitBtn);
		
		//car picture panel
		rightPanel.add(rpanel3);
		carLabel.setIcon(carPicture);
		rpanel3.add(carLabel);
		
		
		//configure JFrame
		//add components to window
		//add to window
		//set window parameters
		JFrame frame = new JFrame();
		frame.setSize(917, 590);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.add(leftPanel);
		frame.add(middlePanel);
		frame.add(rightPanel);
		frame.setTitle("Final Project");
		
		//SIGN UP ACTION LISTENER
		signUpBtn.addActionListener(e->{
			//button audio
			playAudio("sound.wav");
			//get input data
			//fName, lName, address, city, state, zip
			fnValue = lnValue = aValue = cValue = sValue = zValue = ctrValue = "";
			fnValue = fName.getText();
			lnValue = lName.getText();
			aValue = address.getText();
			cValue = city.getText();
			sValue = state.getText();
			zValue = zip.getText();
			ctrValue = countryDropDown.getSelectedItem().toString();
			
			//test fields
			//System.out.println(fnValue + " " + lnValue + " " + aValue + " " + cValue + " " + sValue + " " + zValue + " " + ctrValue);
			
			//if all values have been inputted
			if (!fnValue.isEmpty() && !lnValue.isEmpty() && !aValue.isEmpty() && !cValue.isEmpty() && !sValue.isEmpty() && !zValue.isEmpty()) {
				//create new Customer object
				Customer customer = new Customer(fnValue, lnValue, aValue, cValue, sValue, zValue, ctrValue);
				//display customer id and name in receipt section
				idDisplay.setText(customer.getID());
				nameDisplay.setText(customer.getfName() + " " + customer.getlName());
			} else {
				JOptionPane.showMessageDialog(null, "Input Error...Fill in all Customer fields.", "Warning", 2);
			}
			
		});
		
		//CALCULATE ACTION LISTENER
		calculateBtn.addActionListener(e->{
			//button audio
			playAudio("sound.wav");
			Boolean aPackage, metallic, trade, finance, cash;
			aPackage = metallic = trade = finance = cash = false;
			int packages = 0;
			try {
				if(!fnValue.isEmpty() || !lnValue.isEmpty() || !aValue.isEmpty() || !cValue.isEmpty() || !sValue.isEmpty() || !zValue.isEmpty()) {
					if(rbS40.isSelected()) {
						if (packageA.isSelected())
							aPackage = true;
						if (metallicPaint.isSelected())
							metallic = true;
						if (tradeIn.isSelected()) {
							trade = true;
							try {
							tiValue = Double.parseDouble(tiValueText.getText());
							}catch(NumberFormatException ex){
								JOptionPane.showMessageDialog(null, "Not a number...");
								tiValueText.setText("0.0");
							}
						}
						if (financing.isSelected())
							finance = true;
						if (payCash.isSelected())
							cash = true;
						S40 s40 = new S40(metallic,trade,tiValue,finance,cash,aPackage);
						subtotalDisplay.setText("$" + s40.calculateSubTotal());
						totalDisplay.setText("$" + s40.calculateTotal(s40.calculateSubTotal()));
		
						
					}
		
					
					if(rbS60.isSelected()) {
						if (packageA.isSelected())
							aPackage = true;
						if (metallicPaint.isSelected())
							metallic = true;
						if (tradeIn.isSelected()) {
							trade = true;
							try {
							tiValue = Double.parseDouble(tiValueText.getText());
							}catch(NumberFormatException ex){
								JOptionPane.showMessageDialog(null, "Not a number...");
								tiValueText.setText("0.0");
							}
						}
						if (financing.isSelected())
							finance = true;
						if (payCash.isSelected())
							cash = true;
						S60 s60 = new S60(metallic,trade,tiValue,finance,cash,aPackage);
						subtotalDisplay.setText("$" + s60.calculateSubTotal());
						totalDisplay.setText("$" + s60.calculateTotal(s60.calculateSubTotal()));
					}
					
					
					if(rbS70.isSelected()) {
						if (packageA.isSelected())
							packages = 1;
						if (packageB.isSelected())
							packages = 2;
						if (metallicPaint.isSelected())
							metallic = true;
						if (tradeIn.isSelected()) {
							trade = true;
							try {
							tiValue = Double.parseDouble(tiValueText.getText());
							}catch(NumberFormatException ex){
								JOptionPane.showMessageDialog(null, "Not a number...", "Error", 2);
								tiValueText.setText("0.0");
							}
						}
						if (financing.isSelected())
							finance = true;
						if (payCash.isSelected())
							cash = true;
						S70 s70 = new S70(metallic,trade,tiValue,finance,cash,packages);
						subtotalDisplay.setText("$" + s70.calculateSubTotal());
						totalDisplay.setText("$" + s70.calculateTotal(s70.calculateSubTotal()));
					}
							
		
					if(rbS80.isSelected()) {
						if (packageA.isSelected())
							packages = 1;
						if (packageB.isSelected())
							packages = 2;
						if (metallicPaint.isSelected())
							metallic = true;
						if (tradeIn.isSelected()) {
							trade = true;
							try {
							tiValue = Double.parseDouble(tiValueText.getText());
							}catch(NumberFormatException ex){
								JOptionPane.showMessageDialog(null, "Not a number...", "Error", 2);
								tiValueText.setText("0.0");
							}
						}
						if (financing.isSelected())
							finance = true;
						if (payCash.isSelected())
							cash = true;
						S80 s80 = new S80(metallic,trade,tiValue,finance,cash,packages);
						subtotalDisplay.setText("$" + s80.calculateSubTotal());
						totalDisplay.setText("$" + s80.calculateTotal(s80.calculateSubTotal()));
					}
	
				}
			}catch(NullPointerException ex) {
				JOptionPane.showMessageDialog(null, "Sign Up before calculation...", "Error", 2);
			}
			
		});
		
		//EXIT ACTION LISTENER
		exitBtn.addActionListener(e->{
			//button audio
			playAudio("shutdown.wav");
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e1) {
				JOptionPane.showMessageDialog(null, "Exit Error", "Error", 2);
			}
			//exit java program
			System.exit(0);

		});

		
	}
	private class rbActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == rbS40) {
				if(rbS40.isSelected()) {
					packageB.setEnabled(false);
					packageA.setSelected(false);
					packageB.setSelected(false);
				}

			}
			
			if(e.getSource() == rbS60) {
				if(rbS60.isSelected()) {
					packageB.setEnabled(false);
					packageA.setSelected(false);
					packageB.setSelected(false);
				}
			}
			
			if(e.getSource() == rbS70) {
				if(rbS70.isSelected()) {
					packageB.setEnabled(true);
					packageA.setSelected(false);
					packageB.setSelected(false);
				}
				

			}
			
			if(e.getSource() == rbS80) {
				if(rbS80.isSelected()) {
					packageB.setEnabled(true);
					packageA.setSelected(false);
					packageB.setSelected(false);
				}
			}
			
		}
	}
	
//	private class buttonListener implements ActionListener{
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			if(signUpBtn.isSelected()){
//
//			}
//
//			if(calculateBtn.isSelected()) {
//
//			}
//
//			if(exitBtn.isSelected()) {
//				
//			}
//
//		}
//	}

	
	private class CheckListener implements ItemListener{
		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getSource() == packageA) {
				if(packageA.isSelected())
			 		packageB.setEnabled(false);
				else
					packageB.setEnabled(true);
			}
			
			if(e.getSource() == packageB) {
				if(packageB.isSelected())
			 		packageA.setEnabled(false);
				else
					packageA.setEnabled(true);
			}
			
			if(e.getSource() == tradeIn) {
				if(tradeIn.isSelected()) {
					tiValueText.setEditable(true);
				}else {
					tiValueText.setText("0.0");
					tiValueText.setEditable(false);
				}
			}
			
		}
	}

	public static void main(String[] args) {
		setUIFont (new javax.swing.plaf.FontUIResource("MonoLisa",Font.PLAIN,16));
		createLoadBar();
		new CarDealer(); /*GUI*/
		
		//Customer c = new Customer("Luis", "Lastname", "0000 NW 000th Ct", "Davie", "FL", "00000", "United States");
		//S40 s4 = new S40(true, false, 0.0, false, false, true);
		//S60 s6 = new S60();
		//S70 s7 = new S70();
		//S80 s8 = new S80(false, true, 5000, true, false, 2);
		//System.out.println(c + "\n\n" + s4 + "\n" + s4.calculateSubTotal() + "\n" + s4.calculateTotal(s4.calculateSubTotal()) + "\n\n" + s6 + "\n\n" + s7 + "\n\n" + s8);
	
	}//end of main
	
	
	public void playAudio(String musicFilePath){
        File musicPath = new File(musicFilePath);
        try {
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInput);
            clip.start();
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Music File Error", "Error", 2);
        }
    }//end of playAudio
	
	public static void createLoadBar() {
        //Welcome the user to the program.
        LoadingBar loadingBar = new LoadingBar();
        loadingBar.setLocationRelativeTo(null);
        loadingBar.setVisible(true);
        loadingBar.load();
        loadingBar.dispose();
    }//end of createLoadBar
	
	public static void setUIFont (javax.swing.plaf.FontUIResource f){
	    Enumeration keys = UIManager.getDefaults().keys();
	    while (keys.hasMoreElements()) {
	      Object key = keys.nextElement();
	      Object value = UIManager.get (key);
	      if (value instanceof javax.swing.plaf.FontUIResource)
	        UIManager.put (key, f);
	      }
	    } //end of setUIFont
	

}//end of class