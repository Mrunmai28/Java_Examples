package exception_handling_Ex;
import java.util.*;
public class ThrowExample {

	public void eligible(int age) {     //accept integer as input in parameter
		if(age<18)
		{
			throw new ArithmeticException ("Not eligible");      //if input is less than 18 it throw arithmetic excpt
		}else
		{
			System.out.println("eligible");
		}
	}
	
	
	public static void main(String[] args) {
		ThrowExample te=new ThrowExample();    //we create obj bez to call function eligible
		try {
			te.eligible(13);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());   
		}
	}
}
