package exception_handling_Ex;

public class throwsEx {           //throws keyword can work along with the class or along with the function
    
	public void getlen(String name)throws NullPointerException {       //used outside throws bez we need to print something content
		System.out.println(name.length());
	}
	
	public static void main(String[] args) {
		throwsEx i=new throwsEx();
		try {
			i.getlen(null);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
