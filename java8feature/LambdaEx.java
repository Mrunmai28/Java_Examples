package java8feature;
 
interface IName{
	public void tellName();
}
public class LambdaEx {


	public static void main(String[] args) {
		//Structure for lambda 
		IName ob= ()->{
			System.out.println("Mrunmai");
			
		};
		ob.tellName();
				
				
	}
}
