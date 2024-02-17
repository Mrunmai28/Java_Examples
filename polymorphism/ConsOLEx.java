package polymorphism;

public class ConsOLEx {             //Constructor is also a special type of function in java and to overload constructor you need to create parameterize constructor

	public ConsOLEx() 
	{
		System.out.println("Constructor default");
	}
	
	public ConsOLEx(int x)    //call constructor with parameter
	{
		System.out.println("with 1 parameter"); 
	}
	public static void main(String[] args) {
		ConsOLEx ob=new ConsOLEx();
		ConsOLEx ob2=new ConsOLEx(5);  //Constructor overloading can have different object to call constructor 

	}

	

}
