package abstractEx;

public abstract class Employee {           //Abstract method should declared within abstract class
	
	abstract void attendance(); //Mandatory function // Abstract not have body 
	
    abstract void salaryType();  //Abstract method should be compulsory defined by subclass/derived class
    
    void pf()  //Non Abstract function
    {
    	System.out.println("Only for Full Timers");
    }
}
