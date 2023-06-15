package pwnew;

import java.util.Scanner;

class farmerr {
	int pa;
	float td;
	float si;
	static float ri;

	static {
		ri = 4.2f;

	}

	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount");
		pa = sc.nextInt();
		System.out.println("Enter time duration");
		td=sc.nextFloat();
		

	}
	void compute() {
		si=(pa*ri*td)/100;
	}
	void disp() {
		System.out.println("si="+si);
	}
}

class practiceclass {
	public static void main(String[] args) {
		farmerr f= new farmerr();
		f.input();
		f.compute();
		f.disp();
	}
}