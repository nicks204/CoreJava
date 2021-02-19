package test;

public abstract class ParentClass {
	
	int EmpNo = 101;
	
	public void display() {
		
		System.out.println("Emp NO : " + EmpNo);
	}
	
	public void display(String Name) {
		
		System.out.println("Emp NO : " + Name);
	}
	
	abstract void run() ;
	abstract void horn() ;
	abstract void safety();
	
}
