package loginPage;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class welcome extends JFrame {

	private JPanel contentPane;
	private JTextField source;
	private JTextField destination;
	public String source1,destination1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					welcome frame = new welcome();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public welcome() {
		setTitle("Bus Depot & Services");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 703, 525);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 source1 = source.getText();
			     destination1 = destination.getText();
				datadisplay d =new datadisplay();
				d.actionPerformed(e, source1, destination1);
			d.setVisible(true);
			}
		});
		
		JButton btnLogout = new JButton("LOGOUT");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				loginPage l = new loginPage();
				setVisible(false);
				l.setVisible(true);
			}
		});
		btnLogout.setBackground(Color.LIGHT_GRAY);
		btnLogout.setFont(new Font("Mongolian Baiti", Font.BOLD, 15));
		btnLogout.setBounds(147, 274, 124, 27);
		contentPane.add(btnLogout);
		
		btnSubmit.setFont(new Font("Mongolian Baiti", Font.BOLD, 15));
		btnSubmit.setBackground(Color.LIGHT_GRAY);
		btnSubmit.setBounds(147, 214, 124, 27);
		contentPane.add(btnSubmit);
		
		destination = new JTextField();
		destination.setFont(new Font("Mongolian Baiti", Font.BOLD, 15));
		destination.setBounds(147, 155, 181, 22);
		contentPane.add(destination);
		destination.setColumns(10);
		
		JLabel lblDestination = new JLabel("DESTINATION");
		lblDestination.setFont(new Font("Mongolian Baiti", Font.BOLD, 15));
		lblDestination.setBounds(12, 158, 119, 16);
		contentPane.add(lblDestination);
		
		source = new JTextField();
		source.setFont(new Font("Mongolian Baiti", Font.BOLD, 15));
		source.setBounds(147, 93, 181, 22);
		contentPane.add(source);
		source.setColumns(10);
		
		JLabel lblSource = new JLabel("SOURCE");
		lblSource.setFont(new Font("Mongolian Baiti", Font.BOLD, 15));
		lblSource.setBounds(12, 96, 75, 16);
		contentPane.add(lblSource);
		
		JLabel lblWelcomeToBus = new JLabel("WELCOME TO BUS DEPOT AND SERVICES");
		lblWelcomeToBus.setFont(new Font("Mongolian Baiti", Font.BOLD, 16));
		lblWelcomeToBus.setBounds(166, 13, 406, 16);
		contentPane.add(lblWelcomeToBus);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setFont(new Font("Mongolian Baiti", Font.BOLD, 15));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\lenovo\\Downloads\\bus1.jpg"));
		lblNewLabel.setBounds(0, 0, 696, 478);
		contentPane.add(lblNewLabel);
	}
	private void close() {
		WindowEvent winclosing=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winclosing);
	}
	
}
 
