import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.*;
import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Arrays;



public class profileHours extends JFrame implements ActionListener {

	public JPanel hoursPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					profileHours frame = new profileHours();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//Creates hours panel
	JPanel hours = new JPanel(new GridLayout(6, 4));
	JLabel hoursLabel = new JLabel();
	JButton hoursEnter = new JButton("Enter");
	
	//Creates others panel
	JPanel others = new JPanel(new GridLayout(6, 4));
	JRadioButton rdbtnMale = new JRadioButton("Male");
	JRadioButton rdbtnFemale = new JRadioButton("Female");
	JRadioButton rdbtnOther = new JRadioButton("Other");
	JLabel lblAge = new JLabel("Please enter your age.");
	JTextField txtAge = new JTextField();
	JTextField txtDescriptionOfYourself = new JTextField();
	JButton othersEnter = new JButton("Create my profile!");
	
	//Creates profile panel
	JPanel profilePage = new JPanel(new GridLayout(5, 2));
	JLabel showUser = new JLabel("");
	JLabel showHours = new JLabel("");
	JLabel showGender = new JLabel("");
	JLabel showAge = new JLabel("");
	JLabel showDesc = new JLabel("");
	
	public profileHours() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 720, 720);
		hoursPane = new JPanel();
		hoursPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		hoursPane.setLayout(new BorderLayout(0, 0));
		setContentPane(hoursPane);
		
		JPanel hoursHead = new JPanel();
		hoursPane.add(hoursHead, BorderLayout.NORTH);
		
		
		hoursPane.add(hoursEnter, BorderLayout.SOUTH);
		hoursEnter.addActionListener(this);
		
		
		hoursHead.add(hoursLabel = new JLabel("Please select all times you are available to train."));
		
		
		hoursPane.add(hours, BorderLayout.CENTER);
		

		// Creates all the checkboxes for all hours available
		JCheckBox check = new JCheckBox("12am - 1am");
	    hours.add(check);
	    check = new JCheckBox("1am - 2am");
	    hours.add(check);
	    check = new JCheckBox("2am - 3am");
	    hours.add(check);
	    check = new JCheckBox("3am - 4am");
	    hours.add(check);
	    check = new JCheckBox("4am - 5am");
	    hours.add(check);
	    check = new JCheckBox("5am - 6am");
	    hours.add(check);
	    check = new JCheckBox("6am - 7am");
	    hours.add(check);
	    check = new JCheckBox("7am - 8am");
	    hours.add(check);
	    check = new JCheckBox("8am - 9am");
	    hours.add(check);
	    check = new JCheckBox("9am - 10am");
	    hours.add(check);
	    check = new JCheckBox("10am - 11am");
	    hours.add(check);
	    check = new JCheckBox("11am - 12pm");
	    hours.add(check);
	    check = new JCheckBox("12pm - 1pm");
	    hours.add(check);
	    check = new JCheckBox("1pm - 2pm");
	    hours.add(check);
	    check = new JCheckBox("2pm - 3pm");
	    hours.add(check);
	    check = new JCheckBox("3pm - 4pm");
	    hours.add(check);
	    check = new JCheckBox("4pm - 5pm");
	    hours.add(check);
	    check = new JCheckBox("5pm - 6pm");
	    hours.add(check);
	    check = new JCheckBox("6pm - 7pm");
	    hours.add(check);
	    check = new JCheckBox("7pm - 8pm");
	    hours.add(check);
	    check = new JCheckBox("8pm - 9pm");
	    hours.add(check);
	    check = new JCheckBox("9pm - 10pm");
	    hours.add(check);
	    check = new JCheckBox("10pm - 11pm");
	    hours.add(check);
	    check = new JCheckBox("11pm - 12am");
	    hours.add(check);
	    
	    
	    //Creates gender section
	    JLabel gender = new JLabel("Select your gender.");
	    others.add(gender);
	    
	   
	    others.add(rdbtnMale);
	    others.add(rdbtnFemale);
	    others.add(rdbtnOther);
	    
	    
	    //Creates age section
	    others.add(lblAge);
	    
	    txtAge.setText("age");
	    others.add(txtAge);
	    txtAge.setColumns(10);
	    
	    JLabel label = new JLabel("");
	    others.add(label);
	    
	    JLabel label_1 = new JLabel("");
	    others.add(label_1);
	    
	    
	    //Creates desccription section
	    JLabel Details = new JLabel("Please enter a short description of yourself");
	    others.add(Details);
	    
	    txtDescriptionOfYourself.setText("Description of yourself");
	    others.add(txtDescriptionOfYourself);
	    txtDescriptionOfYourself.setColumns(10);
	    
	    JLabel showUserTitle = new JLabel("Profile name:");
	    profilePage.add(showUserTitle);
	    
	    profilePage.add(showUser);
	    
	    JLabel showHoursTitle = new JLabel("Hours available:");
	    profilePage.add(showHoursTitle);
	    
	    profilePage.add(showHours);
	    
	    JLabel showGenderTitle = new JLabel("Gender:");
	    profilePage.add(showGenderTitle);
	    
	    profilePage.add(showGender);
	    
	    JLabel showAgeTitle = new JLabel("Age:");
	    profilePage.add(showAgeTitle);
	    
	    profilePage.add(showAge);
	    
	    JLabel showDescTitle = new JLabel("About me:");
	    profilePage.add(showDescTitle);
	    
	    profilePage.add(showDesc);
	    
	    //Shows the user the hours section first
	    others.setVisible(false);
	    othersEnter.setVisible(false);
	    hoursEnter.setVisible(true);

	}

	
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == hoursEnter) {
			System.out.println("oy");
			int n = 0;
			Component[] components = hours.getComponents();
			
	        for ( Component c : components ) {
	        	JCheckBox cb = (JCheckBox)c;
	        	if (cb.isSelected()) {
	        		System.out.println(cb.getText());
	        		ProfileDesc.user1.hoursArray[n] = cb.getText();
	        		System.out.println(Arrays.toString(ProfileDesc.user1.hoursArray));
	        		n++;		
	        	}
	        
	        //Sets up page for the sections after hours
	        hoursLabel.setText("");
	        hoursPane.add(others, BorderLayout.CENTER);
	        hours.setVisible(false);
	        others.setVisible(true);
	        hoursPane.add(othersEnter, BorderLayout.SOUTH);
			othersEnter.addActionListener(this);
			othersEnter.setVisible(true);
	        hoursEnter.setVisible(false);
	        
	        
	        }    
		}
		
		if(ae.getSource() == othersEnter) {
			
			if(rdbtnMale.isSelected()) {
				ProfileDesc.user1.gender = rdbtnMale.getText();
			} else if(rdbtnFemale.isSelected()) {
				ProfileDesc.user1.gender = rdbtnFemale.getText();
			} else if(rdbtnOther.isSelected()) {
				ProfileDesc.user1.gender = rdbtnOther.getText();
			} else {
				ProfileDesc.user1.gender = "N/A";
			}
			
			System.out.println(ProfileDesc.user1.gender);
			String temp = txtAge.getText();
			char tempChar = temp.charAt(0);
			
			if(txtAge.getText() == "") {
				ProfileDesc.user1.age = "N/A";
			} else if(Character.isLetter(tempChar)){
				lblAge.setText("Please enter a valid age");
				lblAge.setOpaque(true);
				lblAge.setBackground(Color.RED);
				return;
			} else {
				ProfileDesc.user1.age = txtAge.getText();
			}
			
			ProfileDesc.user1.description = txtDescriptionOfYourself.getText();
			
			System.out.println("You reached here!");
			hoursPane.add(profilePage, BorderLayout.CENTER);
			others.setVisible(false);
			profilePage.setVisible(true);
			othersEnter.setVisible(false);
			
			
			for(int i = 0; i < 5; i++) {
				String tempHours = "";
				//System.out.println(ProfileDesc.user1.hoursArray[i]);
				
				if(ProfileDesc.user1.hoursArray[i] != null) {
					tempHours = tempHours + "\n" + ProfileDesc.user1.hoursArray[i];
					System.out.println(i);
					System.out.println(tempHours);
					showHours.setText(tempHours);
				}
					
			}
			
			showUser.setText(ProfileDesc.user1.username);
			showGender.setText(ProfileDesc.user1.gender);
			showAge.setText(ProfileDesc.user1.age);
			showDesc.setText(ProfileDesc.user1.description);
			
		}
		
	}
}
