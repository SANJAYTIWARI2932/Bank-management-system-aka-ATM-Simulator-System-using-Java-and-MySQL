package BankManagement;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;



public class LogIn extends JFrame implements ActionListener{
	
	JButton LogIn,signup,clear;
	JTextField cardTextField;
	JPasswordField pinTextField;
	LogIn(){
		setTitle("AUTOMATED TELLED MACHINE");
		
		setLayout(null);
		ImageIcon i1 = new ImageIcon(LogIn.class.getResource("/icones/logo.jpg"));
		Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel label1=new JLabel(i3);
		label1.setBounds(70,10,100,100);
		add(label1);
		
		JLabel text=new JLabel("Welcome To ATM");
		text.setBounds(200,40,400,40);
		text.setFont(new Font("Osward",Font.BOLD,38));
		add(text);
		
		JLabel cardno=new JLabel("Card Number:");
		cardno.setBounds(120,150,150,40);
		cardno.setFont(new Font("Raieway",Font.BOLD,20));
		add(cardno);
		
		cardTextField=new JTextField();
		cardTextField.setBounds(300,150,230,30);
		cardTextField.setFont(new Font("Arial" , Font.BOLD,14));
		add(cardTextField);
		
		JLabel pin=new JLabel("PIN:");
		pin.setBounds(120,220,250,30);
		pin.setFont(new Font("Raieway",Font.BOLD,20));
		add(pin);
		
		pinTextField=new JPasswordField();
		pinTextField.setBounds(300,220,230,30);
		pinTextField.setFont(new Font("Arial" , Font.BOLD,14));
		add(pinTextField);
		
		LogIn=new JButton("SIGN IN");
		LogIn.setBounds(300,300,100,30);
		LogIn.setBackground(Color.BLACK);
		LogIn.setForeground(Color.WHITE);
		LogIn.addActionListener(this);
		add(LogIn);
		
		clear=new JButton("CLEAR");
		clear.setBounds(430,300,100,30);
		clear.setBackground(Color.BLACK);
		clear.setForeground(Color.WHITE);
		clear.addActionListener(this);
		add(clear);
		
		signup=new JButton("SIGN UP");
		signup.setBounds(300,350,250,30);
		signup.setBackground(Color.BLACK);
		signup.setForeground(Color.WHITE);
		signup.addActionListener(this);
		add(signup);
		
		
		
		
		
		
		
		getContentPane().setBackground(Color.WHITE);
		setSize(800,480);
		setVisible(true);
		setLocation(350,200);
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==clear) {
			cardTextField.setText("");
			pinTextField.setText("");
		}
		else if(ae.getSource()==LogIn) {
			Conn conn=new Conn();
			String cardnumber=cardTextField.getText();
			String pinnumber=pinTextField.getText();
			String query="select * from login where cardnumber ='"+cardnumber+"' and pin='"+pinnumber+"'";
			
			try {
				ResultSet rs=conn.s.executeQuery(query);
				if(rs.next()) {
					setVisible(false);
					new Transaction(pinnumber).setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null,"Incorrect Card Number and Pin");
				}
				
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		else if(ae.getSource()==signup) {
			setVisible(false);
			new signupone().setVisible(true);
			
		}
		
	}
	
	
	



	public static void main(String[] args) {
		new LogIn(); 
	}

}
