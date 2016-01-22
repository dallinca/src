package client.turn;

public class Action {
	
	public static void doAction(){
				
		doPurchase();
		doTrade();
		playDevelopmentCard();	
		
	}

	public static void doPurchase(){

		Purchase.purchaseCity();
		Purchase.purchaseDevelopmentCard();
		Purchase.purchaseRoad();
		Purchase.purchaseSettlement();
	}	

	public static void doTrade(){

		//Query whether trade is between bank or player
		Trade.tradeWithBank();
		Trade.tradeWithPlayer();		
	}	

	public static void playDevelopmentCard(){
		
		PlayCard.playBuildRoads();
		PlayCard.playKnight();
		PlayCard.playMonopoly();
		PlayCard.playYearOfPlenty();
		
	}
	
}
