package grafik;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BildVisare extends JFrame {

	private JLabel bild= new JLabel(new ImageIcon("bild1.jpg"));
	private JButton b1 = new JButton("bytbild");
	private boolean bb=true;
	/*
	 * konstruktorn sätter start utsendet för fönstret
	 * 
	 * 
	 */	
	public BildVisare() {
	 	
		
	this.setLayout(new FlowLayout());	
	this.setVisible(true);
	this.setSize(300, 600);
	this.add(bild);
	this.add(b1);	
	
	b1.addActionListener(e->{
	
		
		
		if (bb==true) {
			bild.setIcon(new ImageIcon("bild2.jpg"));
			bb=false;
		}else {
			bb=true;
			bild.setIcon(new ImageIcon("bild1.jpg"));
			
		}
		
		
		
		
		
		
		/*
		System.out.println(bild.getIcon().toString());
		
		if(bild.getIcon().toString().equals("bild1.jpg")) {
		
		bild.setIcon(new ImageIcon("bild2.jpg"));
		}else {
			
			bild.setIcon(new ImageIcon("bild1.jpg"));
		}
		
		
		*/
	});
	
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		new BildVisare();
	}
	
}
