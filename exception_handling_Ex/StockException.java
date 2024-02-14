package exception_handling_Ex;

// Custom /User Exception example 

public class StockException extends Exception {   //exception is base class for exception

	public StockException(String message) {  // created constructor accept message of string datatype
	   super(message);                      //to pass the message to super class i.e exception
	
	}
	
	
	public static void main(String[] args) {
		

	}

}
