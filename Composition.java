package pwnew;

class student {
	private heart t;

	student(heart t) {// constructor injection

		this.t = t;

	}

	public void setH(heart t) {
		this.t = t;

	}

	public void call2() {
		t.myHeart();

	}

}

class heart {
	public void myHeart() {
		System.out.println("Heart is important");

	}

}

class god { // Constructor injection//
	private powers p;

	god(powers p) {
		this.p = p;

	}

	public void call() {
		p.godPowers();

	}
}

class powers {
	public void godPowers() {
		System.out.println("God has powers");
	}
}

class Composition {
	public static void main(String[] args) {
		powers pp = new powers();
		god g = new god(pp);
		g.call();// Constructor injection call
		heart ht = new heart();
		student std = new student(ht);
		std.setH(ht);

	}
}