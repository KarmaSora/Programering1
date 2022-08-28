package karam;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class TelefonGui extends JFrame {

	private JPanel contentPane;
	private JTextField textNamn;
	private JTextField textTeleNum;
	ArrayList<PostTele> Post = new ArrayList<>(); // en form av array som kan bli modiferad av användaren, här kan
										// användaren lägga till och ta bort saker från arrayn
	private JTextArea txtList = new JTextArea();

	/*
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		PostTele p = new PostTele("Namn", "Telenum"); 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelefonGui frame = new TelefonGui();
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
	public TelefonGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNamn = new JLabel("Name");
		lblNamn.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNamn.setBounds(42, 31, 96, 26);
		contentPane.add(lblNamn);

		JLabel lblTeleNum = new JLabel("Phone number");
		lblTeleNum.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblTeleNum.setBounds(221, 37, 112, 14);
		contentPane.add(lblTeleNum);

		textNamn = new JTextField();
		textNamn.setBounds(42, 78, 142, 20);
		contentPane.add(textNamn);
		textNamn.setColumns(10);

		textTeleNum = new JTextField();
		textTeleNum.setBounds(221, 78, 160, 20);
		contentPane.add(textTeleNum);
		textTeleNum.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 149, 357, 285);
		contentPane.add(scrollPane);
		scrollPane.setViewportView(txtList);
		txtList.setEditable(false);

		JButton btnAddCon = new JButton("Add Contact");
		btnAddCon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// hämtar Texten i rutan Namn och TeleNum
				String NameText = textNamn.getText();
				String TeleText = textTeleNum.getText();
				if(NameText.equals("") || TeleText.equals("")) { // se till att det inte går att skriva ut tömma rutor
					System.out.println("you must insert name and number");
					return;
				}				
				String Contact = NameText + "\t" + TeleText;
				
				Post.add(new PostTele(NameText, TeleText)); // lägger till nya variabler
				
				// gör att TeleText rutan endast kan ha siffror
				// altinativ för att endast tal ska regestreras i nummerfältet
			//	double T1 = Double.valueOf(TeleText); //omvandlar innehållet till
				// en double på det sättet endast nummer accepteras i nummer inset fältet

				// skriv ut Namn och nummer samt ger de samlingsnamn Contact
			
				txtList.append(Contact + "\n" );
				
				
				// tömmer rutan texNamn och TeleNum
				textNamn.setText("");
				textTeleNum.setText("");
				}
				
			
		});
		btnAddCon.setBounds(433, 89, 103, 23);
		contentPane.add(btnAddCon);

		JButton btnRemove = new JButton("Remove"); 
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String namn = textNamn.getText(); // skapar variabeln namn och get det värdet av innehållet i textNamn
				for (int i = 0; i < Post.size(); i++) { // en loop som runnar igenom arrayn
					if (namn.equals(Post.get(i).getNamn())) { // om namn är lika med arrayn då skall namn tas bort

						// sätter namn till värdet på i
						Post.remove(i); // tar bort index i som i detta fall är nummret och namn

						break; // avbryter loopen
					}
				}
				showAll(); // kallar på metoden show all för att uppdatera sidan.
			}
		});
		btnRemove.setBounds(433, 150, 103, 23);
		contentPane.add(btnRemove);

		JButton btnEdit = new JButton("Edit");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String namn = textNamn.getText(); // skapar variabeln namn och get det värdet av innehållet i textNamn
				int i = 0; //index 0
				for (i = 0; i < Post.size(); i++) { // en loop som runnar igenom arrayn
					if (namn.equals(Post.get(i).getNamn())) { // om namn är lika med arrayn då skall namn tas bort
						break;
					}
				}
				String newnum = JOptionPane.showInputDialog(null, "Skriv det nya numret"); // Jpane för att ändra nummer
				if (i >= Post.size()) { //om index är större eller lika med post.size då ..
					System.out.println("Name couldnt be found!!");
				} else //annars ersäts stringen med värdet i med newnum/det man skriver i JPane
					Post.get(i).setTeleNum(newnum);
				// Edite(); //startar funktionen för edit

				showAll(); //show all metoden för att updatera sidan..
			}
		});
		btnEdit.setBounds(433, 203, 103, 23);
		contentPane.add(btnEdit);

		JButton btnShowCon = new JButton("Show all");
		btnShowCon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showAll(); // kalla på metoden showAll längst ner i koden
			}
		});
		btnShowCon.setBounds(433, 253, 103, 23);
		contentPane.add(btnShowCon);

		JButton btnSearchNum = new JButton("Search num");
		btnSearchNum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				
				int index = search(); //ger "index" värdet på search som är en index av arrayn 
				String TNamn = Post.get(index).getNamn(); //ger Tnamn värdet på index och ger den stringen som finns i Namn stället med getNamn
				String TNum = Post.get(index).getTelenum();// samma som övan men för nummer
				txtList.setText(""); // tömmer JtextArea för att sedan skriva ut det man söker efter
				txtList.append(TNamn +"\t" + TNum + "\n"); // skriver ut Namn och nummer med mellanrum och går ner en rad
			}
		});
		btnSearchNum.setBounds(433, 301, 103, 23);
		contentPane.add(btnSearchNum);

	}

	
	// Metod sektionen

	public void showAll() { // en metod för att refresha och visa alla contacter
		txtList.setText("");
		for (int i = 0; i < Post.size(); i++) { // en loop som runnar igenom Post/contacter
			txtList.append(Post.get(i).getNamn() + "\t" + Post.get(i).getTelenum() + "\n"); //
		}
	}

	// kan användas för Edit
	
	public int search() {
		String namn = textNamn.getText(); // skapar variabeln namn och get det värdet av innehållet i textNamn
		String num = textTeleNum.getText();
		int i = 0;
		for (i = 0; i < Post.size(); i++) { // en loop som runnar igenom arrayn
			if (namn.equals(Post.get(i).getNamn())) { // om namn är lika med arrayn då skall namnet "hittas"
			
				System.out.println(" Contact index is ==> " + i ); // skriver ut index av Contact
				break; } //slutar loop när den hittat namn
		}
		return i;
		

	}
	
	

	
	
	

}
