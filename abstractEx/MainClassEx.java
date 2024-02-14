package abstractEx;

public class MainClassEx {
           
	// abstract void call();  //Error -The abstract method call in type MainClassEx can only be defined by an abstract class
	
	public static void main(String[] args) {
		
		//Employee ob=new Employee(); // Error -Cannot instantiate the type Employee
	 //Employee m=new Manager(); //Cant access derived class functionality.... creating object of abstract class is possible but instance is not.
	
		
	   Manager m=new Manager();
		m.attendance(); 
		m.salaryType();
	    m.leaveType();
		m.pf();
	}

}
