import java.util.Random;
import java.util.ArrayList;


public class Deck 
{
	private ArrayList <Card> unDealt;
	private ArrayList <Card> Dealt;

	
	public Deck(String [] ranks, String [] suits, int [] pointValue) 
	{
		this.Dealt = new ArrayList<Card>();
		this.unDealt = new ArrayList<Card>();
		
		for(int i=0;i<suits.length;i++) 
		{
			for(int j=0;j<ranks.length;j++) 
			{
				unDealt.add(new Card(suits[i], ranks[j], pointValue[j]));
			}
		}
	}

	public boolean isEmpty()
	{
		if(unDealt.size()==0) 
		return true;
		
		else
		return false;
	}

	int size() 
	{
		return unDealt.size();
	}
	
	public Card deal() 
	{
		if(unDealt.size()!=0)
		{
			Card x = unDealt.get(0);
			Dealt.add(x);
			return unDealt.remove(0);
		}
		else 
		return null;
	}

	public void shuffler()
	{
		  Random x = new Random();
		 
		  for(int i=Dealt.size()-1;i>=0;i--)
		   {
		      unDealt.add(Dealt.remove(i));   
		   }
		 
		  for (int j=51;j>0;j--)
		  {
			int f = x.nextInt(j);
			Card g = unDealt.get(f);
			Card temp = unDealt.get(j);
			unDealt.set(f, temp);
			temp = unDealt.set(j, g); 
		  }
	}
	
	public String toString() 
	{
		return "Undealt Deck: " + unDealt + "\n Dealt Deck: " + Dealt;
	}
}