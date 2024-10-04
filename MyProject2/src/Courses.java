import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Courses {

	private JFrame frmC;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Courses window = new Courses();
					window.frmC.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Courses() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmC = new JFrame();
		frmC.setTitle("C++");
		
		Toolkit kit= Toolkit.getDefaultToolkit();
		Dimension dim= kit.getScreenSize();
		int width=(int)dim.getWidth();
		int height=(int)dim.getHeight();
		frmC.setSize(484, 753);
		frmC.setLocationRelativeTo(null);
		frmC.setResizable(false);
	    frmC.setBounds(100, 100, 565, 753);
		frmC.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmC.getContentPane().setLayout(null);
		
		JLabel lblcpp = new JLabel("Learn C++ with Data Structures & Algorithms");
		lblcpp.setBackground(new Color(128, 128, 128));
		lblcpp.setForeground(new Color(255, 0, 0));
		lblcpp.setFont(new Font("Myanmar Text", Font.BOLD, 23));
		lblcpp.setHorizontalAlignment(SwingConstants.CENTER);
		lblcpp.setBounds(10, 10, 531, 74);
		frmC.getContentPane().add(lblcpp);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Courses.class.getResource("/Images/cpp.jpg")));
		lblNewLabel.setBounds(194, 79, 160, 138);
		frmC.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(Courses.class.getResource("/Images/ds.jpg")));
		lblNewLabel_1.setBounds(76, 197, 130, 92);
		frmC.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("New label");
		lblNewLabel_1_1.setIcon(new ImageIcon(Courses.class.getResource("/Images/problem solving n.png")));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(335, 197, 130, 92);
		frmC.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("What will you learn?");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		lblNewLabel_2.setBounds(76, 286, 389, 38);
		frmC.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("1. Programming with C++");
		lblNewLabel_2_1.setForeground(new Color(5, 73, 92));
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(129, 335, 334, 26);
		frmC.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("2. Data Structures & Algorithms");
		lblNewLabel_2_1_1.setForeground(new Color(5, 73, 92));
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		lblNewLabel_2_1_1.setBounds(129, 371, 336, 26);
		frmC.getContentPane().add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("3. Advanced DSA");
		lblNewLabel_2_1_1_1.setForeground(new Color(5, 73, 92));
		lblNewLabel_2_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1_1.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		lblNewLabel_2_1_1_1.setBounds(129, 407, 334, 26);
		frmC.getContentPane().add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("4. Problem Solving");
		lblNewLabel_2_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1_1_1.setForeground(new Color(5, 73, 92));
		lblNewLabel_2_1_1_1_1.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		lblNewLabel_2_1_1_1_1.setBounds(129, 443, 336, 26);
		frmC.getContentPane().add(lblNewLabel_2_1_1_1_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Get Certified.");
		lblNewLabel_2_2.setForeground(new Color(19, 4, 125));
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setFont(new Font("Century Gothic", Font.BOLD, 30));
		lblNewLabel_2_2.setBounds(80, 497, 389, 38);
		frmC.getContentPane().add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_3 = new JLabel("#Start today - you are just 4 months away");
		lblNewLabel_3.setFont(new Font("Nirmala UI", Font.BOLD, 15));
		lblNewLabel_3.setBounds(76, 545, 334, 26);
		frmC.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("#Belive in yourself - Practice makes Programmer perfect.");
		lblNewLabel_3_1.setFont(new Font("Nirmala UI", Font.BOLD, 15));
		lblNewLabel_3_1.setBounds(76, 583, 413, 26);
		frmC.getContentPane().add(lblNewLabel_3_1);
		
		JButton btnNewButton = new JButton("Enroll Now");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cpppage2.main(null);
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 30));
		btnNewButton.setBounds(295, 634, 232, 36);
		frmC.getContentPane().add(btnNewButton);
	
		JButton btnback = new JButton("BACK");
		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmC.setVisible(false);
			}
			
		});
		btnback.setForeground(new Color(0, 0, 0));
		btnback.setFont(new Font("Nirmala UI", Font.BOLD, 25));
		btnback.setBackground(new Color(255, 255, 255));
		btnback.setBounds(26, 634, 110, 36);
		frmC.getContentPane().add(btnback);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Courses.class.getResource("/images/e835598ba182b93e5c217a0237f9d86e.jpg")));
		lblNewLabel_4.setBounds(0, 0, 551, 716);
		frmC.getContentPane().add(lblNewLabel_4);
		



		
		
	}

}
