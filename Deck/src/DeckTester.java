
public class DeckTester 
{
	public static void main(String[] args) 
	{
		String [] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		String [] suits = {"Diamonds", "Clubs", "Hearts", "Spades"};
		int [] pointValues = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		
		Deck z = new Deck(ranks, suits, pointValues);
		z.shuffler();

		for(int i = 0; i < 52; i++) 
		{
			z.deal();
		}
		
		System.out.print(z);
	}
}
