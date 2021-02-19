package test;

public class FirstClass {
	
	int age;
	String Name;
	float Salary;
			
		
	public void Dispaly() {
		
		System.out.println("Inside Display");
	}
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hellow World");
		
		SecondClass Obj1 = new SecondClass();
		
		Obj1.Show("Rahul");
		
		SecondClass Obj2 = new SecondClass();
		
		Obj2.Show("Manjunath");
		
		Obj2.Calculate();

	}

}