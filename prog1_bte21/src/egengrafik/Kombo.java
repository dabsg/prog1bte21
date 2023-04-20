package egengrafik;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Kombo extends JComponent implements KeyListener {

	public int[] x = { 200, 210, 220 };
	public int[] y = { 200, 230, 200 };

	public Kombo() {

		setPreferredSize(new Dimension(400, 400));
		addKeyListener(this);
	}

	@Override
	protected void paintComponent(Graphics g) {

		super.paintComponent(g);
		g.fillPolygon(x, y, y.length);
	}

	public static void main(String[] args) {

		JFrame f = new JFrame();
		Kombo k = new Kombo();
		JButton right = new JButton("\u2192");

		JPanel jp = new JPanel();
		jp.add(k);
		jp.add(right);
		f.setContentPane(jp);
		f.setVisible(true);
		f.pack();
		
		f.addKeyListener(k);
		k.requestFocusInWindow();
		
		right.addActionListener(e -> {

			for (int i = 0; i < k.x.length; i++) {

				k.x[i] += 5;
				
			}
			k.requestFocusInWindow();
			k.repaint();

		});

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
	
		if(e.getKeyCode()==KeyEvent.VK_RIGHT) {

			for (int i = 0; i < x.length; i++) {

				x[i] += 5;
			}
			repaint();
			
			
		}
		
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
