package inheritance;

public class MainClassBD {

	public static void main(String[] args) {
		
/* Start of	Single Inheritance main part
     
      	//Object creation of derived class

		DerivedClassBMW obj=new DerivedClassBMW();
		obj.start();
		obj.stop();
		obj.ac();   
		//able to call non utilised base class function
		obj.seats();  //base class function called   
		
		
	/*	//Optional to understand i.e No neccessary to create object of base class
	
		BaseClassFiat obj1=new BaseClassFiat();
		obj1.start();
		obj1.stop();
		//obj1.ac();                     //Its not possible that base class can access the functionality of child/derived class only derived class can access the functionality of parent/base class.
		obj1.seats();    */
		
		
		/* obj1.stop();//If stop is private in base class & If we tried to call private base function it give compile time error 
		obj1.seats(); */ //seats is protetced in base class and Accessable bez it is in same package or folder
		
		
	//	End of Single Inheritance main part  */
		
		
/*		//Start of MultiLevel Inheritance Main Part
		
		
		MultilevelBMW_Ad obj=new MultilevelBMW_Ad();
		obj.start();       // MultilevelBMW_Ad function called
		obj.stop();                                     //DerivedClassBMW function called
		obj.ac();                                       //DerivedClassBMW function called
		//able to call non utilised base class function
		obj.seats();                                    //BaseClassFiat function called
		obj.roof_Top_Open();    //MultilevelBMW_Ad function called   
		
		*/
		
		//Start of HierarchicalAudi inheritance 
		HierarchicalAudi Hi=new HierarchicalAudi();
		Hi.start();
		Hi.seats();
		
		
	
		
		
	}

}
