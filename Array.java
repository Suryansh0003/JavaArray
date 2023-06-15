package pwnew;

import javax.swing.text.DefaultEditorKit;

//class add {
//	public int addSum(int[] arr) {
//		int largest = arr[0];
//		for (int i = 1; i < arr.length; i++) {
//			if (arr[i] < largest) {
//				largest = arr[i];
//			}
//		}
//		return largest;
//
//	}
//
//}

public class Array {
	public static void main(String[] args) {
//		add ad = new add();
//		int[] arr = { 200, 25, 55, 23 };
//		int largest = ad.addSum(arr);
//		System.out.println("Largest element of arry is " + largest);

		cadd cd = new cadd();
		pps pd = new pps();
		pd.runs(cd);

	}
}

interface calcu {
	int add(int x, int y);

	int sub(int x, int y);
}
interface calc2 extends calcu{
	public void learn();
	public void write();
	@Override
	default int add(int a ,int b) {
		return a+b;
	}
}
class cadd implements calcu {

	public int add(int x, int y) {
		int c = x + y;
		return c;
	}

	public int sub(int x, int y) {
		System.out.println("hello");
		return x - y;
	}

}

class pps extends cadd {
	public void runs(cadd c) {
		System.out.println(c.add(65, 87));
		System.out.println(c.sub(87, 33));

	}
}
