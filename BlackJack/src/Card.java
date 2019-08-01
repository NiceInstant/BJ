public class Card {
	public String name;
	public int p;
	
	public Card(String n) {
		name = n;
			}
	
	public String setCard() {
		return name;
	}
	public int getPoints() {
		return p;
	}
	
	public void calculatePoint() {
		char[] s = name.toCharArray();
		
		if(String.valueOf(s[0]).equals("D") ) {
			p = 3;
		}
		else if(String.valueOf(s[0]).equals("K") ) {
			p = 4;
		} 
		else if(String.valueOf(s[0]).equals("B") ) {
			p = 2;
		}
		else if(String.valueOf(s[0]).equals("T") ) {
			p = 11;
		}
		else {
			p = Integer.parseInt(String.valueOf(s[0]));
		}
	}
}