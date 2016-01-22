package game.player;
import java.util.*;

/**
 * The ResourceCards class is used to store and get individual players cards
 * 
 * Operations are for adding and deleting cards from a player, and for checking
 * if the player has the needed resources to buy settlements, cities, and roads.
 *
 * Domain:
 *		Arraylist: player starts with 0 to 3 resource cards. 
 *
 * @invariant 0 <= Arraylist.size() <= 3
 */
public class PlayerResourceCards {
	
	  private ArrayList<ResourceCard> resourceCards;
	  //private enum resourceCards { brick, wheat, ore, sheep, lumber};
	 
	/**
	 * Initializes ResourceCards
	 * 
	 * @pre A Player object exists
	 * @post new ArrayList resourceCards = 0 - 3
	 */
	  PlayerResourceCards(){}
	 
	/**
	 * adds resource cards to player
	 * 
	 * @param cards that need to be added
	 * 
	 * @pre None
	 * @post cards added to ArrayList data structure
	 */
	  public void addCard(ResourceCard card){}
	 
	/**
	 * removes resource cards from player
	 * 
	 * @pre None
	 * @post cards deleted from ArrayList data structure
	 */
	  public void removeCard(){}
	  
	/**
	 * Gets the players resource cards
	 * 
	 * @pre None
	 * @post Returns the players resource cards
	 */
	public ArrayList<ResourceCard> getResourceCards(){
		return null;
	}
	
	/**
	  * checks if a player has resources to buy a road
	  *   
	  * @return boolean
	  */
	   public boolean canDoBuyRoad(){
		   return false;
	   }
	   
	 /**
	  * checks if a player has resources to buy a settlement
	  *   
	  * @return boolean
	  */
	   public boolean canDoBuySettlement(){
		   return false;
	   }
	   
	 /**
	  * checks if a player has resources to buy a city
	  *   
	  * @return boolean
	  */
	   public boolean canDoBuyCity(){
		   return false;
	   }
}
