package grafik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Text extends JFrame {  // måste ha 

		JLabel l1 =new JLabel("ange namn");
		JLabel l2 =new JLabel("skriv en berättelse");
		JLabel l3 =new JLabel("");
	
		JTextField text1= new JTextField(30);
		JTextArea  textarea= new JTextArea(5,10);
		JButton  b1 = new JButton("click me");
	
	
	 public Text() {     //konstruktor
		
		 
		 setLayout(new FlowLayout());
		 setVisible(true);
		 setSize(new Dimension(400,600));
		 getContentPane().setBackground(Color.cyan);
		 l1.setForeground(Color.green);
		 l1.setForeground(Color.green);
		 add(l1);
		 add(text1);
		 add(l2);
		 add(textarea);
		 add(b1);
		 add(l3);
		 
		 
		 b1.addActionListener(e->{
			 
			String s1 = text1.getText()+" " +textarea.getText();
			 
			l3.setText(s1);
			 
		 });
		 
		 
		 
		 
		 
		 
	}  
	
	
	public static void main(String[] args) {
		
		
		new Text();
		
	}
	
	
}
