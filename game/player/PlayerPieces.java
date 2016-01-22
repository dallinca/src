package game.player;

import game.model.*;

import java.util.*;

/**
 * The PlayerPieces class keeps track of a players settlements and cities. 
 * 
 * It has methods for checking if a player has available settlements, cities,
 * or roads for placement
 *
 * Domain:
 * 		ArrayList roads: each player has an array of 15 roads
 * 		ArrayList settlements: each player has an array of 5 settlements
 *		ArrayList cities: each player has an array of 4 cities
 */

public class PlayerPieces {
	
	   private ArrayList<Settlement> settlements;
	   private ArrayList<City> cities;
	   private ArrayList<Road> roads;
	   
	/**
	 * Initializes Municipal
	 * 
	 * @pre A Player object exists
	 * 
	 */
	   PlayerPieces(){}

	 /**
	  * checks if a player has an available road
	  *   
	  * @return boolean
	  */
	   public boolean hasAvailableRoad(){
		   return false;
	   }
	   
	 /**
	  * checks if a player has an available settlement
	  *   
	  * @return boolean
	  */
	   public boolean hasAvailableSettlement(){
		   return false;
	   }
	   
	 /**
	  * checks if a player has an available city
	  *   
	  * @return boolean
	  */
	   public boolean hasAvailableCity(){
		   return false;
	   }
	     

	   
}
