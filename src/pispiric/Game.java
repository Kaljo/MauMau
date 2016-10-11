package pispiric;

public class Game {

	public static final int CARDS_PER_PLAYER = 6;
	private Deck deck;
	private Player[] players;
	
	public Game(){
		deck = new Deck();
		players = new Player[4];
		for (int i = 0; i < players.length; i++){
			players[i] = new Player("Player" + (i+1));
		}
	}
	
	public void start(){
		deck.shuffle();
		deck.showDeck();
		shareCards();
		showPlayersCards();
	}
	
	public void shareCards(){
		
		for (int i = 0; i < CARDS_PER_PLAYER; i++){
			for (int j = 0; j < players.length; j++){
				players[j].giveCard(deck.nextCard());
			}
		}
		
	}
	
	public void showPlayersCards(){
		
		System.out.println("Players cards");
		for (int i = 0; i < players.length; i++){
			System.out.println();
			players[i].showCards();
		}
		
	}
	
	public static void main(String[] args){
		
		Game g = new Game();
		g.start();
		
	}
	
}
