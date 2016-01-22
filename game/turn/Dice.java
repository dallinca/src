package client.turn;

/**
 * All action methods associated with dice rolls.
 *
 */
public class Dice {
	
	/**
	 * Rolls the game dice.
	 * 
	 * @pre None.
	 * @post Rolls dice and enables players to perform associated action.
	 */
	static void rollDice(){
		
		int roll;
		
		if (roll == 7){
			moveRobber();
			stealResource();
		}
		else assignResources(roll);		
		
	}
	
	/**
	 * Assigns resources to players based on dice result. Robber's location is skipped.
	 * 
	 * @pre diceResult must be an integer between 2 and 12.
	 * @post Resources will be assigned to various players if possible.
	 */
	static void assignResources(int diceResult){
				
	}
	
	/**
	 * Allows player to move robber to any hex of their choosing.
	 * 
	 * @pre None.
	 * @post Robber will be moved to a new hex.
	 * 
	 */
	static void moveRobber(){
						
	}	
	
	/**
	 * Allows player to steal a resource from another player who has settlement adjacent to location of robber.
	 * If no adjacent players have resources or are there are adjacent players, nothing happens.
	 * 
	 * @pre None.
	 * @post Player steals resource from chosen player, or not.
	 * 
	 */
	static void stealResource(){
		
		
	}	
}
