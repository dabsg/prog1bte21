package grafik;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Klocka extends JFrame{

	JLabel clock= new JLabel("");
	SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");  
	Date date ;  
	
	
	
	
	public Klocka() {
		
		
		date= new Date();
		
		
		
		
		 TimerTask task = new TimerTask() {
		        public void run() {
		           
		        	date= new Date();
		        	
		        	
		        	clock.setText(""+formatter.format(date));
		        	
		        	
		        }
		    };
		    Timer timer = new Timer("Timer");
		    
		    long delay = 1000L;
		 
		    long period = 1000L;
		    timer.scheduleAtFixedRate(task, delay, period);
		
		
		
		
		
		
		Font font = null;
		try {
			font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResource("Monoton-Regular.ttf").openStream());
		} catch (FontFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   

		GraphicsEnvironment genv = GraphicsEnvironment.getLocalGraphicsEnvironment();
		genv.registerFont(font);
		// makesure to derive the size
		font = font.deriveFont(50f);
		
		
		
		clock.setFont(font);
		setVisible(true);
		setLayout(new FlowLayout());
		setSize(500,500);
		
		add(clock);
		
		clock.setText(""+formatter.format(date));
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		new Klocka();
	}
	
	
}
