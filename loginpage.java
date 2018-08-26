package loginPage;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Color;

public class loginPage {

	private JFrame frmBusDepot;
	private JTextField usernametextField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginPage window = new loginPage();
					window.frmBusDepot.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public loginPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBusDepot = new JFrame();
		frmBusDepot.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frmBusDepot.setTitle("Bus Depot & Services");
		frmBusDepot.setBounds(100, 100, 703, 526);
		frmBusDepot.getContentPane().setLayout(null);
		
		JButton Login = new JButton("LOGIN");
		Login.setBackground(Color.LIGHT_GRAY);
		Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				@SuppressWarnings("deprecation")
				String password = passwordField.getText();
				String username = usernametextField.getText();
				 if(password.contains("busdepot")&&username.contains("admin")) {
				usernametextField.setText("");
				passwordField.setText("");
				//close();
				welcome w =new welcome();
				w.setVisible(true);
				
				
			} else {
				JOptionPane.showMessageDialog(null, "the password or username is incorrect\n click OK","Wrong password",JOptionPane.ERROR_MESSAGE);
				passwordField.setText("");
				usernametextField.setText("");
			}}
			});
		
		passwordField = new JPasswordField();
		passwordField.setBounds(124, 105, 240, 22);
		frmBusDepot.getContentPane().add(passwordField);
		Login.setFont(new Font("Mongolian Baiti", Font.BOLD, 15));
		Login.setBounds(124, 171, 97, 25);
		frmBusDepot.getContentPane().add(Login);
		
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Mongolian Baiti", Font.BOLD, 15));
		lblPassword.setBounds(12, 108, 89, 16);
		frmBusDepot.getContentPane().add(lblPassword);
		
		JLabel lblUsername = new JLabel("USERNAME");
		lblUsername.setFont(new Font("Mongolian Baiti", Font.BOLD, 15));
		lblUsername.setBounds(12, 42, 100, 16);
		frmBusDepot.getContentPane().add(lblUsername);
		
		usernametextField = new JTextField();
		usernametextField.setFont(new Font("Mongolian Baiti", Font.BOLD, 15));
		usernametextField.setBounds(124, 39, 240, 22);
		frmBusDepot.getContentPane().add(usernametextField);
		usernametextField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\lenovo\\Downloads\\bus1.jpg"));
		lblNewLabel_1.setBounds(0, 0, 685, 479);
		frmBusDepot.getContentPane().add(lblNewLabel_1);
		}
		public void close() {
//	WindowEvent winclosing = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
//	Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winclosing);
	System.exit(0);
		}

		public void setVisible(boolean b) {
			// TODO Auto-generated method stub
			
		}
}
