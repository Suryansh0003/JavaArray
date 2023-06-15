package pwnew;



interface A{
	public void a1();
default void a2() {
		System.out.println("This is interface class");
	}
public static void summer() {
	System.out.println("This is static method");
}
}
class B implements A{
public void a1() {
	System.out.println("this is the methios ");
}
public static void rain() {
	System.out.println("Its raining");
	
}
}

public class java8Features {
	public static void main(String[] args) {

		B b=new B();
		B.rain();
		b.a1();
		A.summer();
		
		
	}
}
