package test;

public class ExceptionHandeling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			int i = 0;
			
			int j = 10/i;
			
			System.out.println("Hi Rohan");
			
		}catch (ArithmeticException e) { 
	         
	         System.out.println("We can’t divide any number by zero");
	    }
		
		catch (Exception e) {
		 
		     System.out.println("Exception occurred");
		}


		
		
		System.out.println("After Exception");

	}

}
