import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class Stafflogin {

	private JFrame frmParamInfosystemAdmin;
	private JTextField txtloginname;
	private JPasswordField txtpassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stafflogin window = new Stafflogin();
					window.frmParamInfosystemAdmin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Stafflogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmParamInfosystemAdmin = new JFrame();
		frmParamInfosystemAdmin.setTitle("PARAM Infosystem  Admin Login page");
		frmParamInfosystemAdmin.setBounds(100, 100, 775, 421);
		frmParamInfosystemAdmin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmParamInfosystemAdmin.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Login Name");
		lblNewLabel_1.setFont(new Font("Georgia", Font.BOLD, 17));
		lblNewLabel_1.setBounds(123, 162, 150, 46);
		frmParamInfosystemAdmin.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setFont(new Font("Georgia", Font.BOLD, 17));
		lblNewLabel_1_1.setBounds(123, 218, 150, 46);
		frmParamInfosystemAdmin.getContentPane().add(lblNewLabel_1_1);
		
		JButton btnlogin = new JButton("LOGIN");
		btnlogin.setFont(new Font("Georgia", Font.BOLD, 16));
		btnlogin.setBounds(27, 343, 150, 31);
		frmParamInfosystemAdmin.getContentPane().add(btnlogin);
		
		JButton btnreset = new JButton("RESET");
		btnreset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtloginname.setText(null);
			 txtpassword.setText(null);
			}
		});
		btnreset.setFont(new Font("Georgia", Font.BOLD, 16));
		btnreset.setBounds(283, 343, 150, 31);
		frmParamInfosystemAdmin.getContentPane().add(btnreset);
		
		JButton btnexit = new JButton("BACK");
		btnexit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmParamInfosystemAdmin.setVisible(false);
				
			}
		});
		btnexit.setFont(new Font("Georgia", Font.BOLD, 16));
		btnexit.setBounds(548, 343, 150, 31);
		frmParamInfosystemAdmin.getContentPane().add(btnexit);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setBounds(673, 305, -666, 2);
		frmParamInfosystemAdmin.getContentPane().add(separator);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\tusha\\Downloads\\Picsart_24-02-05_17-11-15-904.png"));
		lblNewLabel.setBounds(10, 0, 150, 167);
		frmParamInfosystemAdmin.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Param infosystem");
		lblNewLabel_2.setFont(new Font("Perpetua Titling MT", Font.BOLD, 39));
		lblNewLabel_2.setBounds(182, 44, 512, 54);
		frmParamInfosystemAdmin.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("An Education Venture");
		lblNewLabel_4.setFont(new Font("Georgia", Font.BOLD, 20));
		lblNewLabel_4.setBounds(268, 70, 342, 54);
		frmParamInfosystemAdmin.getContentPane().add(lblNewLabel_4);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(196, 85, 414, 2);
		frmParamInfosystemAdmin.getContentPane().add(separator_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(10, 331, 715, 2);
		frmParamInfosystemAdmin.getContentPane().add(separator_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("Don't have an account?");
		lblNewLabel_3.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(88, 274, 237, 31);
		frmParamInfosystemAdmin.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("SignUp");
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminSignup.main(null);
			}
		});
		btnNewButton.setFont(new Font("Georgia", Font.PLAIN, 20));
		btnNewButton.setBounds(305, 275, 114, 29);
		frmParamInfosystemAdmin.getContentPane().add(btnNewButton);
		
		txtloginname = new JTextField();
		txtloginname.setFont(new Font("Georgia", Font.PLAIN, 20));
		txtloginname.setColumns(10);
		txtloginname.setBounds(245, 169, 453, 31);
		frmParamInfosystemAdmin.getContentPane().add(txtloginname);
		
		txtpassword = new JPasswordField();
		txtpassword.setFont(new Font("Georgia", Font.PLAIN, 20));
		txtpassword.setBounds(245, 225, 449, 29);
		frmParamInfosystemAdmin.getContentPane().add(txtpassword);
		
		
		//eth Incorrect
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setFont(new Font("Georgia", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(305, 134, 393, 22);
		frmParamInfosystemAdmin.getContentPane().add(lblNewLabel_6);
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
		show.setIcon(new ImageIcon(StudentLogin.class.getResource("/images/viewpass.jpg")));
		show.setBounds(730, 225, 25, 25);
		frmParamInfosystemAdmin.getContentPane().add(show);
		frmParamInfosystemAdmin.setResizable(false);
	show.setIcon(new ImageIcon(Stafflogin.class.getResource("/images/viewpass.jpg")));
	show.setBounds(700, 231, 25, 25);
	frmParamInfosystemAdmin.getContentPane().add(show);
		frmParamInfosystemAdmin.setResizable(false);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(Stafflogin.class.getResource("/images/e835598ba182b93e5c217a0237f9d86e.png")));
		lblNewLabel_5.setBounds(0, 0, 761, 384);
	frmParamInfosystemAdmin.getContentPane().add(lblNewLabel_5);
	
		
	}
	}


