package egengrafik.bollar;

import java.awt.Color;

public class Boll {

	private int x;
	private int y;
	private int xv;
	private int yv;
	private Color c;

	public Boll() {
		
		this.x= (int)(Math.random()*450);
		this.y= (int)(Math.random()*450);
		this.xv = (int) (Math.random() * 11 - 5);

		this.yv = (int) (Math.random() * 11 - 5);
		
		this.c=new Color((int) (Math.random()*256),
				(int) (Math.random()*256) ,
				(int) (Math.random()*256) );
	
	}

	
	public int getx() {
			
		return this.x;
	}
	public int gety() {
		
		return this.y;
	}
	public Color getC() {
		
		return this.c;
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
		
	}

}
