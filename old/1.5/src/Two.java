import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class Two extends JFrame{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	Tree t = null;
	
	public void pr(String s){		//w/o \n
		System.out.print(s);
	}
	public void prn(String s){
		System.out.println(s);
	}
	
	protected void clear(){
		textField.setText("");
		textField_1.setText("");
	}
	
	protected String get1(){
		System.out.println("GET1 " + textField.getText());
		return textField.getText();
	}
	
	protected String get2(){
		System.out.println("GET2 " + textField_1.getText());
		return textField_1.getText();
	}

	public Two(Tree x) {
		System.out.println("Constructor");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 185+120+40, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		t = x;
		
		JLabel lblInsertParentsPath = new JLabel("Insert Parents Path: ");
		lblInsertParentsPath.setBounds(30, 50, 120, 25);
		contentPane.add(lblInsertParentsPath);
		
		JLabel lblInsertChildsPath = new JLabel("Insert Child's path: ");
		lblInsertChildsPath.setBounds(30, 125, 120, 25);
		contentPane.add(lblInsertChildsPath);
		
		textField = new JTextField("Nothing");
		textField.setBounds(185, 50, 120, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField("Bonus");
		textField_1.setBounds(185, 125, 120, 30);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(115, 192, 97, 25);
		contentPane.add(btnSubmit);
		btnSubmit.addActionListener(Window.l);
		
		setVisible(true);
	}
}
