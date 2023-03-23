package grafik;

import java.awt.Checkbox;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioTest {

	JFrame f= new JFrame();
	JRadioButton r1= new JRadioButton(); 
	JRadioButton r2= new JRadioButton(); 
	JRadioButton r3= new JRadioButton();
	ButtonGroup g1 = new ButtonGroup();
	Checkbox c1= new Checkbox();
	
	
	public RadioTest() {
	
		f.setLayout(new FlowLayout());
		f.setVisible(true);
		f.setSize(new Dimension(400,600));
		
		
		g1.add(r1);
		g1.add(r2);
		g1.add(r3);
		
		
		f.add(r1);
		f.add(r2);
		f.add(r3);
		f.add(c1);
	}
	
	
	public static void main(String[] args) {
		
		new RadioTest();
	}
	
	
}
