package egengrafik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Musse extends JComponent {

	public Musse() {
		
		setPreferredSize(new Dimension(400,400));
		
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.black);
		g.drawRect(0, 0, 200, 200);
		
		g.drawOval(100, 100, 100, 100);
		g.fillOval(300, 300, 50, 50);
		
		
	     g.drawString("NASA", 200, 200);
		
	}
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame("hej");
		
		f.setLayout(new FlowLayout());
		f.setVisible(true);
		f.setContentPane(new Musse());
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.pack();
		
		
		
	}
	
	
}
