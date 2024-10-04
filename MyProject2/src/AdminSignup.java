import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

public class AdminSignup {

	private JFrame frame;
	private JTextField txtfirstname;
	private JTextField txtlastname;
	
	private JTextField txtemail;
	private JTextField txtmobileno;
	private JPasswordField txtpassword;
	private JPasswordField txtconfirmpassword;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtusername;
	private final JLabel lblNewLabel_5 = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminSignup window = new AdminSignup();
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
	public AdminSignup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	

		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {
			frame = new JFrame();
			Toolkit kit= Toolkit.getDefaultToolkit();
			Dimension dim= kit.getScreenSize();
			int width=(int)dim.getWidth();
			int height=(int)dim.getHeight();
			frame.setSize(565, 772);
			frame.setLocationRelativeTo(null);
			frame.setResizable(false);
		frame.setBounds(100, 100, 565, 811);
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
			lblNewLabel_1.setBounds(31, 221, 110, 33);
			frame.getContentPane().add(lblNewLabel_1);
			
			JLabel lblNewLabel_1_1 = new JLabel("Last  Name");
			lblNewLabel_1_1.setFont(new Font("Georgia", Font.PLAIN, 20));
			lblNewLabel_1_1.setBounds(31, 264, 110, 33);
			frame.getContentPane().add(lblNewLabel_1_1);
			
			JLabel lblNewLabel_1_2 = new JLabel("Mobile NO");
			lblNewLabel_1_2.setFont(new Font("Georgia", Font.PLAIN, 20));
			lblNewLabel_1_2.setBounds(31, 307, 110, 33);
			frame.getContentPane().add(lblNewLabel_1_2);
			
			JLabel lblNewLabel_1_3 = new JLabel("Address");
			lblNewLabel_1_3.setFont(new Font("Georgia", Font.PLAIN, 20));
			lblNewLabel_1_3.setBounds(31, 350, 110, 33);
			frame.getContentPane().add(lblNewLabel_1_3);
			
			JLabel lblNewLabel_1_4 = new JLabel("Gender ");
			lblNewLabel_1_4.setFont(new Font("Georgia", Font.PLAIN, 20));
			lblNewLabel_1_4.setBounds(31, 445, 110, 33);
			frame.getContentPane().add(lblNewLabel_1_4);
			
			JLabel lblNewLabel_1_4_1 = new JLabel("DOB");
			lblNewLabel_1_4_1.setFont(new Font("Georgia", Font.PLAIN, 20));
			lblNewLabel_1_4_1.setBounds(31, 476, 110, 33);
			frame.getContentPane().add(lblNewLabel_1_4_1);
			
			JLabel lblNewLabel_1_4_2 = new JLabel("Email");
			lblNewLabel_1_4_2.setFont(new Font("Georgia", Font.PLAIN, 20));
			lblNewLabel_1_4_2.setBounds(31, 519, 110, 33);
			frame.getContentPane().add(lblNewLabel_1_4_2);
			
			JLabel lblNewLabel_1_1_1 = new JLabel("Password");
			lblNewLabel_1_1_1.setFont(new Font("Georgia", Font.PLAIN, 20));
			lblNewLabel_1_1_1.setBounds(31, 562, 110, 33);
			frame.getContentPane().add(lblNewLabel_1_1_1);
			
			JLabel lblNewLabel_1_1_2 = new JLabel("Confirm Password");
			lblNewLabel_1_1_2.setFont(new Font("Georgia", Font.PLAIN, 20));
			lblNewLabel_1_1_2.setBounds(31, 605, 177, 33);
			frame.getContentPane().add(lblNewLabel_1_1_2);
			
			JLabel lblNewLabel_1_1_2_1 = new JLabel("Profile Picture");
			lblNewLabel_1_1_2_1.setFont(new Font("Georgia", Font.PLAIN, 20));
			lblNewLabel_1_1_2_1.setBounds(31, 648, 136, 33);
			frame.getContentPane().add(lblNewLabel_1_1_2_1);
			
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\tusha\\Downloads\\Picsart_24-02-05_17-11-15-904 - Copy.png"));
			lblNewLabel.setBounds(0, 0, 118, 119);
			frame.getContentPane().add(lblNewLabel);
			
			JTextArea txtaddress = new JTextArea();
			txtaddress.setFont(new Font("Georgia", Font.PLAIN, 20));
			txtaddress.setBounds(161, 352, 358, 76);
			frame.getContentPane().add(txtaddress);
			
			JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
			buttonGroup.add(rdbtnNewRadioButton);
			rdbtnNewRadioButton.setFont(new Font("Georgia", Font.PLAIN, 20));
			buttonGroup.add(rdbtnNewRadioButton);
			rdbtnNewRadioButton.setBounds(172, 445, 87, 33);
			frame.getContentPane().add(rdbtnNewRadioButton);
			
			JRadioButton rdbtnFemale = new JRadioButton("Female");
			buttonGroup.add(rdbtnFemale);
			rdbtnFemale.setFont(new Font("Georgia", Font.PLAIN, 20));
			buttonGroup.add(rdbtnFemale);
			rdbtnFemale.setBounds(254, 445, 91, 33);
			frame.getContentPane().add(rdbtnFemale);
			
			JDateChooser dateChooser = new JDateChooser();
			
	       dateChooser.setBounds(174, 484, 171, 25);
			frame.getContentPane().add(dateChooser);
			
		
			txtemail = new JTextField();
			txtemail.setFont(new Font("Georgia", Font.PLAIN, 20));
			txtemail.setColumns(10);
			txtemail.setBounds(161, 518, 358, 34);
			frame.getContentPane().add(txtemail);
			
			txtpassword = new JPasswordField();
			txtpassword.setFont(new Font("Georgia", Font.PLAIN, 20));
			txtpassword.setBounds(221, 562, 257, 33);
			frame.getContentPane().add(txtpassword);
			
			txtfirstname = new JTextField();
			txtfirstname.setFont(new Font("Georgia", Font.PLAIN, 20));
			txtfirstname.setColumns(10);
			txtfirstname.setBounds(161, 220, 358, 34);
			frame.getContentPane().add(txtfirstname);
			
			txtlastname = new JTextField();
			txtlastname.setFont(new Font("Georgia", Font.PLAIN, 20));
			txtlastname.setColumns(10);
			txtlastname.setBounds(161, 263, 358, 34);
			frame.getContentPane().add(txtlastname);
			
			txtmobileno = new JTextField();
			txtmobileno.setFont(new Font("Georgia", Font.PLAIN, 20));
			txtmobileno.setColumns(10);
			txtmobileno.setBounds(161, 306, 358, 34);
			frame.getContentPane().add(txtmobileno);
			
			txtconfirmpassword = new JPasswordField();
			txtconfirmpassword.setFont(new Font("Georgia", Font.PLAIN, 20));
			txtconfirmpassword.setBounds(221, 605, 257, 33);
			frame.getContentPane().add(txtconfirmpassword);
			
			JLabel lblNewLabel_3 = new JLabel("");
			lblNewLabel_3.setBounds(0, 0, 551, 716);
			frame.getContentPane().add(lblNewLabel_3);
			
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
					
					
					
					

					JDBCHandling db= new JDBCHandling();
					
					int status =db.insertAdminData(userName,firstName, lastName, mobile, address, gender, date, Email,Password);
					
						
						
			
					if(status==1) {
						
						JOptionPane.showMessageDialog(null, "Data Updated");
						
					}else {
						JOptionPane.showMessageDialog(null, "Problem in Add data");
					}
					

					
					
					
					
					
					
				}
					
					
				
		
				
				
				
			});
			btnlogin.setFont(new Font("Georgia", Font.BOLD, 16));
			btnlogin.setBounds(17, 683, 150, 31);
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
			btnReset.setBounds(195, 683, 150, 31);
			frame.getContentPane().add(btnReset);
			
			JButton btnexit = new JButton("BACK");
			btnexit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame.setVisible(false);
				}
			});
			btnexit.setFont(new Font("Georgia", Font.BOLD, 16));
			btnexit.setBounds(374, 683, 150, 31);
			frame.getContentPane().add(btnexit);
			
			JButton btnNewButton = new JButton("Add image");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JFileChooser fc = new JFileChooser();
					fc.showDialog(null,"Open");
				}
			});
			btnNewButton.setBounds(231, 648, 135, 25);
			frame.getContentPane().add(btnNewButton);
			
			JLabel lblNewLabel_1_5 = new JLabel("User Name");
			lblNewLabel_1_5.setFont(new Font("Georgia", Font.PLAIN, 20));
			lblNewLabel_1_5.setBounds(31, 178, 110, 33);
			frame.getContentPane().add(lblNewLabel_1_5);
			
			txtusername = new JTextField();
			txtusername.setFont(new Font("Georgia", Font.PLAIN, 20));
			txtusername.setColumns(10);
			txtusername.setBounds(161, 177, 358, 34);
			frame.getContentPane().add(txtusername);
			
			JLabel lblNewLabel_31 = new JLabel("SignUp Form");
			lblNewLabel_31.setFont(new Font("Perpetua Titling MT", Font.BOLD, 20));
			lblNewLabel_31.setBounds(187, 111, 177, 33);
			frame.getContentPane().add(lblNewLabel_31);
			
			
			
			JLabel show = new JLabel("");
			show.addMouseListener(new MouseAdapter() {
				@Override
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
			
			
			show.setIcon(new ImageIcon(AdminSignup.class.getResource("/images/viewpass.jpg")));
			show.setHorizontalAlignment(SwingConstants.LEFT);
			show.setBounds(481, 562, 27, 25);
			frame.getContentPane().add(show);

			JLabel showConfirmPassword = new JLabel("");
			showConfirmPassword.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					showConfirmPassword.setVisible(true);
					
					
					
					txtpassword.setEchoChar((char)0);
				   				}
				@Override
				public void mouseReleased(MouseEvent e) {
					showConfirmPassword.setVisible(true);
				
					
					
				
					txtpassword.setEchoChar('*');
				}
			});
			showConfirmPassword.setHorizontalAlignment(SwingConstants.LEFT);
			showConfirmPassword.setBounds(481, 605, 27, 25);
			frame.getContentPane().add(showConfirmPassword);
			
			JLabel lblNewLabel_5_3 = new JLabel("");
			lblNewLabel_5_3.setHorizontalAlignment(SwingConstants.LEFT);
			lblNewLabel_5_3.setBounds(514, 605, 27, 25);
			frame.getContentPane().add(lblNewLabel_5_3);
			
			
			
		
			JSeparator separator_1 = new JSeparator();
			separator_1.setBounds(10, 142, 531, 2);
			frame.getContentPane().add(separator_1);
			
			JLabel show_1 = new JLabel("");
			show_1.setIcon(new ImageIcon(AdminSignup.class.getResource("/images/viewpass.jpg")));
			show_1.setHorizontalAlignment(SwingConstants.LEFT);
			show_1.setBounds(481, 605, 27, 25);
			frame.getContentPane().add(show_1);
			lblNewLabel_5.setIcon(new ImageIcon(AdminSignup.class.getResource("/images/signup.jpg")));
			lblNewLabel_5.setBounds(0, 0, 551, 774);
			frame.getContentPane().add(lblNewLabel_5);
			
			
			
			
	}
}
