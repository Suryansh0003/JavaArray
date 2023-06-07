package pwnew;

import java.util.Scanner;

//class reverse {
//	public void rev() {
//		String p = "===sur===";
//		String w = " ";
//		for (int i = p.length() - 1; i > 0; i--) {
//			w = w + p.charAt(i);
//
//		}
//		System.out.println(w);
//
//	}
//
//	public void arrrev() {
//		String s1 = "name my is suryansh";
//		String s2 = " ";
//		String[] sarray = s1.split(" ");
//		for (int i = sarray.length - 1; i >= 0; i--) {
//
//			s2 = s2 + sarray[i]+" ";
//		}
//		System.out.println(s2);
//	}
//}

public class random {
	public static void main(String[] args) {
//		String s1="pwjava";
//		String s2=s1+"skill";
//		String s3=new String ("surya");
//		s3=s3+"skill";
//		System.out.println(s3);
//		System.out.println(s2);
//		reverse r = new reverse();
//		r.arrrev();
//		String v="12345";
////		int num=Integer.parseInt(v);
////		System.out.println(v);
//
		Scanner scanner = new Scanner(System.in);
//		System.out.println("please enter the classes");
//		int classes = scanner.nextInt();
//		System.out.println("Plese enter the student of each class");
//		int students = scanner.nextInt();
		String[][] arrr = new String [3][];
		
		arrr[0]=new String [3];
		arrr[1]=new String [2];
		arrr[2]=new String[4];

		for (int i = 0; i < arrr.length; i++) {
			for (int j = 0; j < arrr[i].length; j++) {
				System.out.println("Please enter the name of" + i+ "Student" + j);
				arrr[i][j] = scanner.nextLine();
			
			}
		}

		System.out.println("The marks of student is blow ");

		for (String[] e : arrr) {
			for (String std : e) {
				System.out.print(std + " ");
			}
			System.out.println();
		}

	}

}
