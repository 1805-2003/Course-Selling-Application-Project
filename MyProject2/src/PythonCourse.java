
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PythonCourse {

	private JFrame frmPython;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PythonCourse window = new PythonCourse();
					window.frmPython.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PythonCourse() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPython = new JFrame();
		frmPython.setTitle("Python");
		Toolkit kit= Toolkit.getDefaultToolkit();
		Dimension dim= kit.getScreenSize();
		int width=(int)dim.getWidth();
		int height=(int)dim.getHeight();
		frmPython.setSize(484, 753);
		frmPython.setLocationRelativeTo(null);
		frmPython.setResizable(false);
	    frmPython.setBounds(100, 100, 565, 753);
		frmPython.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPython.getContentPane().setLayout(null);
		
		JLabel lblLearnPythonWith = new JLabel("Learn Python with Data Structures & Algorithms");
		lblLearnPythonWith.setHorizontalAlignment(SwingConstants.CENTER);
		lblLearnPythonWith.setForeground(Color.RED);
		lblLearnPythonWith.setFont(new Font("Myanmar Text", Font.BOLD, 23));
		lblLearnPythonWith.setBackground(Color.GRAY);
		lblLearnPythonWith.setBounds(10, 10, 531, 74);
		frmPython.getContentPane().add(lblLearnPythonWith);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(PythonCourse.class.getResource("/Images/pynt.png")));
		lblNewLabel.setBounds(182, 76, 171, 92);
		frmPython.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(PythonCourse.class.getResource("/Images/ds.jpg")));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(77, 157, 130, 92);
		frmPython.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("New label");
		lblNewLabel_1_1.setIcon(new ImageIcon(PythonCourse.class.getResource("/Images/problem solving n.png")));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(321, 157, 130, 92);
		frmPython.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("What will you learn?");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		lblNewLabel_2.setBounds(62, 288, 389, 26);
		frmPython.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("1. Programming with Python");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1.setForeground(new Color(5, 73, 92));
		lblNewLabel_2_1.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(128, 335, 334, 26);
		frmPython.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("2. Data Structures & Algorithms");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1.setForeground(new Color(5, 73, 92));
		lblNewLabel_2_1_1.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		lblNewLabel_2_1_1.setBounds(128, 371, 336, 26);
		frmPython.getContentPane().add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("3. Advanced DSA");
		lblNewLabel_2_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1_1.setForeground(new Color(5, 73, 92));
		lblNewLabel_2_1_1_1.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		lblNewLabel_2_1_1_1.setBounds(128, 407, 334, 26);
		frmPython.getContentPane().add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("4. Problem Solving");
		lblNewLabel_2_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1_1_1.setForeground(new Color(5, 73, 92));
		lblNewLabel_2_1_1_1_1.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		lblNewLabel_2_1_1_1_1.setBounds(128, 443, 336, 26);
		frmPython.getContentPane().add(lblNewLabel_2_1_1_1_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Get Certified.");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setForeground(new Color(19, 4, 125));
		lblNewLabel_2_2.setFont(new Font("Century Gothic", Font.BOLD, 30));
		lblNewLabel_2_2.setBounds(76, 497, 389, 38);
		frmPython.getContentPane().add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_3 = new JLabel("#Start today - you are just 4 months away");
		lblNewLabel_3.setFont(new Font("Nirmala UI", Font.BOLD, 15));
		lblNewLabel_3.setBounds(76, 545, 334, 26);
		frmPython.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("#Belive in yourself - Practice makes Programmer perfect.");
		lblNewLabel_3_1.setFont(new Font("Nirmala UI", Font.BOLD, 15));
		lblNewLabel_3_1.setBounds(77, 581, 413, 26);
		frmPython.getContentPane().add(lblNewLabel_3_1);
		
		JButton btnNewButton = new JButton("Enroll Now");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pythonpage2.main(null);
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 30));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(295, 634, 232, 36);
		frmPython.getContentPane().add(btnNewButton);
		JButton btnback = new JButton("BACK");
		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPython.setVisible(false);
			}
		});
		btnback.setForeground(new Color(0, 0, 0));
		btnback.setFont(new Font("Nirmala UI", Font.BOLD, 25));
		btnback.setBackground(new Color(255, 255, 255));
		btnback.setBounds(26, 637, 110, 36);
		frmPython.getContentPane().add(btnback);
	
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(PythonCourse.class.getResource("/images/e835598ba182b93e5c217a0237f9d86e.jpg")));
		lblNewLabel_4.setBounds(0, 0, 551, 716);
		frmPython.getContentPane().add(lblNewLabel_4);
		

	}

}
