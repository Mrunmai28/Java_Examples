package exception_handling_Ex;

public class SuperMarket {
       int quantity=10;
       
       void shop(int pur) throws StockException {     //throws customize exception 
    	 quantity=quantity-pur;
    	 if(quantity<=3)
    	 {
    		 throw new StockException("Low Alert");
    	 }
    	 else
    	 {
    		 System.out.println(quantity);
 
    	 }
       }
       
       
	public static void main(String[] args) {
		SuperMarket sm=new SuperMarket();
		try {
			sm.shop(1);
		}
		catch(StockException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
