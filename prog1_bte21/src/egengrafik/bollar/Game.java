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

	private Boll b1 []=new Boll[1];
	
	private Padel p1 = new Padel(200,200,5);
	

	public Game(JFrame f) {

		f.addKeyListener(p1);
		
		
	for (int i =0; i<1;i++) {
		
	     b1[i]=new Boll();
	}
	
	
		
		
		
		setPreferredSize(new Dimension(500, 500));

		t = new Timer(30, e -> {

			for (Boll boll : b1) {
				boll.move();
			}
			
			
			repaint();
			// System.out.println("x blir:" + b1.getx() + " y bilr:" + b1.gety());

		});

		t.start();
	}

	@Override
	protected void paintComponent(Graphics g) {

		
		for (Boll boll : b1) {

			g.setColor(boll.getC());
			g.fillRect(boll.getx(), boll.gety(), 100, 100);
			
		} 
		g.setColor(Color.pink);
		g.fillRect(p1.getx(), p1.gety(), 5, 50);

		
		super.paintComponent(g);
	}

	public static void main(String[] args) {

		JFrame f = new JFrame("boll");

		f.setContentPane(new Game(f));
		f.setVisible(true);
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	
		f.pack();

	}

}
