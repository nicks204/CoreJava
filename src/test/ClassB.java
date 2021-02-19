package test;

public class ClassB {
	
	String myName;
	
	public ClassB() {
		
		System.out.println("Inside Class B constructor");
	}
	
	public ClassB(String Name) {
		
		System.out.println("Inside Class B param constructor");
		System.out.println("Name is: " + Name);
		
		myName = Name;
	}

}
