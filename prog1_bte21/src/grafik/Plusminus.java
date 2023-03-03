package grafik;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;

public class Plusminus extends JFrame {

	JButton minus=new JButton("-");
	JButton plus=new JButton("+");
	JLabel text = new JLabel("0");
	
	
	 public Plusminus() {
		 
		 this.setLayout(new FlowLayout());
		 this.setVisible(true);
		 this.setSize(new Dimension(400,400));
		 this.add(minus);
		 this.add(plus);
		 this.add(text);
	 }
	
	
	public static void main(String[] args) {
	
	new Plusminus();
	
	}
}
