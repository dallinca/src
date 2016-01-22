package game.player;

import java.util.*;

/**
 * The Municipal class keeps track of a players roads, settlements, cities. 
 * It has methods for placing roads, settlements, and cities
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
	 * @post new placeRoad() = 2
	 * @post new placeSettlement() = 2
	 */
	   Municipal(){}  
	   
	/**
	 * Places a road on a border 
	 * 
	 * @pre ArrayList road > 0
	 * @pre a border must not be occupied by another road
	 * @pre player must have 1 brick and 1 wood resource cards
	 * 
	 * @post remove road from ArrayList road
	 * @post road is placed on border
	 */
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
	 * Removes a settlement from it's vertex 
	 * 
	 * @pre A vertex must contain a settlement
	 * 
	 * @post append settlement to ArrayList settlement 
	 * @post settlement removed from vertex
	 */
	   void removeSettlement(){}
	   
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
