package pwnew;

import java.util.BitSet;

public class reverseFullArray {
	public static void main(String[] args) {
//		String s1="Hp Leptop";
//		String s2="";
//		String []arr=s1.split(" ");
//		
//		
//		for(String elem:arr) {
//			for(int i=elem.length()-1;i>=0;i--) {
//				
//				s2=s2+elem.charAt(i);
//				
//			}
//			s2=s2+" ";
//			
//		}
//		System.out.print(s2+" ");
		String str1="Madam";
		String str2="";
		str1=str1.toLowerCase();
		
		
		for (int i=str1.length()-1;i>=0;i--) {
			
			str2=str2+str1.charAt(i);
		}
		System.out.println(str2);
		
	if(str1.equals(str2)) {
		System.out.println("its palaindrome");
	}
	else {
		System.out.println("its not palaindrome");
	}
}
}