import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class AndroidPage2 {

	private JFrame frmAndroidPage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AndroidPage2 window = new AndroidPage2();
					window.frmAndroidPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AndroidPage2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAndroidPage = new JFrame();
		frmAndroidPage.setTitle("Android Page 2");
		Toolkit kit= Toolkit.getDefaultToolkit();
		Dimension dim= kit.getScreenSize();
		int width=(int)dim.getWidth();
		int height=(int)dim.getHeight();
		frmAndroidPage.setSize(484, 753);
		frmAndroidPage.setLocationRelativeTo(null);
		frmAndroidPage.setResizable(false);
	    frmAndroidPage.setBounds(100, 100, 565, 753);
		frmAndroidPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAndroidPage.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Watch Demo Lecture");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Myanmar Text", Font.BOLD, 30));
		lblNewLabel.setBounds(43, 26, 460, 78);
		frmAndroidPage.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Thumbnail");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblNewLabel_1.setBounds(53, 115, 450, 189);
		frmAndroidPage.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("For more videos you need to purchsed Course.");
		lblNewLabel_2_2.setForeground(Color.BLACK);
		lblNewLabel_2_2.setFont(new Font("Nirmala UI", Font.BOLD, 15));
		lblNewLabel_2_2.setBounds(53, 345, 460, 45);
		frmAndroidPage.getContentPane().add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2 = new JLabel("You can access lectures only 5 months from date of purchased.");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Nirmala UI", Font.BOLD, 15));
		lblNewLabel_2.setBounds(53, 378, 460, 45);
		frmAndroidPage.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("For Certifications you need to complete 90% of total Lectures.");
		lblNewLabel_2_1.setForeground(Color.BLACK);
		lblNewLabel_2_1.setFont(new Font("Nirmala UI", Font.BOLD, 15));
		lblNewLabel_2_1.setBounds(53, 413, 460, 45);
		frmAndroidPage.getContentPane().add(lblNewLabel_2_1);
		
		JButton btnback = new JButton("BACK");
		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				frmAndroidPage.setVisible(false);
			}
		});
		btnback.setForeground(new Color(0, 0, 0));
		btnback.setFont(new Font("Nirmala UI", Font.BOLD, 25));
		btnback.setBackground(new Color(255, 255, 255));
		btnback.setBounds(43, 644, 110, 36);
		frmAndroidPage.getContentPane().add(btnback);
		
		JButton btnClickToPurchase = new JButton("Click to Purchase");
		btnClickToPurchase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cpppurchase.main(null);
			}
		});
		btnClickToPurchase.setForeground(new Color(0, 0, 0));
		btnClickToPurchase.setFont(new Font("Segoe UI", Font.BOLD, 23));
		btnClickToPurchase.setBackground(new Color(255, 255, 255));
		btnClickToPurchase.setBounds(271, 644, 232, 36);
		frmAndroidPage.getContentPane().add(btnClickToPurchase);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(AndroidPage2.class.getResource("/images/signup.jpg")));
		lblNewLabel_3.setBounds(0, 0, 551, 716);
		frmAndroidPage.getContentPane().add(lblNewLabel_3);
		
	}

}
