package Project;

import java.util.Scanner;


	interface MyInterface{
	 public void display();
	   public void display(String name);
	}
	public class Test8 implements MyInterface{
	   String name;
	   public void display() {
	      System.out.println("This is the implementation of the display method");
	   }
	   public void display(String name) {
	      System.out.println("Name: "+name);
	   }
	
	   public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter your name: ");
	      String name = sc.next();

	      Test8 obj = new Test8();
	      obj.display();
	      obj.display(name);
	   }
	
	}


/* Output
Enter your name: 
Suresh
This is the implementation of the display method
Name: Suresh

 */
	
