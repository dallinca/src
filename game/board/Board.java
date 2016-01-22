package game.board;

import game.board.exceptions.*;

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
	 * Move the robber to a specified hex
	 * 
	 * @pre canDoMoveRobber(hex) == true
	 * 
	 * @post hexWithRobber = hex, the Robber has been moved to the new hex,
	 * or MoveRobberException thrown
	 */
	public void moveRobberToHex(Hex hex) throws MoveRobberException {
		if(!canDoMoveRobberToHex(hex)) {
			throw new MoveRobberException("Cannot move robber to given hex");
		}
		hexWithRobber.takeRobber();
		hexWithRobber = hex;
		hex.giveRobber();
	}
	
	/**
	 * Determines whether a specified player's road can be placed on a specified edge
	 * 
	 * @pre road != null, edge != null
	 * 
	 * @post Return value is whether an edge can be placed on the specified edge
	 */
	public boolean canDoPlaceRoadOnEdge(Road road, Edge edge) {
		// should be able to ask the road which player it belongs to
		// road not null, and has player
		// edge not null, and does not have a road
		// edge has an adjacent edge that has a road owned by the player of the road to place
		return true;
	}
	
	/**
	 * Places a road on a specified edge
	 * 
	 * @pre canDoPlaceRoadOnEdge != false,
	 * 
	 * @post road is placed on the specified edge, or PlaceRoadOnEdgeException thrown
	 */
	public void placeRoadOnEdge(Road road, Edge edge) throws PlaceRoadOnEdgeException {
		if(canDoPlaceRoadOnEdge(road, edge) == false) {
			throw new PlaceRoadOnEdgeException("canDoPlaceRoadOnEdge = false");
		}
		// Place the road on the edge
	}

	/**
	 * Determine whether a specified player's settlement can be placed on a specified vertex
	 * 
	 * @pre vertex != null, settlement != null
	 * 
	 * @post Return value is whether the specified settlement can be placed on the specified vertex
	 */
	public boolean canDoPlaceSettlementOnVertex(Settlement settlement, Vertex vertex) {
		// Ideally I should be able to ask the settlement which player it belongs to
		// settlement not null, and has player, and does not already have a vertex
		// vertex not null, and does not have any player's settlement or city
		// vertex does not have an adjacent vertex with any players settlement or city
		// vertex has an adjacent border that has a road owned by the player of the settlement to place
		return true;
	}

	/**
	 * Places a settlement on a specified vertex
	 * 
	 * @pre canDoPlaceSettlementOnVertex != false,  
	 * 
	 * @post settlement is placed on the specified vertex, or PlaceSettlementOnVertexException thrown
	 */
	public void placeSettlementOnVertex(Settlement settlement, Vertex vertex) throws PlaceSettlementOnVertexException {
		if(canDoPlaceSettlementOnVertex(settlement, vertex) == false) {
			throw new PlaceSettlementOnVertexException("canDoPlaceSettlementOnVertex = false");
		}
		// Place the settlement on the vertex
	}
	
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
	 * Determine whether a specified player's city can be placed on a specified vertex
	 * 
	 * @pre vertex != null, city != null
	 * 
	 * @post Return value is whether the city can be placed on the specified vertex
	 */
	public boolean canDoPlaceCityOnVertex(City city, Vertex vertex) {
		// Ideally I should be able to ask the city which player it belongs to
		// city not null, and has player, and does not already have a vertex
		// vertex not null, and has a settlement owned by the same player as the city
		return true;
	}

	/**
	 * Places a city on a specified vertex
	 * 
	 * @pre canDoPlaceCityOnVertex != false,  
	 * 
	 * @post city is placed on the specified vertex, or PlaceCityOnVertexException thrown
	 */
	public void placeCityOnVertex(City city, Vertex vertex) throws PlaceCityOnVertexException {
		if(canDoPlaceCityOnVertex(city, vertex) == false) {
			throw new PlaceCityOnVertexException("canDoPlaceCityOnVertex = false");
		}
		// Place the city on the vertex
	}
	
	
}
