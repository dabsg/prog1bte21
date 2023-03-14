package grafik;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Plusminus extends JFrame implements ActionListener {

	int värde=0;
	
	JButton minus=new JButton("-");
	JButton plus=new JButton("+");
	JLabel text = new JLabel(""+värde);
	
	
	 public Plusminus() {
		 
		 this.setLayout(new FlowLayout());
		 this.setVisible(true);
		 this.setSize(new Dimension(400,400));
		 this.add(minus);
		 this.add(plus);
		 this.add(text);
		 plus.addActionListener(this);
		 minus.addActionListener(this);
	 }
	
	
	
	 
	public static void main(String[] args) {
	
	new Plusminus();
	new Plusminus();
	
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==plus) {
			
			värde++;
			
		}if(e.getSource()==minus) {
			
			värde--;
			
		}
		
		text.setText(""+värde);
		
	}
}
