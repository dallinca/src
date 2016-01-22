package game.player;

import java.util.*;

/**
 * The Municipal class keeps track of a players settlements and cities. 
 * It has methods for placing settlements, and cities
 * 
 * Operations allow for independent players to place roads, settlements, and
 * removes settlements when a city is placed. 
 * 
 *
 * Domain:
 * 		ArrayList roads: each player has an array of 15 roads
 * 		ArrayList settlements: each player has an array of 5 settlements
 *		ArrayList cities: each player has an array of 4 cities
 */

public class Municipal {
	
	   private ArrayList settlement;
	   private ArrayList city;
	   private ArrayList roads;
	   
	/**
	 * Initializes Municipal
	 * 
	 * @pre A Player object exists
	 * 
	 */
	   Municipal(){}
	   
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
	     
	
	   void placeRoad(){}
	   
	/**
	 * Places a settlement on a vertex
	 * 
	 * @pre ArrayList settlement > 0
	 * @pre A vertex must not be occupied by another settlement
	 * @pre A vertex must be 2 or more borders away from the nearest settlement
	 * @pre player must have 1 brick, 1 wheat, 1 wool, and 1 wood resource cards
	 * 
	 * @post remove settlement from ArrayList settlement 
	 * @post settlement is placed on vertex
	 */
	   void placeSettlement(){}
	   
	/**
	 * Removes a settlement and places a city on the vertex 
	 * 
	 * @pre ArrayList city > 0
	 * @pre current players settlement is on vertex
	 * @pre player must have 2 wheat and 3 ore resource cards
	 * 
	 * @post remove city from ArrayList city
	 * @post city is placed on vertex
	 */
	   void placeCity(){}
}
