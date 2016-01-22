package shared.model.player;
/**
 * The Player class is used to create a player object
 * 
 * It has methods for checking if a player can place roads or settlements
 *
 * Domain:
 * 		totalVictoryPoints: an integer, initialized to 2
 * 
 */
public class Player {
	
	/**
	 * Initializes Player
	 * 
	 * @pre None
	 * 
	 * @post new color()
	 * @post new totalVictoryPoints() = 2
	 * @post new buildingCostCard()
	 * @post new ResourceCards()
	 * @post new DevelopmentCards()
	 * @post new Municipal()
	 */
	Player(){}
	
	/**
	 * adds victory points and returns total victory points
	 * 
	 * @pre None
	 * @post Returns an integer of players total victory points
	 */
	void totalVictoryPoints(int points){}
	
	/**
	 * The color specific building cost card for the player
	 * 
	 * @pre None
	 * @post Returns building cost card
	 */
	void getbuildingCostCard(){}
	

	 /**
	  * checks if a player can buy a road
	  *   
	  * @return boolean
	  */
	   public boolean canDoBuyRoad(){
		   return false;
	   }
	   
	 /**
	  * checks if a player can buy a settlement
	  *   
	  * @return boolean
	  */
	   public boolean canDoBuySettlement(){
		   return false;
	   }
	   
	 /**
	  * checks if a player can buy a city
	  *   
	  * @return boolean
	  */
	   public boolean canDoBuyCity(){
		   return false;
	   }
	     
	
}
