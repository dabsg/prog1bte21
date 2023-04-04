package egengrafik.bollar;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;
import javax.swing.WindowConstants;

import egengrafik.Boll1;

public class Game extends JComponent {

	private Timer t;
	
	private Boll b1= new Boll();
	
	public Game() {
		
		setPreferredSize(new Dimension(500, 500));

		t = new Timer(10, e -> {

			
			
			b1.move();
			repaint();
			//System.out.println("x blir:" + b1.getx() + " y bilr:" + b1.gety());

		});

		t.start();
	
		
		
	}
	
	
	@Override
	protected void paintComponent(Graphics g) {
		
		
		g.setColor(b1.getC());
		g.fillRect(b1.getx(), b1.gety(), 100, 100);
		
		
		super.paintComponent(g);
	}
	
	
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame("boll");

		

		f.setContentPane(new Game());
		f.setVisible(true);
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		f.pack();

		
	}
	
	
}
