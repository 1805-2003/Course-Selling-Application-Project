import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class Cpppage2 {

	private JFrame frmCpppage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cpppage2 window = new Cpppage2();
					window.frmCpppage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cpppage2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCpppage = new JFrame();
		frmCpppage.setTitle("CppPage");
		Toolkit kit= Toolkit.getDefaultToolkit();
		Dimension dim= kit.getScreenSize();
		int width=(int)dim.getWidth();
		int height=(int)dim.getHeight();
		frmCpppage.setSize(484, 753);
		frmCpppage.setLocationRelativeTo(null);
		frmCpppage.setResizable(false);
	    frmCpppage.setBounds(100, 100, 565, 753);
		frmCpppage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCpppage.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Watch Demo Lecture");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Myanmar Text", Font.BOLD, 30));
		lblNewLabel.setBounds(43, 26, 460, 78);
		frmCpppage.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Thumbnail");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblNewLabel_1.setBounds(53, 115, 450, 189);
		frmCpppage.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("You can access lectures only 5 months from date of purchased.");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Nirmala UI", Font.BOLD, 15));
		lblNewLabel_2.setBounds(53, 378, 460, 45);
		frmCpppage.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("For Certifications you need to complete 90% of total Lectures.");
		lblNewLabel_2_1.setForeground(Color.BLACK);
		lblNewLabel_2_1.setFont(new Font("Nirmala UI", Font.BOLD, 15));
		lblNewLabel_2_1.setBounds(53, 413, 460, 45);
		frmCpppage.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("");
		lblNewLabel_2_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1.setFont(new Font("Nirmala UI", Font.BOLD, 15));
		lblNewLabel_2_1_1.setBounds(53, 402, 460, 45);
		frmCpppage.getContentPane().add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("For more videos you need to purchsed Course.");
		lblNewLabel_2_2.setForeground(Color.BLACK);
		lblNewLabel_2_2.setFont(new Font("Nirmala UI", Font.BOLD, 15));
		lblNewLabel_2_2.setBounds(53, 345, 460, 45);
		frmCpppage.getContentPane().add(lblNewLabel_2_2);
		
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
		frmCpppage.getContentPane().add(btnClickToPurchase);
		
		JButton btnback = new JButton("BACK");
		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCpppage.setVisible(false);
			}
		});
		btnback.setForeground(new Color(0, 0, 0));
		btnback.setFont(new Font("Nirmala UI", Font.BOLD, 25));
		btnback.setBackground(new Color(255, 255, 255));
		btnback.setBounds(43, 644, 110, 36);
		frmCpppage.getContentPane().add(btnback);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Cpppage2.class.getResource("/images/e835598ba182b93e5c217a0237f9d86e.jpg")));
		lblNewLabel_3.setBounds(0, 0, 551, 716);
		frmCpppage.getContentPane().add(lblNewLabel_3);
		
		
	}

}
