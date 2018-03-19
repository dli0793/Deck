//Daniel Li
//Lab 4.1

import java.util.Arrays;

public class Card 
{
	private String ranks;
	private String suits;
	private int value;
	
	public Card(String ranks, String suits, int value)
	{
		this.ranks = ranks;
		this.suits = suits;
		this.value = value;
	}

	
	public String getRanks() {
		return ranks;
	}


	public void setRanks(String ranks) {
		this.ranks = ranks;
	}


	public String getSuits() {
		return suits;
	}


	public void setSuits(String suits) {
		this.suits = suits;
	}


	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}


	public boolean equals(Card otherCard)
	{
		if (Card.getValue()==otherCard.getValue())
		return true;
		
		else
		return false;
	}
	
	
	public String toString() {
		return "Card [getRanks()=" + getRanks() + ", getSuits()=" + getSuits() + ", getValue()=" + getValue() + "]";
	}
	
	
}
