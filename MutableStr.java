package pwnew;

public class MutableStr {
public static void main(String[] args) {
//final	StringBuffer sc = new StringBuffer("Suryansh");
//	sc.append("_Chourasiya");
////	System.out.println(sc);
//	
//	System.out.println(sc);
	StringBuilder i= new StringBuilder(66);
	
	i.append("Rahul");

	i.trimToSize();
	System.out.println(i.capacity());
	System.out.println(i.reverse());
	

}
}
