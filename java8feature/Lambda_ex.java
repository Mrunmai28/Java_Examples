package java8feature;
//functional interface
interface ILamba
{
	public String fun(String name);
}

public class Lambda_ex {
	   public void call()
	   {
		   System.out.println("call");
	   }
	   
		public static void main(String[] args) {
			
			ILamba i;
			i=(str)-> {
				return str.concat("world");
			};
			   
			   System.out.println(i.fun("Hello "));

		}

	}