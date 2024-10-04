
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomePage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage window = new HomePage();
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
	public HomePage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		
		
		JLabel lblNewLabel_1 = new JLabel("Online Learning Now \r\n");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Georgia", Font.BOLD, 34));
		lblNewLabel_1.setBounds(92, 93, 432, 45);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("In Your Fingertipps\r\n");
		lblNewLabel_1_1.setForeground(new Color(192, 192, 192));
		lblNewLabel_1_1.setFont(new Font("Georgia", Font.BOLD, 31));
		lblNewLabel_1_1.setBounds(128, 133, 325, 45);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		
		
		JLabel lblNewLabel_2_2 = new JLabel("New label");
		lblNewLabel_2_2.setIcon(new ImageIcon(HomePage.class.getResource("/images/define the goal.png")));
		lblNewLabel_2_2.setBackground(Color.WHITE);
		lblNewLabel_2_2.setBounds(720, 494, 142, 140);
		frame.getContentPane().add(lblNewLabel_2_2);

		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(HomePage.class.getResource("/images/Picsart_24-02-05_17-11-15-904 - Copy.png")));

		
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setBackground(new Color(240, 240, 240));
		lblNewLabel_2_1.setIcon(new ImageIcon(HomePage.class.getResource("/images/bulb.png")));
		lblNewLabel_2_1.setBounds(107, 494, 116, 116);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(192, 192, 192));
		lblNewLabel.setIcon(new ImageIcon(HomePage.class.getResource("/images/girl.png")));
		lblNewLabel.setBounds(641, 86, 260, 315);
		frame.getContentPane().add(lblNewLabel);
		
		
		JLabel lblNewLabel_2_2_2 = new JLabel("");
		lblNewLabel_2_2_2.setIcon(new ImageIcon(HomePage.class.getResource("/images/oracle - Copy.png")));
		lblNewLabel_2_2_2.setBackground(new Color(192, 192, 192));
		lblNewLabel_2_2_2.setBounds(408, 494, 142, 140);
		frame.getContentPane().add(lblNewLabel_2_2_2);
		
		JLabel lblUpgradeKnowledgeAnd = new JLabel("Upgrade Knowledge And Skillset");
		lblUpgradeKnowledgeAnd.setFont(new Font("Georgia", Font.PLAIN, 13));
		lblUpgradeKnowledgeAnd.setBounds(73, 640, 209, 13);
		frame.getContentPane().add(lblUpgradeKnowledgeAnd);
		
		JLabel lblOracleCertifiedTrainers = new JLabel("Oracle Certified Trainers");
		lblOracleCertifiedTrainers.setFont(new Font("Georgia", Font.PLAIN, 13));
		lblOracleCertifiedTrainers.setBounds(385, 644, 209, 13);
		frame.getContentPane().add(lblOracleCertifiedTrainers);
		
		JLabel lblHelpsDefiningThe = new JLabel("Helps Defining the Goal");
		lblHelpsDefiningThe.setFont(new Font("Georgia", Font.PLAIN, 13));
		lblHelpsDefiningThe.setBounds(730, 644, 209, 13);
		frame.getContentPane().add(lblHelpsDefiningThe);
		
		JLabel lblNewLabel_6 = new JLabel("How To Learn at Param ");
		lblNewLabel_6.setFont(new Font("Georgia", Font.BOLD, 29));
		lblNewLabel_6.setBounds(266, 389, 412, 58);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_2_3 = new JLabel("The Learning flow is Structured");
		lblNewLabel_2_3.setFont(new Font("Georgia", Font.BOLD, 29));
		lblNewLabel_2_3.setBounds(209, 421, 483, 58);
		frame.getContentPane().add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_3 = new JLabel("Param is an online learining platform offers various ");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Georgia", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(107, 188, 350, 58);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("courses for your skill development");
		lblNewLabel_3_1.setForeground(new Color(192, 192, 192));
		lblNewLabel_3_1.setFont(new Font("Georgia", Font.PLAIN, 14));
		lblNewLabel_3_1.setBounds(149, 209, 350, 58);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		JButton btnNewButton = new JButton("SUBSCRIBE NOW");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AllCourses.main(null);
			}
		});
		btnNewButton.setBackground(new Color(0, 255, 0));
		btnNewButton.setFont(new Font("Georgia", Font.BOLD, 15));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(74, 285, 181, 58);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("our 30+ courses helps students to grab knowledge in all fields");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Georgia", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(135, 353, 539, 26);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Click on the Subscribe Button to Know \r\nMore about courses");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Georgia", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(266, 292, 365, 45);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(HomePage.class.getResource("/images/HD-wallpaper-half-half-colour-black-blue-white.jpg")));
		lblNewLabel_2.setBounds(0, 0, 955, 766);
		frame.getContentPane().add(lblNewLabel_2);
		
	
		
	
		frame.setTitle("AddStudentPage");
		frame.setResizable(false);
		frame.setBounds(200, 100, 979, 786);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
