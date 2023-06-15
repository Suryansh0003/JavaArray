
package pwnew;

import pwnew.As.Bs;

class As {
	public void ll() {
		System.out.println("outher class static method");
	}

static	class Bs {

		public void theClass() {
			System.out.println("This is inner class");
		}
	}
}

public class innerClass {
	public static void main(String[] args) {
		As as = new As();
		As.Bs H = new Bs();
		H.theClass();

	}

}
