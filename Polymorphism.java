package pwnew;

class animal {
	public void sleep() {
		System.out.println("animal is sleeping");
	}

	public void eat() {
		System.out.println("Animal is eating");
	}
}

class dog extends animal {
	@Override
	public void sleep() {
		System.out.println("Dog is sleeping");
	}

	public void eat() {
		System.out.println("Dog is eating ");
	}
}

class cat extends animal {
	@Override
	public void sleep() {
		System.out.println("Cat is sleeping ");
	}

	@Override
	
	public void eat() {
		
		System.out.println("Cat is eating ");
	}
	
}
class azuba{
	public void myanimal(animal af) {
		af.eat();
		af.sleep();
		
		System.out.println("___________________________");
	}
}
public class Polymorphism {

	public static void main(String... args) {
//cat ct=new cat();
//dog dg=new dog();
//animal al=new cat();
//animal al2=new dog();


//System.out.println("_______________________________________");
//al.sleep();
//al.eat();
//al2.sleep();
//al2.eat();
//System.out.println("_______________________________________");
//animal af;
//af=dg;
//
//af.eat();
//af.sleep();
//
//af=ct;
//af.eat();
//af.sleep();
		
dog dd=new dog();
cat t=new cat();

azuba az=new azuba();
az.myanimal(dd);
az.myanimal(t);
	}

}
