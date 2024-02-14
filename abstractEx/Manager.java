package abstractEx;

public class Manager extends Employee {

	@Override  //Annotation- called Decorative syntactic-- provide special information to guide the java interpreter during code translation-executable line
	void attendance() {
		System.out.println("8 hrs daily*5 days weekly");
		
	}

	@Override
	void salaryType() {                             
		System.out.println("Monthly basis");
		
	}
	void leaveType() {
		System.out.println("CL,SL applicable");
	}

}
