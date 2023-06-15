package pwnew;
interface animal{
	public void dog();
	public void cat();
	
}
class zoo implements animal{
	public void dog() {
		System.out.println("dog is brak");
		
	}
	public void cat() {
		System.out.println("Cate is meau");
	}
}
public class interfaceClass {
public static void main(String[] args) {
	zoo z = new zoo();
	z.cat();
}
}
