import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cpppurchase {

	private JFrame frmCppPurchasePage;
	private final JLabel lblNewLabel_3 = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cpppurchase window = new Cpppurchase();
					window.frmCppPurchasePage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cpppurchase() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCppPurchasePage = new JFrame();
		frmCppPurchasePage.setTitle("Purchase page");
		Toolkit kit= Toolkit.getDefaultToolkit();
		Dimension dim= kit.getScreenSize();
		int width=(int)dim.getWidth();
		int height=(int)dim.getHeight();
		frmCppPurchasePage.setSize(484, 753);
		frmCppPurchasePage.setLocationRelativeTo(null);
		frmCppPurchasePage.setResizable(false);
	    frmCppPurchasePage.setBounds(100, 100, 565, 753);
		frmCppPurchasePage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCppPurchasePage.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Payment Details");
		lblNewLabel.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 28));
		lblNewLabel.setForeground(new Color(0, 0, 64));
		lblNewLabel.setBounds(60, 10, 430, 59);
		frmCppPurchasePage.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Amount");
		lblNewLabel_1.setForeground(new Color(0, 0, 64));
		lblNewLabel_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		lblNewLabel_1.setBounds(60, 197, 175, 35);
		frmCppPurchasePage.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("(18% GST included which is paid to the Government.)");
		lblNewLabel_2.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(60, 266, 430, 21);
		frmCppPurchasePage.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Email");
		lblNewLabel_1_1.setForeground(new Color(0, 0, 64));
		lblNewLabel_1_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(60, 287, 175, 35);
		frmCppPurchasePage.getContentPane().add(lblNewLabel_1_1);
		
		JTextField textField = new JTextField();
		textField.setToolTipText("");
		textField.setFont(new Font("Segoe UI Light", Font.BOLD, 18));
		textField.setColumns(10);
		textField.setBounds(60, 319, 430, 35);
		frmCppPurchasePage.getContentPane().add(textField);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Phone");
		lblNewLabel_1_1_1.setForeground(new Color(0, 0, 64));
		lblNewLabel_1_1_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(60, 385, 175, 35);
		frmCppPurchasePage.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Full Name");
		lblNewLabel_1_1_2.setForeground(new Color(0, 0, 64));
		lblNewLabel_1_1_2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		lblNewLabel_1_1_2.setBounds(60, 465, 175, 35);
		frmCppPurchasePage.getContentPane().add(lblNewLabel_1_1_2);
		
		JTextField textField_2 = new JTextField();
		textField_2.setToolTipText("");
		textField_2.setFont(new Font("Segoe UI Light", Font.BOLD, 18));
		textField_2.setColumns(10);
		textField_2.setBounds(60, 500, 430, 35);
		frmCppPurchasePage.getContentPane().add(textField_2);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Please enter full name as this name will print on your Certificate");
		lblNewLabel_2_1_1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		lblNewLabel_2_1_1.setBounds(60, 533, 430, 21);
		frmCppPurchasePage.getContentPane().add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Payment Method");
		lblNewLabel_1_1_2_1.setForeground(new Color(0, 0, 64));
		lblNewLabel_1_1_2_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		lblNewLabel_1_1_2_1.setBounds(60, 570, 175, 35);
		frmCppPurchasePage.getContentPane().add(lblNewLabel_1_1_2_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Cash");
		chckbxNewCheckBox.setFont(new Font("Segoe UI Semilight", Font.BOLD, 20));
		chckbxNewCheckBox.setBounds(60, 611, 130, 30);
		frmCppPurchasePage.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxDebitCard = new JCheckBox("Debit Card");
		chckbxDebitCard.setFont(new Font("Segoe UI Semilight", Font.BOLD, 20));
		chckbxDebitCard.setBounds(209, 611, 130, 30);
		frmCppPurchasePage.getContentPane().add(chckbxDebitCard);
		
		JCheckBox chckbxUpi = new JCheckBox("UPI");
		chckbxUpi.setFont(new Font("Segoe UI Semilight", Font.BOLD, 20));
		chckbxUpi.setBounds(393, 611, 130, 30);
		frmCppPurchasePage.getContentPane().add(chckbxUpi);
		
		JButton btnClickToPurchase = new JButton("Click to Purchase");
		btnClickToPurchase.setForeground(new Color(0, 0, 0));
		btnClickToPurchase.setFont(new Font("Segoe UI", Font.BOLD, 23));
		btnClickToPurchase.setBackground(new Color(255, 255, 255));
		btnClickToPurchase.setBounds(291, 665, 232, 36);
		frmCppPurchasePage.getContentPane().add(btnClickToPurchase);
		
		JButton btnback = new JButton("BACK");
		btnback.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				frmCppPurchasePage.setVisible(false);
			}
			
		});
		btnback.setForeground(new Color(0, 0, 0));
		btnback.setFont(new Font("Nirmala UI", Font.BOLD, 25));
		btnback.setBackground(new Color(255, 255, 255));
		btnback.setBounds(60, 665, 110, 36);
		frmCppPurchasePage.getContentPane().add(btnback);
		
		textField = new JTextField();
		textField.setToolTipText("");
		textField.setText("$500");
		textField.setFont(new Font("Segoe UI Light", Font.BOLD, 18));
		textField.setColumns(10);
		textField.setBounds(60, 228, 430, 35);
		frmCppPurchasePage.getContentPane().add(textField);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Please recheck this email as course access will be given here");
		lblNewLabel_2_1_2.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		lblNewLabel_2_1_2.setBounds(60, 354, 430, 21);
		frmCppPurchasePage.getContentPane().add(lblNewLabel_2_1_2);
		
		textField_2 = new JTextField();
		textField_2.setToolTipText("");
		textField_2.setFont(new Font("Segoe UI Light", Font.BOLD, 18));
		textField_2.setColumns(10);
		textField_2.setBounds(60, 420, 430, 35);
		frmCppPurchasePage.getContentPane().add(textField_2);
		
		JTextField textField_3 = new JTextField();
		textField_3.setToolTipText("");
		textField_3.setFont(new Font("Segoe UI Light", Font.BOLD, 18));
		textField_3.setColumns(10);
		textField_3.setBounds(60, 500, 430, 35);
		frmCppPurchasePage.getContentPane().add(textField_3);
		
		JLabel label = new JLabel("New label");
		label.setBounds(209, 108, 15, 13);
		frmCppPurchasePage.getContentPane().add(label);
		
		JLabel lblNewLabel_1_2 = new JLabel("Select Course");
		lblNewLabel_1_2.setForeground(new Color(0, 0, 64));
		lblNewLabel_1_2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(60, 117, 175, 35);
		frmCppPurchasePage.getContentPane().add(lblNewLabel_1_2);
		
//		
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Georgia", Font.PLAIN, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Android Development", "C++", "python", "JAVA"}));
		comboBox.setBounds(60, 150, 349, 37);
		frmCppPurchasePage.getContentPane().add(comboBox);
		lblNewLabel_3.setIcon(new ImageIcon(Cpppurchase.class.getResource("/images/e835598ba182b93e5c217a0237f9d86e.jpg")));
		lblNewLabel_3.setBounds(0, 0, 551, 716);
		frmCppPurchasePage.getContentPane().add(lblNewLabel_3);
		
	}
}
