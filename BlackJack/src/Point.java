import java.util.ArrayList;

public class Point {

	public static void main(String[] args) {
		
		ArrayList<Card> cards = new ArrayList<>();
	    
		String[] s = {"6♠", "7♠", "8♠", "9♠", "10♠", "B♠", "D♠", "K♠", "T♠","6♣", "7♣", "8♣", "9♣", "10♣", "B♣", "D♣", "K♣", "T♣","6♥", "7♥", "8♥", "9♥", "10♥", "B♥", "D♥", "K♥", "T♥","6♦", "7♦", "8♦", "9♦", "10♦", "B♦", "D♦", "K♦", "T♦"};
		
		for(int i = 0;i < s.length; i++ ) {
			cards.add(new Card(s[i]));
			cards.get(i).calculatePoint();
			
		}
			
	
		System.out.println(cards.get(6).getPoints());
		System.out.println(cards.get(0).getPoints());
		   
		   
	
	}
}