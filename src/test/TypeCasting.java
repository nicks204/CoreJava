package test;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//implicit conversion
		System.out.println("Implicit Type Casting");
		
		char a='A';
		System.out.println("Value of a: "+a);

		int b=a;
		System.out.println("Value of b: "+b);
		
		
		
		//explicit conversion
		
		System.out.println("Explicit Type Casting");
		
		
		double x=45.5;
		
		
		int y = (int) x;
		
		
		System.out.println("Value of x: "+x);
		System.out.println("Value of y: "+y);



	}

}
