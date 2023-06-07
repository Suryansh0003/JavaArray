package pwnew;



public class Panagram {
	public static void main(String[] args) {
		boolean flag=false;
		String b1 = "THE QUICK BROWN FOX JUMPS OVER LAZY DOG";
		b1 = b1.replace(" ", "");

		char[] ar5 = b1.toCharArray();

		int[] ar6 = new int[26];

		for (int i = 0; i < ar5.length; i++) {

			ar6[ar5[i] - 'A']++;//<<<we can all use 'A'rather then 65 bcz A value is 65 so we only use 'A'>>>
		}

		for (int i = 0; i < ar6.length; i++) {
			if (ar6[i] == 0) {
				System.out.println("this is not an pangram ");
				flag=true;
			}
			
		
		}
		if (flag==false) {//<<we also use  (!flag)rather then (flag==false)>>
			System.out.println("this is an angram ");
			
		}
		}

	}


