package game;

import java.util.ArrayList;

import game.model.*;
import game.player.*;
import game.board.Board;


/**
 * The Game class is essentially a combination of the traditional game class and the bank. It keeps track of how many un-used resource cards and development cards there are.
 * It also handles all transactions a player may make whether through trading or turning in cards after being robbed. 
 * It also keeps track of how many players there are, who is next, and who is the current player.
 */
public class game {
	private Player[] players = null;
	private Player currentPlayer;
	private Player nextPlayer;
	private ResourceCard[] resourceDeck = null;
	private DevelopmentCard[] developmentDeck = null;;
	private Board board;
	private boolean largestArmy;
	private boolean longestRoad;
	private Road[] roads = null;
	private Municipal[] infrastructure = null;
	//a rather comedic name for the Robber don't you think?
	
	/*
	 * For now lets just say the board has the robber, right now you can query which hex
	 * the robber is on
	 */
	//private Robber robbingHood;
	
	
	/**
	 * @pre the player objects passed in are not null, neither is the Board.
	 * 
	 * @param the four player objects to be added to the array.
	 */
	public game(Player one, Player two, Player three, Player four, Board board1) {
		
	}
	
	/**
	 * This method will cycle through the array of players and will rotate them through the currentPlayer so the turns can proceed.
	 * This will be helpful when the index of the player array is [3] and we need to bring it back to [0] showing that that person is next.
	 * @pre the players array is not null
	 * @post the next player is set.
	 */
	public void incrementPlayer() {
		
	}
	
	
	/**
	 * This method may be beneficial in the event of some other aspect of the game asking which player's turn it is. Perhaps whether or not to enable the starting of a trade on a players turn.
	 * 
	 * @pre the game has started and a turn has started. 
	 * 
	 * 
	 * @return the CurrentPlayer object
	 */
	public Player getCurrentPlayer() {
		//return the name of the player or the player object itself?
		//What would be the purpose of sending something a player?
		return null;
	}
	
	/**
	 * Every time a turn starts, this method is called.
	 * 
	 * @pre a turn has started
	 * @post we know who's turn it is.
	 * 
	 */
	public void setCurrentPlayer(Player setPlayer) {
		
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
	public void resourceCardTransaction(Player bankingPlayer, ResourceCard[] toTake, ResourceCard[] toTurnIn) {
		
	}
	
	
	/**
	 * This method will exchange resources between two players who have agreed to trade. This inserts the correct cards into the arraylists of each player
	 * may return an integer signifying it was successful for testing and error handling.
	 * 
	 * @pre: two players that exist, two arrays of type ResourceCard that are not null.
	 * @post
	 * 
	 */	
	public void tradeTransaction(Player one, ResourceCard[] oneToTrade, Player two, ResourceCard[] twoToTrade) {
	
	}
	
	/**
	 * Whenever somebody is taking development cards from the bank, this method is called. 
	 * This method makes the necessary adjustment to the deck, which cards are still in it, and how many total are left.
	 * 
	 * @pre take is postive, less than the amount of remaining development cards in the deck, and that the player object is a real non-bull object
	 * @param int take is a number of the development cards a player is taking
	 * @param Player player is the player purchasing the cards
	 */
	public void developmentCardTransaction(int take, Player player) {
		
	}
	
	/**
	 * This method is responsible for verifying if the game has ended.
	 * 
	 * This method will check after every action if the current player has ten or eleven points. If they do, it returns true.
	 * And then the game is over
	 * 
	 * @pre an action must have just occured (build a road, play a development card, build a city or settlement, etc.)
	 * 
	 * @post a boolean value as to whether or not the game is over
	 */
	public boolean doWeHaveAWinner() {
		return false;
	}
	
	
}
