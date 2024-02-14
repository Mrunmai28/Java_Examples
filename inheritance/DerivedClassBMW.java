package inheritance;

public class DerivedClassBMW extends BaseClassFiat{
	
	void start()
	{
		System.out.println("Start the car");
	}
	
    void stop() 
    {
	System.out.println("Use ABS");	
    }
    
    void ac()
    {
    	System.out.println("Installed");
    }
    
}
