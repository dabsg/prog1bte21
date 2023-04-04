package egengrafik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.Timer;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Boll1 extends JComponent {

	private int x = 200;
	private int y = 200;
	private int xv = 1;
	private int yv = 1;
	Timer t;

	Color c = new Color(200, 200, 200);

	public Boll1() {

		xv = (int) (Math.random() * 10 - 5);

		yv = (int) (Math.random() * 10 - 5);

		setPreferredSize(new Dimension(500, 500));

		t = new Timer(10, e -> {

			move();
			System.out.println("x blir:" + x + " y bilr:" + y);

		});

		t.start();

	}

	@Override
	protected void paintComponent(Graphics g) {

		g.setColor(new Color(100, 100, 255));
		g.fillRect(x, y, 100, 100);

		super.paintComponent(g);
	}

	public void move() {

		if (x > 500 - 100 || x < 0) {

			xv = xv * -1;

		}
		if (y > 500 - 100 || y < 0) {

			yv = yv * -1;

		}

		x = x + xv;

		y = y + yv;
		repaint();

	}

	public static void main(String[] args) {

		JFrame f = new JFrame("boll");

		Boll1 b = new Boll1();

		f.setContentPane(b);
		f.setVisible(true);
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		f.pack();

	}

}
