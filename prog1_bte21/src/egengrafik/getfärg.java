package egengrafik;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Robot;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class getfärg extends JComponent {

	JFrame f;
	
	
	public getfärg(JFrame f) {
		
		setPreferredSize(new Dimension(400,400));
		
		this.f=f;
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		Robot robot = null;
		try {
			robot = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		super.paintComponent(g);
		g.setColor(Color.black);
		g.fillRect(0, 0, 200, 200);
		
		System.out.println(""+robot.getPixelColor(110, 110).toString());
		
	     g.drawString("NASA", 200, 200);
		
	}
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame("hej");
		
		f.setLayout(new FlowLayout());
		f.setVisible(true);
		f.setContentPane(new getfärg(f));
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.pack();
		
		
		
	}
	
	
}
