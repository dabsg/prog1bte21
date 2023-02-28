package objektorientering;

import java.awt.Toolkit;

import javax.swing.JOptionPane;
import javax.swing.text.DefaultEditorKit.BeepAction;

public class Hiss {

	// instansvariabeler /medlemmar /objektsvariabel
	private int våning;
	private int riktning;
	private int maxFloor;
	private int minFloor;

	// konstruktor
	public Hiss(int v, int max, int min) {

		våning = v;
		maxFloor = max;
		minFloor = min;

	}

	public Hiss(int max, int min) {

		våning = 1;
		maxFloor = max;
		minFloor = min;
	}

	public int getVåning() {

		return våning;
	}

	public void moveTo(int wantedFloor) throws InterruptedException {

		if(wantedFloor <=maxFloor && wantedFloor>= minFloor) {
		if (wantedFloor < våning ) {
			// neråt
			for (int i = våning; i > wantedFloor; i--) {

				Thread.sleep(2000);
				våning--;
				System.out.println(våning);
			}
		} else if (wantedFloor > våning) {
			// upp
			for (int i = våning; i < wantedFloor; i++) {

				Thread.sleep(2000);
				våning++;
				System.out.println(våning);
			}

		}

		}else {
			
			Toolkit.getDefaultToolkit().beep();
			
		}

		// vilken riktning
		// vart
		// hur fort
		// stop på vägen

	}

	public static void main(String[] args) throws InterruptedException {
		Hiss h1 = new Hiss(2, 10, 0);

		h1.moveTo(Integer.parseInt(JOptionPane.showInputDialog("ange våning")));
		//h1.moveTo(4);

		int vv = h1.getVåning();

		System.out.println(vv);

		Hiss h2 = new Hiss(10, 0);
	}

}
