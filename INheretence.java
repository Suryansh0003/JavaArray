package pwnew;
import java.util.*;
class demo1{
	public  demo1() {
	
		System.out.println("Parent class constructor is running");
		
	}
	public demo1(int x,int y) {
		System.out.println("Parent class Parameterized constructor is running");
	}
}
class demo2 extends demo1{
	public demo2() {
		this(10, 30);
		
		
		
		System.out.println("This is child class constructor");
	}
	
	public demo2(int x,int y) {
		
		
		System.out.println("child class parameterized constructor is running");
		
	}
	public void fly() {
		System.out.println("fly");
	}
	
}
public class INheretence {
	public static void main(String[] args) {
		
		
		demo2 d2=new demo2();
		
		
		
		
		
		
		  
	
		
		
		

	}

}
