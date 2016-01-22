package game.player;
import java.util.*;

/**
 * The ResourceCards class is used to store and get individual players cards
 * 
 * Operations are for adding and deleting cards from a player
 *
 * Domain:
 *		Arraylist: player starts with 0 to 3 resource cards. 
 *
 * @invariant 0 <= Arraylist.size() <= 3
 */
public class ResourceCards {
	  private ArrayList resourceCards;
	  private enum resourceCards { brick, wheat, ore, sheep, lumber};
	 
	/**
	 * Initializes ResourceCards
	 * 
	 * @pre A Player object exists
	 * @post new ArrayList resourceCards = 0 - 3
	 */
	  ResourceCards(){}
	 
	/**
	 * adds resource cards to player
	 * 
	 * @param cards that need to be added
	 * 
	 * @pre None
	 * @post cards added to ArrayList data structure
	 */
	  public void addCard(type cards){}
	 
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
	public ArrayList getResourceCards(){
		return null;}
}
