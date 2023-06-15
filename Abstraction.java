package pwnew;



abstract class parent {
	abstract public void eat();

	abstract public void sleep();
	
}

class child extends parent {
	@Override
	public void eat() {
		System.out.println("child class");
	}

	@Override
	public void sleep() {
		System.out.println("sleep");

	}
	
}
class child2 extends parent{
	public  void sleep() {
		System.out.println("child 2 is sleeping");
	}
	@Override
	public void eat() {
	System.out.println("Eating child");
	}
}
class child3 extends parent{
	@Override
	public void sleep() {
	System.out.println("sleper boyfrom child3");
		
	}
	@Override
	public void eat() {
		System.out.println("Eater boy");
		
	}
	public void wakeup(){
		System.out.println("Boy is wakeup now");
	}
}
public class Abstraction {

	public static void main(String[] args) {

		parent p1 = new child3();

		p1.eat();
		p1.sleep();
		
//		parent p2=new child3();
//		((child3) p2).wakeup();
	

	}

}
