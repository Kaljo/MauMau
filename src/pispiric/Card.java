package pispiric;

public class Card {

	public static final int HERC = 0;
	public static final int KARO = 1;
	public static final int PIK = 2;
	public static final int TREF = 3;
	
	public static final int JACK = 11;
	public static final int QUEEN = 12;
	public static final int KING = 13;
	
	private int value;
	private int sign;
	
	public Card(int value, int sign){
		this.value = value;
		this.sign = sign;
	}

	public int getValue() {
		return value;
	}

	public int getSign() {
		return sign;
	}
	
	public String getSignName(){
		
		switch(sign){		
		case HERC: return "HERC";
		case KARO: return "KARO";
		case PIK: return "PIK";
		case TREF: return "TREF";
		}
		return "";
	}
	
	public String getValueName(){
		
		switch(value){
		
		case JACK: return "JACK";
		case QUEEN: return "QUEEN";
		case KING: return "KING";
		default : return "" + value;
		}
		
	}
	
	
	
	
}
