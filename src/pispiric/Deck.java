package pispiric;

import java.util.*;


public class Deck {

	private Card[] cards;
	private int nextCard = 0;
	
	public Deck(){
		cards = new Card[52];
		for (int i = 0; i < 4; i++){
			for (int j = 0; j < 13; j++){
				cards[13*i + j] = new Card(j+1, i);
			}
		}
	}
	
	public void shuffle(){
		
		Random r = new Random();
		
		for (int i = 0; i < 50; i++){
			
			int x = r.nextInt(cards.length);
			int y = r.nextInt(cards.length);
			
			Card temp = cards[x];
			cards[x] = cards[y];
			cards[y] = temp;
			
		}
		
	}
	
	public Card nextCard(){
		return cards[nextCard++];
	}
	
	public void showDeck(){
		for (int i = 0; i < 52; i++){
			System.out.println(cards[i].getValueName() + " " + cards[i].getSignName());
		}
	}
	
}
