import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;


//Profile Page Class
public class ProfileFunc implements ActionListener{
	JTextField usernameField;
	
	JButton createBtn;
	
	JLabel profileLabel;
	
	JFrame profileFrame = new JFrame("Create your profile!"); //Creates my profile page
	
	public ProfileFunc() {
		
		
		profileFrame.setLayout(new FlowLayout());
		
		profileFrame.setSize(400, 400);
		
		profileFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		usernameField = new JTextField(14);
		
		usernameField.setActionCommand("Username");
		
		JButton createBtn = new JButton("Create"); //Creates the createBtn
		
		createBtn.addActionListener(this);
		
		profileLabel = new JLabel("Please enter your username"); //Ask for user info
		
		profileFrame.add(usernameField);
		profileFrame.add(createBtn);
		profileFrame.add(profileLabel);
		
		profileFrame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		int n = 0;
		String temp = usernameField.getText();
		
		for(int i=0; i < temp.length(); i++) {
			
			if(Character.isDigit(temp.charAt(i))) {
				n = n+1;
			}
		}
		
		
		if(usernameField.getText().equals("")) {
			
			profileLabel.setText("Please enter a valid username."); // Checks to see if username is valid
			return;
			
		} else if (usernameField.getText().length() == n) {
			
			profileLabel.setText("Make sure you have a character in your username"); //Checks to see if username has characters
			return;
			
		} else {
			
			//ProfileDesc user1 = new ProfileDesc();
			ProfileDesc.user1.username = usernameField.getText(); //Assigns String username to that entered by the user
			System.out.println(ProfileDesc.user1.username);
			profileHours profileHours = new profileHours();
			profileHours.setVisible(true);
			profileFrame.dispose();
		}
	}
	
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new ProfileFunc();
			}
		});
	}
	
}

