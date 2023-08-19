package BankManagement;

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;


public class SignupTwo extends JFrame implements ActionListener{
	

	JTextField pan,Aadhar ;
	JButton next;
	JRadioButton syes,sno,eyes,eno;

	JComboBox religion,category,income,occapation,education;
	String formno;
	
	SignupTwo(String formno){
		this.formno=formno;
		
		setLayout(null);
		
		setTitle("NEW ACCOUNT APPLICATION FORM-PAGE 2");
		
		
		JLabel additionDetails=new JLabel("PAGE 2: Additional Details");
		additionDetails.setFont(new Font("Raleway",Font.BOLD,22));
		additionDetails.setBounds(290,80,400,30);
		add(additionDetails);
		
		JLabel Name=new JLabel("Religion:");
		Name.setFont(new Font("Raleway",Font.BOLD,20));
		Name.setBounds(100,140,100,30);
		add(Name);
		
		String vaiReligion[]={"Hindu","Muslim","Sikh","Christian","Other"};
		religion=new JComboBox(vaiReligion);
		religion.setBounds(300, 140, 400, 30);
		religion.setBackground(Color.white);
		add(religion);
		
		JLabel Fname=new JLabel("Category:");
		Fname.setFont(new Font("Raleway",Font.BOLD,20));
		Fname.setBounds(100,190,200,30);
		add(Fname);
		
		String vaicategory[]= {"General","OBC","SC","ST","Other"};
		category=new JComboBox(vaicategory);
		category.setBounds(300, 190, 400, 30);
		category.setBackground(Color.white);
		add(category);
		
		
		JLabel dob=new JLabel("Income:");
		dob.setFont(new Font("Raleway",Font.BOLD,20));
		dob.setBounds(100,240,200,30);
		add(dob);
		
		String incomecategory[]= {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000"};
		income=new JComboBox(incomecategory);
		income.setBounds(300, 240, 400, 30);
		income.setBackground(Color.white);
		add(income);
		
		
		
		
		JLabel gender=new JLabel("Educational:");
		gender.setFont(new Font("Raleway",Font.BOLD,20));
		gender.setBounds(100,290,200,30);
		add(gender);
		
		
		JLabel email=new JLabel("Qualification:");
		email.setFont(new Font("Raleway",Font.BOLD,20));
		email.setBounds(100,320,200,30);
		add(email);
		
		String educationavalues[]= {"Non Graduation","Graduation","Post Graduation","Doctrate","Other"};
		education=new JComboBox(educationavalues);
		education.setBounds(300, 320, 400, 30);
		education.setBackground(Color.white);
		add(education);
		
		JLabel marital=new JLabel("Occupation:");
		marital.setFont(new Font("Raleway",Font.BOLD,20));
		marital.setBounds(100,390,200,30);
		add(marital);
		
		String occapationvalues[]= {"Salaried","Self Employed","Bussiness","Student","Retired","Other"};
		occapation=new JComboBox(occapationvalues);
		occapation.setBounds(300, 390, 400, 30);
		occapation.setBackground(Color.white);
		add(occapation);
		
		
		
		
		
		JLabel panno=new JLabel("Pin Number:");
		panno.setFont(new Font("Raleway",Font.BOLD,20));
		panno.setBounds(100,440,200,30);
		add(panno);
		
		pan=new JTextField();
		pan.setFont(new Font("Raleway",Font.BOLD,14));
		pan.setBounds(300, 440, 400, 30);
		add(pan);
		
		JLabel Aadharno=new JLabel("Aadhar Number:");
		Aadharno.setFont(new Font("Raleway",Font.BOLD,20));
		Aadharno.setBounds(100,490,200,30);
		add(Aadharno);
		
		Aadhar=new JTextField();
		Aadhar.setFont(new Font("Raleway",Font.BOLD,14));
		Aadhar.setBounds(300, 490, 400, 30);
		add(Aadhar);
		
		JLabel state=new JLabel("Senior Citizen:");
		state.setFont(new Font("Raleway",Font.BOLD,20));
		state.setBounds(100,540,200,30);
		add(state);
		
		
		syes=new JRadioButton("Yes");
		syes.setBounds(300,540,100,30);
		syes.setBackground(Color.white);
		add(syes);
		
		sno=new JRadioButton("No");
		sno.setBounds(450,540,100,30);
		sno.setBackground(Color.white);
		add(sno);
		

		ButtonGroup maritalgroup=new ButtonGroup();
		maritalgroup.add(syes);
		maritalgroup.add(sno);

		
		
		
		JLabel pincode=new JLabel("Existing Account:");
		pincode.setFont(new Font("Raleway",Font.BOLD,20));
		pincode.setBounds(100,590,200,30);
		add(pincode);
		
		
		eyes=new JRadioButton("Yes");
		eyes.setBounds(300,590,100,30);
		eyes.setBackground(Color.white);
		add(eyes);
		
		eno=new JRadioButton("No");
		eno.setBounds(450,590,100,30);
		eno.setBackground(Color.white);
		add(eno);
		

		ButtonGroup emaritalgroup=new ButtonGroup();
		emaritalgroup.add(eyes);
		emaritalgroup.add(eno);

		
		
		next=new JButton("Next");
		next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		next.setFont(new Font("Raleway", Font.BOLD,14));
		next.setBounds(620,660,80,30);
		next.addActionListener(this);
		add(next);
		
		getContentPane().setBackground(Color.WHITE);
		setSize(850,800);
		setLocation(350,10);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		//String formno="";
		String sreligion=(String) religion.getSelectedItem();
		String scategory=(String) category.getSelectedItem();
		String sincome=(String) income.getSelectedItem();
		String seducation=(String) education.getSelectedItem();
		String soccupation=(String) occapation.getSelectedItem();
		
		
		String seniorcitizen=null;
		if(syes.isSelected()) {
			seniorcitizen="Yes";
		}else if(sno.isSelected()){
			seniorcitizen="No";
			
		}
		
		String existingaccount=null;
		if(eyes.isSelected()) {
			existingaccount="Yes";
		}else if(eno.isSelected()) {
			existingaccount="No";
		}
		
		
		String span=pan.getText();
		String saadhar=Aadhar.getText();
		
		try {
					Conn c=new Conn();
					String query="insert into signuptwo values('"+formno+"', '"+sreligion+"', '"+scategory+"', '"+sincome+"','"+seducation+"', '"+soccupation+"', '"+span+"','"+saadhar+"','"+seniorcitizen+"','"+existingaccount+"')";
					c.s.executeUpdate(query);
					
				//signup3 object
					setVisible(false);
					new signupThree(formno).setVisible(true);
			
		}catch(Exception e){
			System.out.println(e);
			
		}
		
		
	}
	
	public static void main(String[] args) {
		new SignupTwo("");
	}
}