package encapsulation;     
 
//encapsulation is hiding data- we can access the variable by function
//******* 1. Using First Encapsulation Method Getter and Setter Function********

public class EncapGetSetEx {           
	private int a,b;
	
	
	public static void main(String[] args) {
	EncapGetSetEx ob=new EncapGetSetEx();     
	ob.setA(3);   
	System.out.println(ob.getA());  //call the function to print value
	
	}

//2 fun belongs to A variable
	public int getA() {       //getA helps to return the value of variable A
		return a;
	}

	public void setA(int a) {    //SetA helps to get the value for variable A
		this.a = a; //this.classlevelvariable=functionlevel variable  //this keyword helps me to refer class level variable
	}


	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}

}




//*************Encapsulation is achieve by 2 different ways***************
//1. Using Getter and Setter Method
//2. Using Parameterize Constructor      --springboot will start with this concept

// ********Rule of Encapsulation*******
//1. Your Variable should be Private
//2. Function should be public    
