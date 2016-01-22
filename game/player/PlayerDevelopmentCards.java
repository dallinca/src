package game.player;

import java.util.*;

/**
 * The DevelopmentCards class keeps track of a players development cards 
 * It has methods for placing roads, settlements, and cities
 * 
 * Operations for the class include adding and deleting development cards from a player
 * 
 *
 * Domain:
 * 		ArrayList developmentCards: each player has an array of 0 to 25 development cards
 */


public class PlayerDevelopmentCards {
	
	private ArrayList<DevelopmentCard> developmentCards;
	//private enum developmentCards {knight, progress, victoryPoint};
    //private enum progressCards {roadBuilder, monopoly, yearOfPlenty};
     
    /**
	 * Initializes DevelopmentCards
	 * 
	 * @pre A Player object exists
	 * @post new ArrayList DevelopmentCards = 0 
	 */
    PlayerDevelopmentCards(){}
    
    /**
	 * adds development cards to player
	 * 
	 * @param cards that need to be added
	 * 
	 * @pre None
	 * @post cards added to ArrayList data structure
	 */
    void addCard(){}
    
    /**
	 * removes resource cards from player
	 * 
	 * @pre None
	 * @post deleted from ArrayList data structure
	 */
    void deleteCard(){}
    
	/**
	 * Gets the players development cards
	 * 
	 * @pre None
	 * @post Returns the players development cards
	 */
	public ArrayList<DevelopmentCard> getDevelopmentCards(){
		return null;}
}
