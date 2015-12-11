import java.util.Random;
import java.util.Scanner;

import javax.swing.JFrame;

import com.alex.apcs.enums.Color;
import com.alex.apcs.utils.random.UtilRandomNumbers;

public class EpilespyJFrame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Do you have Epilespy? ");
		char c = scan.next().charAt(0);
		scan.close();
		if (c == 'N' || c == 'n') {
			final JFrame jf = new JFrame("Epileptic Cancer");
			jf.setSize(500, 500);
			jf.setLocation(UtilRandomNumbers.getRandomInteger(0, 800), UtilRandomNumbers.getRandomInteger(0, 800));
			jf.setVisible(true);
			Random r = new Random();
			while (true) {
				if (r.nextBoolean())
					jf.setLocation(jf.getX() + ((int) (Math.random() * 10)), jf.getY() + ((int) (Math.random() * 10)));
				else 
					jf.setLocation(jf.getX() - ((int) (Math.random() * 10)), jf.getY() - ((int) (Math.random() * 10)));
				jf.setBackground(Color.getRandomColor());
				jf.setSize(jf.getWidth() + UtilRandomNumbers.getRandomInteger(-50, 50), jf.getHeight() + UtilRandomNumbers.getRandomInteger(-50, 50));
			}
		}
	}
}
