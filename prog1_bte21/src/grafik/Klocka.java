package grafik;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Klocka extends JFrame{

	JLabel clock= new JLabel("");
	SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");  
	Date date = new Date();  
	
	
	
	
	public Klocka() {
		
		
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
