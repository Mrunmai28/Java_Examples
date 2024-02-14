package interfaceEx;

public class Sample extends BaseClass implements IOne,ITwo {

	@Override
	public void one() {
		System.out.println("IOne called");
		
	}

	@Override
	public void two() {
		System.out.println("ITwo called");
	}

	@Override
	public void common() {
		System.out.println("Common Called");
	}

}
