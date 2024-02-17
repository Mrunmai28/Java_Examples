package encapsulation;

public class EncapParaConsEx {

	
	private int a,b;
	
	
	public EncapParaConsEx(int a, int b) {     //instead of creating 2 different function we passed this 2 variable inside the constructor
		super();
		this.a = a;       
		this.b = b;      
	}

  void show()
  {
	  System.out.println(a+" "+b);
  }
	public static void main(String[] args) {
		EncapParaConsEx ob=new EncapParaConsEx(3,4);
		ob.show();
		}                

}
