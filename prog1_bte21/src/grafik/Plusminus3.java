package grafik;

import java.awt.Dimension;
import java.awt.FlowLayout;


import javax.swing.*;

public class Plusminus3 extends JFrame {


	int värde=0;
	
	JButton minus=new JButton("-");
	JButton plus=new JButton("+");
	JLabel text = new JLabel(""+värde);
	
	
	 public Plusminus3() {
		 
		 this.setLayout(new FlowLayout());
		 this.setVisible(true);
		 this.setSize(new Dimension(400,400));
		 this.add(minus);
		 this.add(plus);
		 this.add(text);
		 plus.addActionListener(e->{
			 värde++;
			 text.setText(""+värde);
		 });
		 minus.addActionListener(e->{
			 värde--;
			 text.setText(""+värde);
		 });
	 }
	
	
	
	 
	public static void main(String[] args) {
	
	new Plusminus3();
	new Plusminus3();
	
	}


	
	
}
