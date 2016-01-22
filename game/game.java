package game;

import java.util.ArrayList;

import game.player.DCPlayer;
import game.board.ResourceCard;

public class game {
	private DCPlayer[] players = null;
	private DCPlayer currentPlayer;
	private ResourceCard[] resourceDeck = null;
	private DevelopmentCard[] developmentDeck = null;;
	private Board board;
	private boolean largestArmy;
	private boolean longestRoad;
	private Road[] roads = null;
	private Municipal[] infrastructure = null;
	
	//a rather comedic name for the Robber don't you think?
	private Robber robbingHood;
	
	
	/**
	 * @pre the player objects passed in are not null, neither is the Board.
	 * 
	 * @param the four player objects to be added to the array
	 */
	public game(DCPlayer one, DCPlayer two, DCPlayer three, DCPlayer four, Board board1) {
		
	}
	
	/**
	 * This method may be beneficial in the event of some other aspect of the game asking which player's turn it is. Perhaps whether or not to enable the starting of a trade on a players turn.
	 * 
	 * @pre the game has started and a turn has started. 
	 * 
	 * 
	 * @return the CurrentPlayer object
	 */
	public DCPlayer getCurrentPlayer() {
		//return the name of the player or the player object itself?
		//What would be the purpose of sending something a player?
	}
	
	/**
	 * Every time a turn starts, this method is called.
	 * 
	 * @pre a turn has started
	 * 
	 */
	public void setCurrentPlayer(DCPlayer setPlayer) {
		
	}
	
	
	/**
	 * @pre this array is not null, and has 95 Resource cards where it has 19 of each resource.
	 *  
	 * @param an array containing all of the resource cards (96).
	 */
	public void setResourceDeck(ResourceCard[] theResources) {
		
	}
	
	/**
	 * This method might randomize the "cards" in the deck and insert them into the deck for this class.
	 * @pre this array is not null, and has 25 DevelopmentCard objects inside where 14 are Soldiers, 5 are victory point cards, and 2 are year of plenty
	 * and two are road builders. 
	 * 
	 * @param an array of DevelopmentCards that will become the deck.
	 */
	public void setDevelopmentDeck(DevelopmentCard[] arrestedDevelopment) {
		
		//developmentDeck = new DevelopmentCard[arrestDevelopment.length()];
		
		//for (int i = 0; i < arrestedDevelopment.length(); i++) {
		//}
	}

	/**
	 * 
	 * Whenever somebody is receiving or taking resources from the bank, this method is called. 
	 * Whether they are trading them in via a port, or paying them because of the robber, or paying for something.
	 * This method makes the necessary adjustment to the decks, which cards are in them and how many are left.
	 * One of these parameters could be null, for example: turning in cards that were taken by the robber.
	 * 
	 * @pre both of the arrays being passed in are not null, have valid entries, and that the player has the necessary cards he/she is turning in, 
	 * and that the bank has enough cards to hand out.
	 * @param an array of the resource cards that are to be added to the decks: toTurnIn.
	 * @param an array of the resource cards that are to be taken away: toTake.
	 */
	public void resourceCardTransaction(DCPlayer bankingPlayer, ResourceCard[] toTake, ResourceCard[] toTurnIn) {
		
	}
	
	
	/**
	 * This method will exchange resources between two players who have agreed to trade. This inserts the correct cards into the arraylists of each player
	 * may return an integer signifying it was successful for testing and error handling.
	 * 
	 * pre: two players that exist, two arrays of type ResourceCard that are not null.
	 * 
	 */
	public void tradeTransaction(DCPlayer one, ResourceCard[] oneToTrade, DCPlayer two, ResourceCard[] twoToTrade) {
	
	}
	/**
	 * Whenever somebody is taking development cards from the bank, this method is called. 
	 * This method makes the necessary adjustment to the deck, which cards are still in it, and how many total are left.
	 * 
	 * @pre take is postive, less than the amount of remaining development cards in the deck, and that the player object is a real non-bull object
	 * @param int take is a number of the development cards a player is taking
	 * @param Player player is the player purchasing the cards
	 */
	public void developmentCardTransaction(int take, DCPlayer player) {
		
	}
	
	
}
