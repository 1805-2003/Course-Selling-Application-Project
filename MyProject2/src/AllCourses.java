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
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class AllCourses {

	private JFrame frmAllCourses;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AllCourses window = new AllCourses();
					window.frmAllCourses.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AllCourses() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAllCourses = new JFrame();
		frmAllCourses.setTitle("All Courses");
		Toolkit kit= Toolkit.getDefaultToolkit();
		Dimension dim= kit.getScreenSize();
		int width=(int)dim.getWidth();
		int height=(int)dim.getHeight();
		frmAllCourses.setSize(484, 753);
		frmAllCourses.setLocationRelativeTo(null);
		frmAllCourses.setResizable(false);
	    frmAllCourses.setBounds(100, 100, 565, 753);
		frmAllCourses.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAllCourses.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Explore New Courses");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Nirmala UI", Font.BOLD, 30));
		lblNewLabel_1.setBounds(88, 52, 386, 70);
		frmAllCourses.getContentPane().add(lblNewLabel_1);
		
		JButton btncpp = new JButton("C++ with DSA");
		btncpp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Courses.main(null);
			}
		});
		btncpp.setBackground(new Color(255, 255, 255));
		btncpp.setHorizontalAlignment(SwingConstants.LEFT);
		btncpp.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btncpp.setForeground(new Color(0, 0, 0));
		btncpp.setBounds(88, 199, 386, 45);
		frmAllCourses.getContentPane().add(btncpp);
		
		JButton btnJavaWithDsa = new JButton("JAVA with DSA");
		btnJavaWithDsa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JavaCourse.main(null);
			}
		});
		btnJavaWithDsa.setHorizontalAlignment(SwingConstants.LEFT);
		btnJavaWithDsa.setForeground(new Color(0, 0, 0));
		btnJavaWithDsa.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btnJavaWithDsa.setBackground(new Color(255, 255, 255));
		btnJavaWithDsa.setBounds(88, 260, 386, 45);
		frmAllCourses.getContentPane().add(btnJavaWithDsa);
		
		JButton btnpython = new JButton("Python with DSA");
		btnpython.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PythonCourse.main(null);
			}
		});
		btnpython.setHorizontalAlignment(SwingConstants.LEFT);
		btnpython.setForeground(new Color(0, 0, 0));
		btnpython.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btnpython.setBackground(new Color(255, 255, 255));
		btnpython.setBounds(88, 328, 386, 45);
		frmAllCourses.getContentPane().add(btnpython);
		
		JButton btnandroid = new JButton("Android Development");
		btnandroid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AndroidDevelopment.main(null);
			}
		});
		btnandroid.setHorizontalAlignment(SwingConstants.LEFT);
		btnandroid.setForeground(new Color(0, 0, 0));
		btnandroid.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btnandroid.setBackground(new Color(255, 255, 255));
		btnandroid.setBounds(88, 396, 386, 45);
		frmAllCourses.getContentPane().add(btnandroid);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 0));
		separator.setBounds(27, 143, 503, 2);
		frmAllCourses.getContentPane().add(separator);
		
		JButton btnback = new JButton("BACK");
		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnback.setBackground(new Color(255, 255, 255));
		btnback.setFont(new Font("Nirmala UI", Font.BOLD, 25));
		btnback.setForeground(new Color(0, 0, 0));
		btnback.setBounds(40, 647, 110, 36);
		frmAllCourses.getContentPane().add(btnback);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(AllCourses.class.getResource("/images/e835598ba182b93e5c217a0237f9d86e.jpg")));
		lblNewLabel.setBounds(0, 0, 551, 716);
		frmAllCourses.getContentPane().add(lblNewLabel);
		

	}

}
