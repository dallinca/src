package client;

import shared.communication.results.*;

public class ClientFacade {


	/*
	private LinkedList<ClientState> clientStates;
	private ClientState currentState;

	public ClientState getCurrentState() {
		return currentState;
	}

	public void setCurrentState(ClientState currentState) {
		this.currentState = currentState;
	}*/

	private ClientCommunicator cc;

	ClientFacade(String serverName, int portNumber){
		cc = new ClientCommunicator(serverName, portNumber);
		//	clientStates = new LinkedList<ClientState>();
	}

	ClientFacade(){
		//currentState = null;
		//	clientStates = new LinkedList<ClientState>();
		cc = new ClientCommunicator();		
	}

	public boolean fetchCurrentState(String username){
		return false;
	}

	public PollServer_Result pollServer(){

		PollServer_Result result;

		try {
			
			result = cc.pollServer();
			
		} catch (ClientException e) {
			
			result = new PollServer_Result();
			
			e.printStackTrace();			
		}


		return result;		
	}

	public ValidateUser_Result validateUser(String username, String password) {		

		ValidateUser_Result result; 

		try {

			result = cc.validateUser(username, password);

		} catch (ClientException e) {			
			result = new ValidateUser_Result();

			e.printStackTrace();
		}		

		return result;
	}


}