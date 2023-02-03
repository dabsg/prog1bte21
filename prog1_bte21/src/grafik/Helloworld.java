package grafik;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.sql.rowset.serial.SerialJavaObject;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Helloworld extends JFrame {

	JButton b1 = new JButton("knapp");
	JLabel l1 = new JLabel("");
	
	public Helloworld() {
		
	setLayout(new FlowLayout());
	setVisible(true);
	setSize(new Dimension(400,400));
	this.add(b1);
	this.add(l1);
	
	b1.addActionListener(e->{
		
		l1.setText("hej");
		
	});
		
	}
	
	
	public static void main(String[] args) {
		
		
		new Helloworld();
		new Helloworld();
	}
	
	
}
