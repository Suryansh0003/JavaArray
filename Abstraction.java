package pwnew;
abstract class parent{
	abstract public void eat();
	abstract public void sleep();
	
}
class child extends parent{
	@Override
	public void eat() {
		System.out.println("child class");
	}
	@Override
	public void sleep() {
		System.out.println("sleep");
		
	}
}
public class Abstraction {

	public static void main(String[] args) {
	
parent p1=new child();

p1.eat();
p1.sleep();

	}

}
