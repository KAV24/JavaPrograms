package com.bridgelabz.deckofcardsqueue.main;


import com.bridgelabz.deckofcardsqueue.Impl.DeckOfCardsQueueImpl;
import com.bridgelabz.deckofcardsqueue.Interface.DeckOfCardsQueueInterface;

public class DeckOfCardsQueueMain {
	
		
		
		
			public static void main(String[] args) {
				DeckOfCardsQueueInterface deckQueueImpl=new DeckOfCardsQueueImpl();
			    	deckQueueImpl.intializeCard();
			    	deckQueueImpl.shuffleCard();
					deckQueueImpl.deckQueueStore();
					deckQueueImpl.displayDeck();
			}	    
			    
			}
	

