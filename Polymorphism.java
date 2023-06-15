package pwnew;
abstract class moblie{
	abstract public void compony();
	abstract public void name();
	public void price() {
		System.out.println("this price of this phone is "+rupes);
	}
	final int rupes=14000;
	
}
class MobileOrigin extends moblie{
	@Override
	public void compony() {
		System.out.println("origin of phone ...Chinise ");
		
		
		
	
	}
	@Override
	public void name() {
	System.out.println("Name OF Phone ...Realmi");
		
	}
}
class mobileorigin2 extends moblie{
   @Override
public void compony() {
System.out.println("compony origin ..Netherland");
	
}
   @Override
	public void name() {
	System.out.println("phone name is ...Samsung");
	}

	
}
 class polyy{
	public void exe(moblie mm) {
		mm.compony();
		mm.name();
		mm.price();
		System.out.println("_____________________________");
	}
}
public class Polymorphism {

	public static void main(String... args) {

		MobileOrigin m1 =new MobileOrigin();
		mobileorigin2 m2 =new mobileorigin2();
		polyy p=new polyy();
		p.exe(m1);
		p.exe(m2);
	
		
		
		
		
		
	}

}
