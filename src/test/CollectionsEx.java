package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;



public class CollectionsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//creating arraylist
		System.out.println("ArrayList");
		ArrayList<String> city=new ArrayList<String>();  
	
	  city.add("Bangalore");//
	  city.add("Delhi");  
	  city.add("Noida");
	  
	  System.out.println(city);  

	  
	  Stack<String> stack = new Stack<String>();  
	  
	  stack.push("Ayush");  
	  stack.push("Garvit");  
	  stack.push("Amit");  
	  stack.push("Ashish");  
	  stack.push("Garima");  
	  stack.pop();
	  
	  System.out.println(stack);  
	  
	  Iterator<String> itr=stack.iterator();  
	  
	  while(itr.hasNext()){  
		  System.out.println(itr.next());  
	  } 


	}

}
