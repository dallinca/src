package game.board;

/**
 * The Board Class is used to store all the information about the game board
 * including the map with its hexes, vertices, edges, and tradeports.
 * 
 * 
 *
 */
public class Board {

	private Hex hexWithRobber;
	
	public Board() {
		// Need to initialize which hex location is starting with the robber (Should be the desert)
	}
	
	/**
	 * Determines Whether the Robber can be moved to the given hex
	 * 
	 * @pre hex must not be null, hex must be a land hex
	 * 
	 * @post Return value is whether the Robber can be moved to the given hex
	 * 
	 */
	public boolean canDoMoveRobberToHex(Hex hex) {
		if(hex.equals(hexWithRobber)) {
			return false;
		}
		return true;
	}
	
	/**
	 * Move the robber 
	 * 
	 * @pre canDoMoveRobber(hex) == true
	 * 
	 * @post hexWithRobber = hex, the Robber has been moved to the new hex
	 */
	public void moveRobberToHex(Hex hex) {
		hexWithRobber.takeRobber();
		hexWithRobber = hex;
		hex.giveRobber();
	}
	
	/**
	 * TODO
	 * 
	 * 
	 * 
	 */
	public boolean canDoPlaceRoadOnEdge() {
		
		return true;
	}

	/**
	 * TODO
	 * 
	 * 
	 * 
	 */
	public void placeRoadOnEdge() {
		
	}

	/**
	 * TODO
	 * 
	 * 
	 * 
	 */
	public boolean canDoPlaceSettlementOnVertex() {
		
		return true;
	}

	/**
	 * TODO
	 * 
	 * 
	 * 
	 */
	public void placeSettlementOnVertex() {
		
	}

	/**
	 * TODO
	 * 
	 * 
	 * 
	 */
	public boolean canDoPlaceCityOnVertex() {
		
		return true;
	}

	/**
	 * TODO
	 * 
	 * 
	 * 
	 */
	public void placeCityOnVertex() {
		
	}
	
	
}
