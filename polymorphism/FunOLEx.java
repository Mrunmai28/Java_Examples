package polymorphism;

public class FunOLEx {

	/*void add(int i) {       //Overloading just need to look to parameter not return type
		i++;
		System.out.println(i);
	}*/
/*	void add(int a,int b) {      //case1--Datatypes of parameter are same but Number of parameter is different
		int c=a+b;
		System.out.println(c);
	}*/
	
	
	/*void add(float c) 
	{                             //case2-Number of parameter is same but datatype of parameter is different
		c++;
		System.out.println(c);
	}*/
	
	
	//case3- Sequence is different 
	void call(int a,float b) {           //case3--datatype of parameter is same and number of parameter is also same but difference is Sequence of parameter  
		System.out.println(a+" "+b);
	}
	void call(float x,int y) {
		System.out.println(x+" "+y);     
     }
	
	//OR
//	int call(float x,int y) {
//		System.out.println(x+" "+y);  
//		return 0;
//	}
//	
	public static void main(String[] args) {
		FunOLEx ob=new FunOLEx(); //create object of class
		// ob.add(3);  //case1
		//ob.add(4,5); //case1//Function overloading can have only one object
     
		//ob.add(9);     //case2
		
		
	  //	ob.call(22,2.3f);
	  //    ob.call(23.3f,22);
		
		
			
		
	}

}


// Function overloading-- function sign- 
// 1. Datatype of parameter
// 2. Number of Parameters
// 3. Sequence of Parameters