package egengrafik.bollar;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Padel implements KeyListener {

	private int y;
	private int x;
	private int v;
	
	
	public Padel(int x , int y , int v) {
	
				this.x=x;
				this.y=y;
				this.v=v;
	
	}
	
	public int getx() {
		
		return this.x;
	}
	public int gety() {
		
		return this.y;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		
		if (e.getKeyCode()==KeyEvent.VK_UP) {
			
			y=y+v;
			System.out.println("hej");
			
		}
		
		
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
