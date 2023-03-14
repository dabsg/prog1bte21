package grafik;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Plusminus2 extends JFrame implements ActionListener {

	int värde=0;
	
	JButton minus=new JButton("-");
	JButton plus=new JButton("+");
	JLabel text = new JLabel(""+värde);
	
	
	 public Plusminus2() {
		 
		 this.setLayout(new FlowLayout());
		 this.setVisible(true);
		 this.setSize(new Dimension(400,400));
		 this.add(minus);
		 this.add(plus);
		 this.add(text);
		 plus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				värde++;
				text.setText(""+värde);
				
			}
		});
		 minus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				värde++;
				text.setText(""+värde);
				
			}
		});
	 }
	
	
	
	 
	public static void main(String[] args) {
	
	new Plusminus2();
	new Plusminus2();
	
	}


	
	
}
