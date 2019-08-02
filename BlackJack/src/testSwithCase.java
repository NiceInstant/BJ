import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class testSwithCase {

	public static void main(String[] args) {

	
		System.out.println(calculate());

	}

	public static List<String> calculate() {

		List<String> result = new ArrayList<String>();
		int num = 0;
		Random ran = new Random();
		for (int i = 0; i < 5; i++) {
			num = ran.nextInt(12);

			switch (num) {
			case 2:
				result.add("V♠");

				break;
			case 3:
				result.add("D♠");

				break;
			case 4:
				result.add("K♠");

				break;
			case 11:
				result.add("T♠");

				break;
			
			default:
				result.add(num + "♠");
				break;
			}
			
		}
		return result;
	}

	/*
	 * public static void mouseClicked (MouseEvent e) { if(e == KeyEvent.) {
	 * 
	 * }
	 */

}
