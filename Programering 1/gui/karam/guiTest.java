package karam;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class guiTest extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txtSum;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					guiTest frame = new guiTest();
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
	public guiTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt1 = new JTextField();
		txt1.setBounds(27, 81, 96, 20);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		JLabel lblAddCalc = new JLabel("addition Calc");
		lblAddCalc.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblAddCalc.setBounds(140, 11, 96, 35);
		contentPane.add(lblAddCalc);
		
		txt2 = new JTextField();
		txt2.setBounds(155, 81, 96, 20);
		contentPane.add(txt2);
		txt2.setColumns(10);
		
		txtSum = new JTextField();
		txtSum.setBounds(302, 81, 96, 20);
		contentPane.add(txtSum);
		txtSum.setColumns(10);
		
		lblNewLabel = new JLabel("Term1");
		lblNewLabel.setBounds(44, 56, 49, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Term2");
		lblNewLabel_1.setBounds(177, 56, 49, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Summa");
		lblNewLabel_2.setBounds(320, 56, 49, 14);
		contentPane.add(lblNewLabel_2);
		
		Button calc = new Button("Calc Trigger");
		calc.setFont(new Font("Arabic Typesetting", Font.PLAIN, 12));
		calc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//få in texten i ruturna vars variabel är txt1 och txt2 och göra de till strings med variablerna term1 och term2
				String term1 = txt1.getText();
				String term2 = txt2.getText();
				
			//omvandla dessa strings till doubles för att sedan kunna räkna med matte regler 
			
			double tal1 = Double.valueOf(term1); //omvandlar innehållet till en double
			double tal2 = Double.valueOf(term2); //omvandlar innehållet till en double

			//använda dessa tall till att multiplicera och få en summa
			double summa = tal1 * tal2;
			String summ = String.valueOf(summa);
			
			txtSum.setText(summ);  //Skriver ut summa i rutan med variabeln textSum

			}
		});
		calc.setBounds(57, 138, 115, 28);
		contentPane.add(calc);
	}
}
