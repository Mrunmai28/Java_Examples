package inheritance;

//class without main function is called POJO class (plain old java object)

public class BaseClassFiat {
	//Helps to start car
	void start()
	{
		System.out.println("Use key to start car");
	}
	
	//Helps to stop car
   private void stop() {
		System.out.println("Use break to stop the car");
	}

	//No. of seats Available in car
	 protected void seats()
	{
		System.out.println("Driver+Rider=1+5");
	}
}

