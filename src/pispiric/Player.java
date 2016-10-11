package pispiric;

public class Player {

	private String name;
	private Card[] cards;
	private int points;
	private int numOfCards;
	
	public Player(String name){
		this.name = name;
		points = 0;
		cards = new Card[6];
		numOfCards = 0;
	}
	
	public void giveCard(Card card){
		cards[numOfCards++] = card;
	}
	
	public Card seeCard(int index){
		if (index > numOfCards){
			return null;
		}else{
			return cards[index];
		}
	}
	
	public void showCards(){
		System.out.println(name);
		for (int i = 0; i < numOfCards; i++){
			System.out.println(cards[i].getValueName() + " " + cards[i].getSignName());
		}
	}
}
