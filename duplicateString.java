package pwnew;

import java.util.Scanner;

abstract class dup{
	abstract public void input();
	abstract public void removeDuplicateString();
	
	public String S1;
	
	public String S2="";
}
class StringRe extends dup{
	@Override
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string you want to remove...");
		S1=sc.next();
		
		
		
	}
	
	@Override
	public void removeDuplicateString() {
//		S1=S1.replace(" ", "");
		for(int i=0;i<S1.length();i++) {
			boolean isDuplicate=false;
			for(int j=i+1;j<S1.length();j++) {
				if(S1.charAt(i)==S1.charAt(j)) {
					System.out.println(S1.charAt(i));
					isDuplicate=true;
					break;
				}
			}
			if(!isDuplicate) {
				
				S2=S2+S1.charAt(i);
			}

			
		}
		
		System.out.print(S2);
	}
				
	

	
}
public class duplicateString {
public static void main(String[] args) {
StringRe e=new StringRe();
e.input();
e.removeDuplicateString();

}
}
