package org.tnsindia.enumeration;

public enum EnumCardsDemo implements InterfaceCardsDemo  {
	
	HEART,CLUB,DIAMOND,SPADES;

	@Override
	public void print() {
		
		System.out.println("Selected shape in the cards:"+this);
	}

}
