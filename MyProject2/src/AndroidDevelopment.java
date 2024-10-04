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

public class AndroidDevelopment {

	private JFrame frmAndroidDevelopment;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AndroidDevelopment window = new AndroidDevelopment();
					window.frmAndroidDevelopment.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AndroidDevelopment() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAndroidDevelopment = new JFrame();
		frmAndroidDevelopment.setTitle("Android Development");
		Toolkit kit= Toolkit.getDefaultToolkit();
		Dimension dim= kit.getScreenSize();
		int width=(int)dim.getWidth();
		int height=(int)dim.getHeight();
		frmAndroidDevelopment.setSize(484, 753);
		frmAndroidDevelopment.setLocationRelativeTo(null);
		frmAndroidDevelopment.setResizable(false);
	    frmAndroidDevelopment.setBounds(100, 100, 565, 753);
		frmAndroidDevelopment.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAndroidDevelopment.getContentPane().setLayout(null);
		
		JLabel lblLearnAndroidDevelopment = new JLabel("Learn Android Development");
		lblLearnAndroidDevelopment.setHorizontalAlignment(SwingConstants.CENTER);
		lblLearnAndroidDevelopment.setForeground(Color.RED);
		lblLearnAndroidDevelopment.setFont(new Font("Myanmar Text", Font.BOLD, 25));
		lblLearnAndroidDevelopment.setBackground(Color.GRAY);
		lblLearnAndroidDevelopment.setBounds(10, 10, 531, 74);
		frmAndroidDevelopment.getContentPane().add(lblLearnAndroidDevelopment);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(AndroidDevelopment.class.getResource("/Images/android n1.png")));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(178, 94, 178, 130);
		frmAndroidDevelopment.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("What will you learn?");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Nirmala UI", Font.BOLD, 25));
		lblNewLabel_2.setBounds(76, 261, 389, 40);
		frmAndroidDevelopment.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("1. Programming with JavaScript");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1.setForeground(new Color(5, 73, 92));
		lblNewLabel_2_1.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(110, 314, 355, 40);
		frmAndroidDevelopment.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("2. Programming using DART");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1.setForeground(new Color(5, 73, 92));
		lblNewLabel_2_1_1.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		lblNewLabel_2_1_1.setBounds(110, 352, 355, 40);
		frmAndroidDevelopment.getContentPane().add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("3. Flutter");
		lblNewLabel_2_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1_1.setForeground(new Color(5, 73, 92));
		lblNewLabel_2_1_1_1.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		lblNewLabel_2_1_1_1.setBounds(110, 390, 355, 40);
		frmAndroidDevelopment.getContentPane().add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Get Certified.");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setForeground(new Color(19, 4, 125));
		lblNewLabel_2_2.setFont(new Font("Century Gothic", Font.BOLD, 30));
		lblNewLabel_2_2.setBounds(76, 481, 389, 38);
		frmAndroidDevelopment.getContentPane().add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_3 = new JLabel("#Start today - you are just 8 months away");
		lblNewLabel_3.setFont(new Font("Nirmala UI", Font.BOLD, 15));
		lblNewLabel_3.setBounds(76, 545, 334, 26);
		frmAndroidDevelopment.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("#Belive in yourself - Practice makes Programmer perfect.");
		lblNewLabel_3_1.setFont(new Font("Nirmala UI", Font.BOLD, 15));
		lblNewLabel_3_1.setBounds(77, 581, 413, 26);
		frmAndroidDevelopment.getContentPane().add(lblNewLabel_3_1);
		
		JButton btnNewButton = new JButton("Enroll Now");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AndroidPage2.main(null);
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 30));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(295, 634, 232, 36);
		frmAndroidDevelopment.getContentPane().add(btnNewButton);
		
	
		JButton btnback = new JButton("BACK");
		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				frmAndroidDevelopment.setVisible(false);
			}
		});
		btnback.setForeground(new Color(0, 0, 0));
		btnback.setFont(new Font("Nirmala UI", Font.BOLD, 25));
		btnback.setBackground(new Color(255, 255, 255));
		btnback.setBounds(26, 637, 110, 36);
		frmAndroidDevelopment.getContentPane().add(btnback);
	
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setIcon(new ImageIcon(AndroidDevelopment.class.getResource("/images/e835598ba182b93e5c217a0237f9d86e.jpg")));
		lblNewLabel_1.setBounds(0, 0, 551, 716);
		frmAndroidDevelopment.getContentPane().add(lblNewLabel_1);
		
	}

}
