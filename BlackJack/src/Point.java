import java.util.ArrayList;
import java.util.Random;
public class Point {

	public static void main(String[] args) {
		
		ArrayList<Card> cards = new ArrayList<>();
	    
		String[] s = new String[]{"6♠", "7♠", "8♠", "9♠", "10♠", "B♠", "D♠", "K♠", "T♠","6♣", "7♣", "8♣", "9♣", "10♣", "B♣", "D♣", "K♣", "T♣","6♥", "7♥", "8♥", "9♥", "10♥", "B♥", "D♥", "K♥", "T♥","6♦", "7♦", "8♦", "9♦", "10♦", "B♦", "D♦", "K♦", "T♦"};
		
		for(int i = 0;i < s.length; i++ ) {
			cards.add(new Card(s[i]));
			cards.get(i).calculatePoint();
		}
		int rnd = (int)Math.floor(Math.random()*s.length);
		int rnd1 = (int)Math.floor(Math.random()*s.length);
		
		for (int i = 0; i < s.length; i++) {
			cards.add(new Card(s[i]));
			cards.get(i).calculatePoint();
		}
	
		
		System.out.println(s[rnd]+"=" +cards.get(rnd).getPoints());
		System.out.println(s[rnd1]+"=" +cards.get(rnd1).getPoints());
		   
		   
	
	}
}