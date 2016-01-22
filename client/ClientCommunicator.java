package client;

import shared.communication.params.*;
import shared.communication.results.*;

/**
 * A class which packages data from a client and sends it through the internet to a server.
 * Receives results from the server.
 * @author jchrisw
 *
 */

public class ClientCommunicator {


	private static String SERVER_HOST;
	private static int SERVER_PORT;
	private static String URL_PREFIX;
	private static final String HTTP_POST = "POST";

	public ClientCommunicator(String serverHost, int serverPort){
		SERVER_HOST = serverHost;
		SERVER_PORT = serverPort;				
		URL_PREFIX = "http://" + SERVER_HOST + ":" + SERVER_PORT;
	}

	public ClientCommunicator(){
		SERVER_HOST = "localhost";
		SERVER_PORT = 39640;				
		URL_PREFIX = "http://" + SERVER_HOST + ":" + SERVER_PORT;
	}		

	/**
	 * Checks if the current user exists in the database.
	 * @param username A string username
	 * @param password A string password
	 * @return ValidateUser_Result
	 * @throws ClientException 
	 */

	public ValidateUser_Result validateUser(String username, String password) throws ClientException	
	{	
		return (ValidateUser_Result)doPost("/ValidateUser", new ValidateUser_Params(username, password));
	}
	
	
	public PollServer_Result pollServer() throws ClientException
	{
		
		return (PollServer_Result)doPost("/PollServer", new PollServer_Params());
	}

	/**
	 * 	Posts data to the server for operation and receives return output.	 
	 * @param url Location to be posted to
	 * @param request Object to be sent by post
	 * @return result object from post.
	 * @throws ClientException 
	 */

	public Object doPost(String urlString, Object request) throws ClientException
	{
		Object result = null;


		return result;		

	}


}