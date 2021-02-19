package test;

import java.io.IOException;

public class ThrowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThrowsExample obj = new ThrowsExample();
		
		try {
			obj.m1();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Excpetion Occured");
		}
		

	}
	
	public void m1() throws IOException {
		
		int age =11;
		
		if(age<18) { 
			
			throw new IOException("not valid"); 
		}
		else {
			System.out.println("welcome to vote");  
		} 
	}
	


}
