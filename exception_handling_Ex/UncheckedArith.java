package exception_handling_Ex;
import java.util.*;
public class UncheckedArith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// String name=null;            // shows NullPointerException --Cannot invoke "String.length()" because "name" is null 
			 String name="23s"; 
			System.out.println(name.length()); //NullpointerExceptionn
			
			//int  i=Integer.parseInt(name);       //NumberFormatException
			
			
			int[] a= {1,2,3};
			System.out.println(a[3]);             //ArrayIndexOutOfBoundsException
		}
		catch(NullPointerException | NumberFormatException | ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
        finally
        {
        	System.out.println("Finished");     //always run if exception is not there still run or exception is there it will run--new concept try resources in file handling
        }
	}

}
