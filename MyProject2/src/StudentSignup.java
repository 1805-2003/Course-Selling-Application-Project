import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import com.toedter.calendar.JDateChooser;



import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class StudentSignup {

	private JFrame frame;
	private JTextField txtfirstname;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtlastname;
	private JTextField txtmobileno;
	private JTextField txtemail;
	private JPasswordField txtpassword;
	private JPasswordField txtconfirmpassword;
	private JTextField txtusername;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentSignup window = new StudentSignup();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StudentSignup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		Toolkit kit= Toolkit.getDefaultToolkit();
		Dimension dim= kit.getScreenSize();
		int width=(int)dim.getWidth();
		int height=(int)dim.getHeight();
		frame.setSize(565, 746);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
	frame.setBounds(100, 100, 565, 738);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Param infosystem");
		lblNewLabel_2.setFont(new Font("Perpetua Titling MT", Font.BOLD, 30));
		lblNewLabel_2.setBounds(128, 25, 425, 54);
		frame.getContentPane().add(lblNewLabel_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(146, 63, 305, 2);
		frame.getContentPane().add(separator);
		
		JLabel lblNewLabel_4 = new JLabel("An Education Venture");
		lblNewLabel_4.setFont(new Font("Georgia", Font.BOLD, 20));
		lblNewLabel_4.setBounds(177, 47, 342, 54);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(32, 184, 110, 33);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Last  Name");
		lblNewLabel_1_1.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(32, 227, 110, 33);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Mobile NO");
		lblNewLabel_1_2.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(32, 270, 110, 33);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Address");
		lblNewLabel_1_3.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblNewLabel_1_3.setBounds(32, 313, 110, 33);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Gender ");
		lblNewLabel_1_4.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblNewLabel_1_4.setBounds(32, 399, 110, 33);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("DOB");
		lblNewLabel_1_4_1.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblNewLabel_1_4_1.setBounds(32, 442, 110, 33);
		frame.getContentPane().add(lblNewLabel_1_4_1);
		
		JLabel lblNewLabel_1_4_2 = new JLabel("Email");
		lblNewLabel_1_4_2.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblNewLabel_1_4_2.setBounds(32, 485, 110, 33);
		frame.getContentPane().add(lblNewLabel_1_4_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Password");
		lblNewLabel_1_1_1.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(32, 528, 110, 33);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Confirm Password");
		lblNewLabel_1_1_2.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblNewLabel_1_1_2.setBounds(32, 571, 177, 33);
		frame.getContentPane().add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Profile Photo");
		lblNewLabel_1_1_2_1.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblNewLabel_1_1_2_1.setBounds(32, 614, 165, 33);
		frame.getContentPane().add(lblNewLabel_1_1_2_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(StudentSignup.class.getResource("/images/Picsart_24-02-05_17-11-15-904 - Copy.png")));
		lblNewLabel.setBounds(0, 0, 118, 119);
		frame.getContentPane().add(lblNewLabel);
		
		txtfirstname = new JTextField();
		txtfirstname.setFont(new Font("Georgia", Font.PLAIN, 20));
		txtfirstname.setBounds(161, 184, 358, 34);
		frame.getContentPane().add(txtfirstname);
		txtfirstname.setColumns(10);
		
		JTextArea txtaddress = new JTextArea();
		txtaddress.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtaddress.setWrapStyleWord(true);
		txtaddress.setLineWrap(true);
		txtaddress.setForeground(new Color(0, 0, 0));
		txtaddress.setFont(new Font("Georgia", Font.PLAIN, 20));
		txtaddress.setBounds(161, 316, 358, 76);
		frame.getContentPane().add(txtaddress);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setFont(new Font("Georgia", Font.PLAIN, 20));
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(157, 399, 87, 33);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setFont(new Font("Georgia", Font.PLAIN, 20));
		buttonGroup.add(rdbtnFemale);
		rdbtnFemale.setBounds(246, 399, 91, 33);
		frame.getContentPane().add(rdbtnFemale);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(167, 442, 171, 25);
		frame.getContentPane().add(dateChooser);
		
		txtlastname = new JTextField();
		txtlastname.setFont(new Font("Georgia", Font.PLAIN, 20));
		txtlastname.setColumns(10);
		txtlastname.setBounds(161, 226, 358, 34);
		frame.getContentPane().add(txtlastname);
		
		txtmobileno = new JTextField();
		txtmobileno.setFont(new Font("Georgia", Font.PLAIN, 20));
		txtmobileno.setColumns(10);
		txtmobileno.setBounds(161, 269, 358, 34);
		frame.getContentPane().add(txtmobileno);
		
		txtemail = new JTextField();
		txtemail.setFont(new Font("Georgia", Font.PLAIN, 20));
		txtemail.setColumns(10);
		txtemail.setBounds(161, 484, 342, 34);
		frame.getContentPane().add(txtemail);
		
		txtpassword = new JPasswordField();
		txtpassword.setFont(new Font("Georgia", Font.PLAIN, 20));
		txtpassword.setBounds(221, 528, 281, 33);
		frame.getContentPane().add(txtpassword);
		
		txtconfirmpassword = new JPasswordField();
		txtconfirmpassword.setFont(new Font("Georgia", Font.PLAIN, 20));
		txtconfirmpassword.setBounds(221, 571, 281, 33);
		frame.getContentPane().add(txtconfirmpassword);
		JLabel lblNewLabel_3 = new JLabel("SignUp Form");
		lblNewLabel_3.setFont(new Font("Perpetua Titling MT", Font.BOLD, 20));
		lblNewLabel_3.setBounds(187, 100, 177, 33);
		frame.getContentPane().add(lblNewLabel_3);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 129, 531, 2);
		frame.getContentPane().add(separator_1);
		
		JButton btnexit = new JButton("BACK");
		btnexit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnexit.setFont(new Font("Georgia", Font.BOLD, 16));
		btnexit.setBounds(391, 667, 150, 31);
		frame.getContentPane().add(btnexit);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"SSC", "HSC", "BCA", "BE", "ME", "MBA"}));
		comboBox.setFont(new Font("Georgia", Font.BOLD, 20));
		comboBox.setBounds(433, 443, 87, 30);
		frame.getContentPane().add(comboBox);

		
		
		JButton btnlogin = new JButton("SIGNUP");
		btnlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName=txtusername.getText();

				String firstName=txtfirstname.getText();
				String lastName=txtlastname.getText();
				
				long mobile =Long.parseLong(txtmobileno.getText());
				
				String address =txtaddress.getText();
				
				
				System.out.println( userName+"    "+firstName+"    "+ lastName+"   "+mobile+"   "+address);				
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
				String date=  sdf.format(dateChooser.getDate());
				
				System.out.println(date);
               String gender = null;
				
				if(rdbtnNewRadioButton.isSelected()) {
					
					gender="male";
					
				}else if(rdbtnFemale.isSelected()) {
					gender="female";
					
				}System.out.println(gender);
				String Email=txtemail.getText();
				System.out.println(Email);
				String Password= txtpassword.getText();
				System.out.println(Password);
				String ConfirmPassword=txtconfirmpassword.getText();
				System.out.println(ConfirmPassword);
               String degree=null;
				
				degree=(String)comboBox.getSelectedItem();
				
				System.out.println(degree);
				
				

				JDBCHandling db= new JDBCHandling();
				
				int status =db.insertStudentData(userName,firstName, lastName, mobile, address, gender, date, Email,Password,degree);
				
					
					
		
				if(status==1) {
					
					JOptionPane.showMessageDialog(null, "Data Updated");
					
				}else {
					JOptionPane.showMessageDialog(null, "Problem in Add data");
				}
				

				
				
				
				
				
				
			}
				
				
			
		});
		btnlogin.setFont(new Font("Georgia", Font.BOLD, 16));
		btnlogin.setBounds(0, 667, 150, 31);
		frame.getContentPane().add(btnlogin);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtusername.setText("" );
				txtfirstname.setText("");
				txtlastname.setText("");
				txtmobileno.setText("");
				txtaddress.setText("");
				dateChooser.setDate(null);
				txtpassword.setText(null);
				txtconfirmpassword.setText(null);
			txtemail.setText(null);
			
			
			}
			
			
			
		});
		btnReset.setFont(new Font("Georgia", Font.BOLD, 16));
		btnReset.setBounds(201, 667, 150, 31);
		frame.getContentPane().add(btnReset);
		
		JButton btnAddImage = new JButton("Add image");
		btnAddImage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ProfilePicture.main(null);
				
				JFileChooser fc = new JFileChooser();
				fc.showDialog(null,"Open");
			}
		});
		btnAddImage.setBounds(231, 621, 135, 25);
		frame.getContentPane().add(btnAddImage);
		
		JLabel lblNewLabel_1_4_2_1 = new JLabel("Degree");
		lblNewLabel_1_4_2_1.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblNewLabel_1_4_2_1.setBounds(359, 442, 64, 33);
		frame.getContentPane().add(lblNewLabel_1_4_2_1);
		
		JLabel lblNewLabel_1_5 = new JLabel("User Name");
		lblNewLabel_1_5.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblNewLabel_1_5.setBounds(32, 141, 110, 33);
		frame.getContentPane().add(lblNewLabel_1_5);
		
		txtusername = new JTextField();
		txtusername.setFont(new Font("Georgia", Font.PLAIN, 20));
		txtusername.setColumns(10);
		txtusername.setBounds(161, 143, 358, 34);
		frame.getContentPane().add(txtusername);
		
		JLabel show = new JLabel("");
		show.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				show.setVisible(true);
				
				
				
				txtpassword.setEchoChar((char)0);
			   				}
			@Override
			public void mouseReleased(MouseEvent e) {
				
				show.setVisible(true);
			
				
				
			
				txtpassword.setEchoChar('*');
			}
		});
		show.setIcon(new ImageIcon(StudentSignup.class.getResource("/images/viewpass.jpg")));
		show.setHorizontalAlignment(SwingConstants.LEFT);
		show.setBounds(501, 536, 27, 25);
		frame.getContentPane().add(show);
		
		JLabel showConfirmPassword = new JLabel("");
		showConfirmPassword.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
           showConfirmPassword.setVisible(true);
				
				
				
				txtconfirmpassword.setEchoChar((char)0);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				
				
				showConfirmPassword.setVisible(true);
				
				
				
				
				txtconfirmpassword.setEchoChar('*');
			}
			
		});
		showConfirmPassword.setIcon(new ImageIcon(StudentSignup.class.getResource("/images/viewpass.jpg")));
		showConfirmPassword.setHorizontalAlignment(SwingConstants.LEFT);
		showConfirmPassword.setBounds(501, 579, 27, 25);
		frame.getContentPane().add(showConfirmPassword);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(StudentSignup.class.getResource("/images/signup.jpg")));
		lblNewLabel_5.setBounds(0, 0, 553, 716);
		frame.getContentPane().add(lblNewLabel_5);
		
		
	}
}
