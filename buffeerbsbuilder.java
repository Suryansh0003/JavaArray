package pwnew;

class demo{
	static int a;
	static int b;
	
	int c;
	int d;
	
	static {
		a=55;
		b=22;
		System.out.println("Control in Static block ");
	}
	{
		c=77;
		d=98;
		System.out.println("Control in NON statin block ");
	}
	static void demo1() {
		System.out.println("The value of static var a is "+a);
		System.out.println("The value of static var b is "+b);
		
	}
	void demo2() {
		System.out.println("The value of NON static var c is "+c);
		System.out.println("The value of NON static var d is "+d);
	
	}
	
}
public class buffeerbsbuilder {
	public static void main(String[] args) {
		demo.demo1();
		demo d = new demo();
		d.demo2();
		
	}

}
