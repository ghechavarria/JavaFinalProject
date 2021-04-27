package carDealerFamily;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.Enumeration;
import javax.swing.ImageIcon;


public class CarDealer extends JFrame{
	//GUI components declaration as fields
	private ImageIcon imageUser = new ImageIcon("userImage.png");
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
	
	public CarDealer() {
		//list for dropdown
		String country[] = {"United States", "Canada"};
		
		//GUI COMPONENTS
		//inside left panel
		picLabel = new JLabel("");
		carLabel = new JLabel("");
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
		nameDisplay = new JLabel("------  --------");
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
		signUpBtn.setBackground(Color.decode("#444B54"));
		calculateBtn.setBackground(Color.decode("#444B54"));
		exitBtn.setBackground(Color.decode("#444B54"));
		signUpBtn.setForeground(Color.WHITE);
		calculateBtn.setForeground(Color.WHITE);
		exitBtn.setForeground(Color.WHITE);
		leftPanel.setBackground(Color.decode("#E4E5E7"));
		rightPanel.setBackground(Color.decode("#D8DABE"));
		lpanel1.setBackground(Color.decode("#E4E5E7"));
		lpanel2.setBackground(Color.decode("#E4E5E7"));
		lpanel3.setBackground(Color.decode("#E4E5E7"));
		mpanel1.setBackground(Color.decode("#D8DABE"));
		mpanel2.setBackground(Color.decode("#D8DABE"));
		mpanel3.setBackground(Color.decode("#D8DABE"));
		rpanel1.setBackground(Color.decode("#E4E5E7"));
		rpanel2.setBackground(Color.decode("#E4E5E7"));
		rpanel3.setBackground(Color.decode("#E4E5E7"));
		
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
		
		rbS40.setBackground(Color.decode("#E4E5E7"));
		rbS60.setBackground(Color.decode("#E4E5E7"));
		rbS70.setBackground(Color.decode("#E4E5E7"));
		rbS80.setBackground(Color.decode("#E4E5E7"));
		
		packageA.setOpaque(true);
		packageB.setOpaque(true);
		metallicPaint.setOpaque(true);
		
		packageA.setBackground(Color.decode("#E4E5E7"));
		packageB.setBackground(Color.decode("#E4E5E7"));
		metallicPaint.setBackground(Color.decode("#E4E5E7"));
		
		discountsLabel.setOpaque(true);
		tradeIn.setOpaque(true);
		financing.setOpaque(true);
		payCash.setOpaque(true);
		
		discountsLabel.setBackground(Color.decode("#E4E5E7"));
		tradeIn.setBackground(Color.decode("#E4E5E7"));
		financing.setBackground(Color.decode("#E4E5E7"));
		payCash.setBackground(Color.decode("#E4E5E7"));
		
		customerID.setOpaque(true);
		idDisplay.setOpaque(true);
		customerName.setOpaque(true);
		nameDisplay.setOpaque(true);
		subtotal.setOpaque(true);
		subtotalDisplay.setOpaque(true);
		total.setOpaque(true);
		totalDisplay.setOpaque(true);
		
		customerID.setBackground(Color.decode("#E4E5E7"));
		idDisplay.setBackground(Color.decode("#E4E5E7"));
		customerName.setBackground(Color.decode("#E4E5E7"));
		nameDisplay.setBackground(Color.decode("#E4E5E7"));
		subtotal.setBackground(Color.decode("#E4E5E7"));
		subtotalDisplay.setBackground(Color.decode("#E4E5E7"));
		total.setBackground(Color.decode("#E4E5E7"));
		totalDisplay.setBackground(Color.decode("#E4E5E7"));
		
		//add layout manager
		//create layout for sub-panels
		leftPanel.setBounds(0, 0, 250, 550);
		leftPanel.setLayout(new GridLayout(3, 1)); //3 rows, 1 column
		leftPanel.setBorder(BorderFactory.createTitledBorder("Customer"));
		
		middlePanel.setBounds(300, 0, 250, 550);
		middlePanel.setLayout(new GridLayout(3, 1)); //3 rows, 1 column
		
		rightPanel.setBounds(600, 0, 250, 550);
		rightPanel.setLayout(new GridLayout(3, 1)); //3 rows, 1 column
		rightPanel.setBorder(BorderFactory.createTitledBorder("Receipt"));
		
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
		frame.setSize(865, 590);
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
			playAudio("sound.wav");

		});
		
		//CALCULATE ACTION LISTENER
		calculateBtn.addActionListener(e->{
			playAudio("sound.wav");
			
		});
		
		//EXIT ACTION LISTENER
		exitBtn.addActionListener(e->{
			playAudio("shutdown.wav");
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e1) {
				JOptionPane.showMessageDialog(null, "Exit Error");
			}
			System.exit(0);

		});

		
	}
	private class rbActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == rbS40) {
				if(rbS40.isSelected())
					packageB.setEnabled(false);
					packageA.setSelected(false);
					packageB.setSelected(false);

			}
			
			if(e.getSource() == rbS60) {
				if(rbS60.isSelected())
					packageB.setEnabled(false);
					packageA.setSelected(false);
					packageB.setSelected(false);
			}
			
			if(e.getSource() == rbS70) {
				if(rbS70.isSelected())
					packageB.setEnabled(true);
					packageA.setSelected(false);
					packageB.setSelected(false);
				

			}
			
			if(e.getSource() == rbS80) {
				if(rbS80.isSelected())
					packageB.setEnabled(true);
					packageA.setSelected(false);
					packageB.setSelected(false);
			}
			
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
//			if(calculateBtn.isSelected()) {
//
//			}
//
//			if(exitBtn.isSelected()) {
//				
//			}
//
		}
	}

	
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
		setUIFont (new javax.swing.plaf.FontUIResource("MonoLisa",Font.PLAIN,15));
		createLoadBar();
		new CarDealer(); /*GUI*/
		Customer c = new Customer("Luis", "Lastname", "0000 NW 000th Ct", "Davie", "FL", "00000", "United States");
		S40 s4 = new S40(true, false, 0.0, false, false, true);
		S60 s6 = new S60();
		S70 s7 = new S70();
		S80 s8 = new S80(false, true, 5000, true, false, 2);
		System.out.println(c + "\n\n" + s4 + "\n" + s4.calculateSubTotal() + "\n" + s4.calculateTotal(s4.calculateSubTotal()) + "\n\n" + s6 + "\n\n" + s7 + "\n\n" + s8);
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
            JOptionPane.showMessageDialog(null, "Music File Error");
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